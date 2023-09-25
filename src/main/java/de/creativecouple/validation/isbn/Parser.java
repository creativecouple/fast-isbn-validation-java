/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2022 CreativeCouple
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.creativecouple.validation.isbn;

import de.creativecouple.validation.isbn.ISBN.Hyphenation;

final class Parser {

    static ISBN parse(String isbnString) {
        if (isbnString == null || isbnString.isEmpty()) {
            return null;
        }
        char[] isbn = new char[13];
        int to = isbnString.length() - 1;
        int i = 0;
        {
            char ch = isbnString.charAt(i++);
            if (ch < '0' || ch > '9') {
                return null;
            }
            isbn[0] = ch;
        }
        for (int pos = 1; pos < 9; pos++) {
            char ch = isbnString.charAt(i++);
            if (ch < '0' || ch > '9') {
                if (ch == '-' || ch == '_' || ch == '–' || ch == '—' || ch == '−') {
                    ch = isbnString.charAt(i++);
                    if (ch < '0' || ch > '9') {
                        return null;
                    }
                } else {
                    return null;
                }
            }
            isbn[pos] = ch;
        }
        int charsPos = 1;
        for (int i = 1; i < to; i++) {
            ch = isbnString.charAt(i);
            isbn[charsPos] = ch > '9' ? 0 : ch;
            if (ch != '-' && ch != '_' && ch != '–' && ch != '—' && ch != '−') {
                // remove all unicode dashes (0x2d, 0x2013, 0x2014, 0x2212)
                if (++charsPos >= 13) {
                    return null;
                }
            }
        }
        ch = isbnString.charAt(to);
        if (charsPos == 12) {
            isbn[12] = ch > '9' ? 0 : ch;
        } else if (charsPos != 9 || ch < '0' || (ch > '9' && ch != 'x' && ch != 'X')) {
            return null;
        } else {
            isbn[9] = (char) Math.min('9' + 1, ch);
            convertIsbn10To13(isbn);
        }
        Hyphenation hyphenation = ISBNRanges.ranges[isbn[0]][isbn[1]][isbn[2]][isbn[3]][isbn[4]][isbn[5]][isbn[6]][isbn[7]][isbn[8]][isbn[9]][isbn[10]][isbn[11]][isbn[12]];
        return hyphenation == null ? null : new ISBN(new String(isbn), hyphenation);
    }

    private static void convertIsbn10To13(char[] isbn) {
        int checksum10 = (10 * isbn[0] + 9 * isbn[1] + 8 * isbn[2] + 7 * isbn[3] + 6 * isbn[4] + 5 * isbn[5] + 4 * isbn[6] + 3 * isbn[7] + 2 * isbn[8] + isbn[9]) % 11;
        isbn[12] = (char) ('0' + Math.min(9, checksum10) + (10 - ('9' + '8' + isbn[1] + isbn[3] + isbn[5] + isbn[7] + '0' + 3 * ('7' + isbn[0] + isbn[2] + isbn[4] + isbn[6] + isbn[8])) % 10) % 10);
        for (int x = 8; x >= 0; x--) {
            isbn[x + 3] = isbn[x];
        }
        isbn[2] = '8';
        isbn[1] = '7';
        isbn[0] = '9';
    }

}
