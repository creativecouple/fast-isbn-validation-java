package de.creativecouple.validation.isbn;

import java.util.function.BiFunction;

/**
 * Builder class to build an ISBNValidator object. <br/>
 * Usage e.g.: {@code myValidator = ISBNValidator.isbn13().hyphenation(NONE)}
 *
 * @author Peter Liske (CreativeCouple)
 */
public final class ISBNValidatorBuilder {

    /**
     * Options for handling hyphenation in ISBN strings.
     * <ul>
     * <li>ANY matches all kinds of hyphenation, even wrong hyphenation.</li>
     * <li>CORRECT matches only well-hyphenated ISBNs with respect to prefix/group/publisher/title/checkdigit.</li>
     * <li>NONE matches only compact ISBN strings, without any hyphenation.</li>
     * <li>CORRECT_OR_NONE matches both well-hyphenated and compact ISBN strings.</li>
     * </ul>
     */
    public enum HyphenationOption {
        /**
         * ANY matches all kinds of hyphenation, even wrong hyphenation.
         */
        ANY,
        /**
         * CORRECT matches only well-hyphenated ISBNs with respect to prefix/group/publisher/title/checkdigit.
         */
        CORRECT,
        /**
         * NONE matches only compact ISBN strings, without any hyphenation.
         */
        NONE,
        /**
         * CORRECT_OR_NONE matches both well-hyphenated and compact ISBN strings.
         */
        CORRECT_OR_NONE
    }

    private final int isbnLength;

    ISBNValidatorBuilder(Integer isbnLength) {
        this.isbnLength = isbnLength;
    }

    /**
     * Builds an ISBNValidation object with the given hyphenation style.
     *
     * @param option
     *            the hyphenation style to validate for
     *
     * @return the ISBN validator object
     */
    public ISBNValidator hyphenation(HyphenationOption option) {
        switch (option) {
        case CORRECT:
            switch (isbnLength) {
            case 13:
                return new ISBNValidator(ISBN13_HYPHENATED);
            case 10:
                return new ISBNValidator(ISBN10_HYPHENATED);
            default:
                return new ISBNValidator(ANY_ISBN_HYPHENATED);
            }
        case NONE:
            switch (isbnLength) {
            case 13:
                return new ISBNValidator(ISBN13_COMPACT);
            case 10:
                return new ISBNValidator(ISBN10_COMPACT);
            default:
                return new ISBNValidator(ANY_ISBN_COMPACT);
            }
        case CORRECT_OR_NONE:
            switch (isbnLength) {
            case 13:
                return new ISBNValidator(ISBN13_HYPHENATED_OR_COMPACT);
            case 10:
                return new ISBNValidator(ISBN10_HYPHENATED_OR_COMPACT);
            default:
                return new ISBNValidator(ANY_ISBN_HYPHENATED_OR_COMPACT);
            }
        default:
            switch (isbnLength) {
            case 13:
                return new ISBNValidator(ISBN13);
            case 10:
                return new ISBNValidator(ISBN10);
            default:
                return new ISBNValidator(ANY_ISBN);
            }
        }
    }

    private static final BiFunction<String, ISBN, Boolean> ANY_ISBN = (string, isbn) -> {
        return true;
    };

    private static final BiFunction<String, ISBN, Boolean> ANY_ISBN_HYPHENATED = (string, isbn) -> {
        if (string.length() == 17) {
            return isbn.toString().equals(string);
        }
        return string.length() == 13 && isbn.getPrefix().equals("978")
                && string.startsWith(isbn.getGroup() + "-" + isbn.getPublisher() + "-" + isbn.getTitle() + "-");
    };

    private static final BiFunction<String, ISBN, Boolean> ANY_ISBN_COMPACT = (string, isbn) -> {
        if (string.length() == 13) {
            return isbn.toCompactString().equals(string);
        }
        return string.length() == 10 && isbn.getPrefix().equals("978")
                && string.startsWith(isbn.getGroup() + isbn.getPublisher() + isbn.getTitle());
    };
    private static final BiFunction<String, ISBN, Boolean> ANY_ISBN_HYPHENATED_OR_COMPACT = (string, isbn) -> {
        return ANY_ISBN_HYPHENATED.apply(string, isbn) || ANY_ISBN_COMPACT.apply(string, isbn);
    };

    private static final BiFunction<String, ISBN, Boolean> ISBN13 = (string, isbn) -> {
        return countDigits(string) == 13;
    };

    private static final BiFunction<String, ISBN, Boolean> ISBN13_HYPHENATED = (string, isbn) -> {
        return isbn.toString().equals(string);
    };

    private static final BiFunction<String, ISBN, Boolean> ISBN13_COMPACT = (string, isbn) -> {
        return isbn.toCompactString().equals(string);
    };
    private static final BiFunction<String, ISBN, Boolean> ISBN13_HYPHENATED_OR_COMPACT = (string, isbn) -> {
        return ISBN13_HYPHENATED.apply(string, isbn) || ISBN13_COMPACT.apply(string, isbn);
    };

    private static final BiFunction<String, ISBN, Boolean> ISBN10 = (string, isbn) -> {
        return countDigits(string) == 10;
    };

    private static final BiFunction<String, ISBN, Boolean> ISBN10_HYPHENATED = (string, isbn) -> {
        return string.length() == 13 && isbn.getPrefix().equals("978")
                && string.startsWith(isbn.getGroup() + "-" + isbn.getPublisher() + "-" + isbn.getTitle() + "-");
    };

    private static final BiFunction<String, ISBN, Boolean> ISBN10_COMPACT = (string, isbn) -> {
        return string.length() == 10;
    };
    private static final BiFunction<String, ISBN, Boolean> ISBN10_HYPHENATED_OR_COMPACT = (string, isbn) -> {
        return ISBN10_HYPHENATED.apply(string, isbn) || ISBN10_COMPACT.apply(string, isbn);
    };

    private static int countDigits(CharSequence input) {
        int result = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            char ch = input.charAt(i);
            if ((ch >= '0' && ch <= '9') || ch == 'x' || ch == 'X') {
                result++;
            }
        }
        return result;
    }

}
