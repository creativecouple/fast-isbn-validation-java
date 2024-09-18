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
package net.creativecouple.validation.isbn;

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
     * @param option the hyphenation style to validate for
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

    private static final BiFunction<String, ISBN, Boolean> ANY_ISBN = (string, isbn) -> true;

    private static final BiFunction<String, ISBN, Boolean> ANY_ISBN_HYPHENATED =
            (string, isbn) -> string.length() == 17 ? isbn.toString().equals(string) :
                    string.length() == 13 && isbn.getPrefix().equals("978")
                    && string.startsWith(isbn.getGroup() + "-" + isbn.getPublisher() + "-" + isbn.getTitle() + "-");

    private static final BiFunction<String, ISBN, Boolean> ANY_ISBN_COMPACT = (string, isbn) ->
            string.length() == 13 ? isbn.toCompactString().equals(string) :
                    string.length() == 10 && isbn.getPrefix().equals("978")
                    && string.startsWith(isbn.getGroup() + isbn.getPublisher() + isbn.getTitle());
    private static final BiFunction<String, ISBN, Boolean> ANY_ISBN_HYPHENATED_OR_COMPACT = (string, isbn) ->
            ANY_ISBN_HYPHENATED.apply(string, isbn) || ANY_ISBN_COMPACT.apply(string, isbn);

    private static final BiFunction<String, ISBN, Boolean> ISBN13 = (string, isbn) ->
            countDigits(string) == 13;

    private static final BiFunction<String, ISBN, Boolean> ISBN13_HYPHENATED = (string, isbn) ->
            isbn.toString().equals(string);

    private static final BiFunction<String, ISBN, Boolean> ISBN13_COMPACT = (string, isbn) ->
            isbn.toCompactString().equals(string);
    private static final BiFunction<String, ISBN, Boolean> ISBN13_HYPHENATED_OR_COMPACT = (string, isbn) ->
            ISBN13_HYPHENATED.apply(string, isbn) || ISBN13_COMPACT.apply(string, isbn);

    private static final BiFunction<String, ISBN, Boolean> ISBN10 = (string, isbn) ->
            countDigits(string) == 10;

    private static final BiFunction<String, ISBN, Boolean> ISBN10_HYPHENATED = (string, isbn) ->
            string.length() == 13 && isbn.getPrefix().equals("978")
            && string.startsWith(isbn.getGroup() + "-" + isbn.getPublisher() + "-" + isbn.getTitle() + "-");

    private static final BiFunction<String, ISBN, Boolean> ISBN10_COMPACT = (string, isbn) ->
            string.length() == 10;
    private static final BiFunction<String, ISBN, Boolean> ISBN10_HYPHENATED_OR_COMPACT = (string, isbn) ->
            ISBN10_HYPHENATED.apply(string, isbn) || ISBN10_COMPACT.apply(string, isbn);

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
