package de.creativecouple.validation.isbn;

import java.util.function.BiFunction;

public final class ISBNValidatorBuilder {

    public enum HyphenationOption {
        ANY, CORRECT, NONE, CORRECT_OR_NONE
    }

    private final int isbnLength;

    ISBNValidatorBuilder(Integer isbnLength) {
        this.isbnLength = isbnLength;
    }

    ISBNValidator hyphenation(HyphenationOption option) {
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
                return new ISBNValidator(or(ISBN13_HYPHENATED, ISBN13_COMPACT));
            case 10:
                return new ISBNValidator(or(ISBN10_HYPHENATED, ISBN10_COMPACT));
            default:
                return new ISBNValidator(or(ANY_ISBN_HYPHENATED, ANY_ISBN_COMPACT));
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

    private static final BiFunction<String, ISBN, Boolean> ANY_ISBN = (string, isbn) -> true;

    private static final BiFunction<String, ISBN, Boolean> ANY_ISBN_HYPHENATED = (string,
            isbn) -> string.length() == 17 ? isbn.toString().equals(string) : string.length() == 13
                    && isbn.getPrefix().equals("978")
                    && string.startsWith(isbn.getGroup() + "-" + isbn.getPublisher() + "-" + isbn.getTitle() + "-");

    private static final BiFunction<String, ISBN, Boolean> ANY_ISBN_COMPACT = (string, isbn) -> string.length() == 13
            ? isbn.toCompactString().equals(string) : string.length() == 10 && isbn.getPrefix().equals("978")
                    && string.startsWith(isbn.getGroup() + isbn.getPublisher() + isbn.getTitle());

    private static final BiFunction<String, ISBN, Boolean> ISBN13 = (string, isbn) -> countDigits(string) == 13;

    private static final BiFunction<String, ISBN, Boolean> ISBN13_HYPHENATED = (string, isbn) -> isbn.toString()
            .equals(string);

    private static final BiFunction<String, ISBN, Boolean> ISBN13_COMPACT = (string, isbn) -> isbn.toCompactString()
            .equals(string);

    private static final BiFunction<String, ISBN, Boolean> ISBN10 = (string, isbn) -> countDigits(string) == 10;

    private static final BiFunction<String, ISBN, Boolean> ISBN10_HYPHENATED = (string, isbn) -> string.length() == 13
            && isbn.getPrefix().equals("978")
            && string.startsWith(isbn.getGroup() + "-" + isbn.getPublisher() + "-" + isbn.getTitle() + "-");

    private static final BiFunction<String, ISBN, Boolean> ISBN10_COMPACT = (string, isbn) -> string.length() == 10;

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

    private static <T, U> BiFunction<T, U, Boolean> or(BiFunction<T, U, Boolean> first,
            BiFunction<T, U, Boolean> second) {
        return (t, u) -> first.apply(t, u) || second.apply(t, u);
    }

}
