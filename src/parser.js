const {hyphens, ranges, agencies} = require("./isbnRanges.json");
const removeDashes = /[\u2013\u2014\u2212_-]/g;

/**
 * @param {string} isbnString
 * @return {ISBN|false|null|undefined}
 */
function parse(isbnString) {
    const isbn = isbnString.replaceAll(removeDashes, '');
    if (isbn.length === 13) {
        return parseIsbn13(isbn);
    } else if (isbn.length === 10) {
        return parseIsbn10(isbn);
    }
}

function parseIsbn13(isbn) {
    let range = ranges, sum13 = 0;
    for (let i = 0, weight13 = 1; i < 13; i++, weight13 ^= 2) {
        const nr = isbn.charCodeAt(i) - 48;
        if (nr < 0 || nr > 9) {
            return;
        }
        sum13 += nr * weight13;
        if (typeof range === 'object') {
            range = range[nr];
        }
    }
    if ((sum13 % 10) !== 0) {
        return false;
    }
    const hyphenation = range != null ? hyphens[range] : null;
    return hyphenation && new ISBN(isbn, hyphens[range]);
}

function parseIsbn10(isbn) {
    let range = ranges[9][7][8], sum13 = 8, sum10 = 0;
    for (let i = 0, weight13 = 3, weight10 = 10; i < 10; i++, weight13 ^= 2, weight10--) {
        let nr = isbn.charCodeAt(i) - 48;
        if (nr < 0 || nr > 9) {
            if (i === 9 && (nr === 40 || nr === 72)) {
                nr = 10;
            } else {
                return;
            }
        }
        if (i < 9) {
            sum13 += nr * weight13;
        }
        sum10 += nr * weight10;
        if (typeof range === 'object') {
            range = range[nr];
        }
    }
    if ((sum10 % 11) !== 0) {
        return false;
    }
    const hyphenation = range && hyphens[range];
    isbn = "978" + isbn.substring(0, 9) + String.fromCharCode(48 + (10 - (sum13 % 10)) % 10);
    return hyphenation && new ISBN(isbn, hyphens[range]);
}

class ISBN {
    constructor(isbn, parts) {
        this._isbn = isbn;
        this._parts = parts;
    }

    get prefix() {
        return this._isbn.substring(0, this._parts[0]);
    }

    get group() {
        return this._isbn.substring(this._parts[0], this._parts[1]);
    }

    get groupPrefix() {
        return `${this.prefix}-${this.group}`;
    }

    get groupName() {
        return agencies[this.groupPrefix];
    }

    get publisher() {
        return this._isbn.substring(this._parts[1], this._parts[2]);
    }

    get publisherPrefix() {
        return `${this.prefix}-${this.group}-${this.publisher}`;
    }

    get title() {
        return this._isbn.substring(this._parts[2], 12);
    }

    get checkdigit() {
        return this._isbn[12];
    }

    get isbn() {
        return `${this.prefix}-${this.group}-${this.publisher}-${this.title}-${this.checkdigit}`;
    }

    get compact() {
        return this._isbn;
    }

    toString() {
        return this.isbn;
    }

}

module.exports = {parse};
