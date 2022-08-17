package de.creativecouple.validation.isbn;

class ISBNParser {

    private long remainingValue;
    private int currentValue;
    private int remainingDigits = 12;
    char checkDigit;
    String prefix, group, publisher, title;
    private Range[] rule = ISBNRanges.ROOT;

    private static final long[] decimals = { 1L, 10L, 100L, 1_000L, 10_000L, 100_000L, 1_000_000L, 10_000_000L,
            100_000_000L, 1_000_000_000L, 10_000_000_000L, 100_000_000_000L, 1_000_000_000_000L, 10_000_000_000_000L };

    ISBNParser parse(String isbn) {
        isbn = isbn.trim().replace("-", "");
        switch (isbn.length()) {
        case 10:
            validateChecksum10(isbn);
            break;
        case 13:
            validateChecksum13(isbn);
            break;
        default:
            throw new NumberFormatException("ISBN has wrong length");
        }
        this.prefix = applyNextRule();
        this.group = applyNextRule();
        this.publisher = applyLastRule();
        this.title = valueToString(remainingValue, remainingDigits);
        return this;
    }

    private Range matchNextRange() {
        for (Range range : rule) {
            long div = decimals[remainingDigits - range.width];
            int value = (int) (remainingValue / div);
            if (value <= range.upper) {
                if (value < range.lower) {
                    throw new NumberFormatException("group range not assigned");
                }
                this.currentValue = value;
                this.remainingValue %= div;
                this.remainingDigits -= range.width;
                return range;
            }
        }
        throw new NumberFormatException("group range not assigned");
    }

    private String applyNextRule() {
        Range range = matchNextRange();
        this.rule = range.rules[currentValue - range.lower];
        if (rule == null) {
            throw new NumberFormatException("group range not assigned");
        }
        return valueToString(currentValue, range.width);
    }

    private String applyLastRule() {
        Range range = matchNextRange();
        return valueToString(currentValue, range.width);
    }

    private void validateChecksum10(CharSequence isbn10) {
        int sum = 0;
        long value = 978000000000L;
        for (int i = 0, weight = 10; i < 10; i++, weight--) {
            char chr = isbn10.charAt(i);
            int digit = chr - 48;
            if (digit < 0 || digit > 9) {
                if (i == 9 && (digit == 40 || digit == 72)) {
                    digit = 10;
                } else {
                    throw new NumberFormatException("invalid character");
                }
            }
            if (i < 9) {
                value += decimals[8 - i] * digit;
            }
            sum += weight * digit;
        }
        if (sum % 11 != 0) {
            throw new NumberFormatException("checksum error");
        }
        this.remainingValue = value;
        this.checkDigit = (char) (calculateCheckDigit(value) + 48);
    }

    private void validateChecksum13(CharSequence isbn13) {
        int sum = 0;
        long value = 0L;
        for (int i = 0, weight = 1; i < 13; i++, weight ^= 2) {
            char chr = isbn13.charAt(i);
            int digit = chr - 48;
            if (digit < 0 || digit > 9) {
                throw new NumberFormatException("invalid character");
            }
            sum += weight * digit;
            if (i < 12) {
                value += decimals[11 - i] * digit;
            } else {
                this.checkDigit = chr;
            }
        }
        if (sum % 10 != 0) {
            throw new NumberFormatException("checksum error");
        }
        this.remainingValue = value;
    }

    private static int calculateCheckDigit(long value) {
        int sum = 0;
        for (int i = 0, weight = 3; i < 12; i++, weight ^= 2, value /= 10) {
            sum += weight * (value % 10);
        }
        return (10 - (sum % 10)) % 10;
    }

    private static String valueToString(long value, int width) {
        char[] chars = new char[width];
        for (int i = width - 1; i >= 0; i--, value /= 10) {
            chars[i] = (char) (value % 10 + 48);
        }
        return new String(chars);
    }

}
