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

import static de.creativecouple.validation.isbn.Hyphens.isUnicodeHyphen;

final class Parser {

    static ISBN parse(String isbnString) {
        if (isbnString == null || isbnString.isEmpty()) {
            return null;
        }
        final char[] isbn = new char[13];
        final int to = isbnString.length() - 1;
        int pos = 0;
        if (isNoDigit(isbn[0] = isbnString.charAt(pos++)) || pos > to
                || (isNoDigit(isbn[1] = isbnString.charAt(pos++))
                        && (!isUnicodeHyphen(isbn[1]) || pos > to || isNoDigit(isbn[1] = isbnString.charAt(pos++))))
                || pos > to
                || (isNoDigit(isbn[2] = isbnString.charAt(pos++))
                        && (!isUnicodeHyphen(isbn[2]) || pos > to || isNoDigit(isbn[2] = isbnString.charAt(pos++))))
                || pos > to
                || (isNoDigit(isbn[3] = isbnString.charAt(pos++))
                        && (!isUnicodeHyphen(isbn[3]) || pos > to || isNoDigit(isbn[3] = isbnString.charAt(pos++))))
                || pos > to
                || (isNoDigit(isbn[4] = isbnString.charAt(pos++))
                        && (!isUnicodeHyphen(isbn[4]) || pos > to || isNoDigit(isbn[4] = isbnString.charAt(pos++))))
                || pos > to
                || (isNoDigit(isbn[5] = isbnString.charAt(pos++))
                        && (!isUnicodeHyphen(isbn[5]) || pos > to || isNoDigit(isbn[5] = isbnString.charAt(pos++))))
                || pos > to
                || (isNoDigit(isbn[6] = isbnString.charAt(pos++))
                        && (!isUnicodeHyphen(isbn[6]) || pos > to || isNoDigit(isbn[6] = isbnString.charAt(pos++))))
                || pos > to
                || (isNoDigit(isbn[7] = isbnString.charAt(pos++))
                        && (!isUnicodeHyphen(isbn[7]) || pos > to || isNoDigit(isbn[7] = isbnString.charAt(pos++))))
                || pos > to
                || (isNoDigit(isbn[8] = isbnString.charAt(pos++))
                        && (!isUnicodeHyphen(isbn[8]) || pos > to || isNoDigit(isbn[8] = isbnString.charAt(pos++))))
                || (/* ISBN-10 hyphen */ pos + 1 == to && !isUnicodeHyphen(isbnString.charAt(pos++)))) {
            return null;
        }
        if (pos == to) { // ISBN-10 last digit
            final char ch = isbnString.charAt(pos);
            if (isNeitherDigitNorX(ch)) {
                return null;
            }
            isbn[9] = (char) Math.min('9' + 1, ch);
            convertIsbn10To13(isbn);
            return verifyRangeAndChecksum(isbn);
        }
        return pos > to
                || (isNoDigit(isbn[9] = isbnString.charAt(pos++))
                        && (!isUnicodeHyphen(isbn[9]) || pos > to || isNoDigit(isbn[9] = isbnString.charAt(pos++))))
                || pos > to
                || (isNoDigit(isbn[10] = isbnString.charAt(pos++))
                        && (!isUnicodeHyphen(isbn[10]) || pos > to || isNoDigit(isbn[10] = isbnString.charAt(pos++))))
                || pos > to
                || (isNoDigit(isbn[11] = isbnString.charAt(pos++))
                        && (!isUnicodeHyphen(isbn[11]) || pos > to || isNoDigit(isbn[11] = isbnString.charAt(pos++))))
                || (pos + 1 == to && !isUnicodeHyphen(isbnString.charAt(pos++))) || pos != to
                || isNoDigit(isbn[12] = isbnString.charAt(pos)) ? null : verifyRangeAndChecksum(isbn);
    }

    private static boolean isNoDigit(char ch) {
        return (char) (ch - '0') >= 10;
    }

    private static boolean isNeitherDigitNorX(char ch) {
        return isNoDigit(ch) && (char) (ch & 0xffdf) != 'X';
    }

    private static void convertIsbn10To13(char[] isbn) {
        int checksum10 = (10 * isbn[0] + 9 * isbn[1] + 8 * isbn[2] + 7 * isbn[3] + 6 * isbn[4] + 5 * isbn[5]
                + 4 * isbn[6] + 3 * isbn[7] + 2 * isbn[8] + isbn[9]) % 11;
        isbn[12] = (char) ('0' + Math.min(9, checksum10) + (10 - ('9' + '8' + isbn[1] + isbn[3] + isbn[5] + isbn[7]
                + '0' + 3 * ('7' + isbn[0] + isbn[2] + isbn[4] + isbn[6] + isbn[8])) % 10) % 10);
        for (int x = 8; x >= 0; x--) {
            isbn[x + 3] = isbn[x];
        }
        isbn[2] = '8';
        isbn[1] = '7';
        isbn[0] = '9';
    }

    private static ISBN verifyRangeAndChecksum(char[] isbn) {
        Hyphenation hyphenation = ISBNRanges.ranges[isbn[0]][isbn[1]][isbn[2]][isbn[3]][isbn[4]][isbn[5]][isbn[6]][isbn[7]][isbn[8]][isbn[9]][isbn[10]][isbn[11]][isbn[12]];
        return hyphenation == null ? null : new ISBN(new String(isbn), hyphenation);
    }

}
