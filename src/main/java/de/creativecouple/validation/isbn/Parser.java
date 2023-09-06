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
        final char[] isbn = normalizeDashes(isbnString);
        if (isbn == null) {
            return null;
        }
        Hyphenation hyphenation = isbn[10] == 0 ? validateChecksum10AndHyphenation(isbn)
                : validateChecksum13AndHyphenation(isbn);
        return hyphenation == null ? null : new ISBN(new String(isbn), hyphenation);
    }

    private static char[] normalizeDashes(CharSequence string) {
        char[] chars = new char[13];
        char firstChar = string.charAt(0);
        if (firstChar < '0' || firstChar > '9') {
            return null;
        }
        chars[0] = firstChar;
        int charsPos = 1;
        int to = string.length() - 1;
        for (int i = 1; i < to; i++) {
            if (charsPos >= 13) {
                return null;
            }
            char ch = string.charAt(i);
            if (ch >= '0' && ch <= '9') {
                chars[charsPos++] = ch;
            } else if (ch != '-' && ch != '_' && ch != '–' && ch != '—' && ch != '−') {
                // remove all unicode dashes (0x2d, 0x2013, 0x2014, 0x2212)
                return null;
            }
        }
        char lastChar = string.charAt(to);
        if (charsPos == 9) {
            if (lastChar == 'x' || lastChar == 'X') {
                chars[9] = '9' + 1;
                return chars;
            }
            if (lastChar >= '0' && lastChar <= '9') {
                chars[9] = lastChar;
                return chars;
            }
            return null;
        }
        if (charsPos == 12 && lastChar >= '0' && lastChar <= '9') {
            chars[12] = lastChar;
            return chars;
        }
        return null;
    }

    private static Hyphenation validateChecksum10AndHyphenation(char[] isbn) {
        int a = isbn[0];
        int b = isbn[1];
        int c = isbn[2];
        int d = isbn[3];
        int e = isbn[4];
        int f = isbn[5];
        int g = isbn[6];
        int h = isbn[7];
        int i = isbn[8];
        int j = isbn[9];

        isbn[12] = (char) ('0' + (10 - ('9' + '8' + b + d + f + h + '0' + 3 * ('7' + a + c + e + g + i)) % 10) % 10);
        for (int x = 8; x >= 0; x--) {
            isbn[x + 3] = isbn[x];
        }
        isbn[2] = '8';
        isbn[1] = '7';
        isbn[0] = '9';

        return (10 * a + 9 * b + 8 * c + 7 * d + 6 * e + 5 * f + 4 * g + 3 * h + 2 * i + j) % 11 == 0
                ? ISBNRanges.ranges['9']['7']['8'][a][b][c][d][e][f][g][h] : null;
    }

    private static Hyphenation validateChecksum13AndHyphenation(char[] isbn) {
        int a = isbn[0];
        int b = isbn[1];
        int c = isbn[2];
        int d = isbn[3];
        int e = isbn[4];
        int f = isbn[5];
        int g = isbn[6];
        int h = isbn[7];
        int i = isbn[8];
        int j = isbn[9];
        int k = isbn[10];
        int m = isbn[11];
        int n = isbn[12];
        return (a + c + e + g + i + k + n + 3 * (b + d + f + h + j + m)) % 10 == 0
                ? ISBNRanges.ranges[a][b][c][d][e][f][g][h][i][j][k] : null;
    }

}
