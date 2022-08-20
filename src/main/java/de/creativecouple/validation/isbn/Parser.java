package de.creativecouple.validation.isbn;

final class Parser {

    private static final long[] decimals = { 1_000_000_000_000L, 100_000_000_000L, 10_000_000_000L, 1_000_000_000L,
            100_000_000L, 10_000_000L, 1_000_000L, 100_000L, 10_000L, 1_000L, 100L, 10L, 1L };

    static ISBN parse(String isbnString) {
        if (isbnString == null) {
            return null;
        }
        final char[] isbn = normalizeDashes(isbnString);
        if (isbn == null) {
            return null;
        }

        final long longValue;

        if (isbn[10] < '0') {
            longValue = validateChecksum10(isbn);
            if (longValue <= 0) {
                return null;
            }
            convertToIsbn13(isbn, longValue);
        } else {
            longValue = validateChecksum13(isbn);
            if (longValue <= 0) {
                return null;
            }
        }

        final Range prefixRange = findRange(longValue, ISBNRanges.ROOT);
        if (prefixRange == null || prefixRange.rules == null) {
            return null;
        }
        final int prefixEnd = prefixRange.width;

        final Range[] groupRule = prefixRange.rules[(int) ((longValue - prefixRange.lower) / decimals[prefixEnd])];
        if (groupRule == null) {
            return null;
        }

        final Range groupRange = findRange(longValue, groupRule);
        if (groupRange == null || groupRange.rules == null) {
            return null;
        }
        final int groupEnd = prefixEnd + groupRange.width;

        final Range[] publisherRule = groupRange.rules[(int) ((longValue - groupRange.lower) / decimals[groupEnd])];
        if (publisherRule == null) {
            return null;
        }

        final Range publisherRange = findRange(longValue, publisherRule);
        if (publisherRange == null) {
            return null;
        }
        final int publisherEnd = groupEnd + publisherRange.width;

        return new ISBN(new String(isbn, 0, prefixRange.width), new String(isbn, prefixEnd, groupRange.width),
                new String(isbn, groupEnd, publisherRange.width), new String(isbn, publisherEnd, 12 - publisherEnd),
                isbn[12]);
    }

    private static void convertToIsbn13(char[] isbn, long longValue) {
        isbn[12] = (char) (calculateCheckDigit(longValue) + 48);
        for (int i = 8; i >= 0; i--) {
            isbn[i + 3] = isbn[i];
        }
        isbn[2] = '8';
        isbn[1] = '7';
        isbn[0] = '9';
    }

    private static char[] normalizeDashes(CharSequence string) {
        char[] chars = new char[13];
        int charsPos = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == '-' || ch == '_' || ch == '\u2013' || ch == '\u2014' || ch == '\u2212') {
                // remove all unicode dashes (0x2d, 0x2013, 0x2014, 0x2212)
                continue;
            }
            if (ch != 'x' && ch != 'X' && (ch < '0' || ch > '9')) {
                // accept ISBN chars only
                return null;
            }
            if (charsPos >= 13) {
                return null;
            }
            chars[charsPos++] = ch;
        }
        return charsPos == 10 || charsPos == 13 ? chars : null;
    }

    private static Range findRange(long longValue, Range[] rule) {
        for (Range range : rule) {
            if (longValue <= range.upper) {
                return longValue < range.lower ? null : range;
            }
        }
        return null;
    }

    private static long validateChecksum10(char[] isbn10) {
        int sum = 0;
        long value = 978L;
        for (int i = 0, weight = 10; i < 10; i++, weight--) {
            char chr = isbn10[i];
            int digit = chr - 48;
            if (digit < 0 || digit > 9) {
                if (i == 9 && (digit == 40 || digit == 72)) {
                    digit = 10;
                } else {
                    return -1;
                }
            }
            if (i < 9) {
                value = value * 10 + digit;
            }
            sum += weight * digit;
        }
        return sum % 11 == 0 ? value : -1;
    }

    private static long validateChecksum13(char[] isbn13) {
        int sum = 0;
        long value = 0L;
        for (int i = 0, weight = 1; i < 13; i++, weight ^= 2) {
            char chr = isbn13[i];
            int digit = chr - 48;
            if (digit < 0 || digit > 9) {
                return -1;
            }
            sum += weight * digit;
            if (i < 12) {
                value = value * 10 + digit;
            }
        }
        return sum % 10 == 0 ? value : -1;
    }

    static int calculateCheckDigit(long value) {
        int sum = 0;
        for (int i = 0, weight = 3; i < 12; i++, weight ^= 2, value /= 10) {
            sum += weight * (int) (value % 10L);
        }
        return (10 - (sum % 10)) % 10;
    }

}
