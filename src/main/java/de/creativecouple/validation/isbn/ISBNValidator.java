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

import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * The ISBNValidator class represents a combination of rules for the desired ISBN length (10 or 13) and hyphenation
 * style (any, none, correct, correct-or-none), for checking input strings. <br/>
 * E.g. {@code myValidator = ISBNValidator.isbn13().hyphenation(NONE)} to validate compact ISBN-13 string only.
 *
 * @see ISBNValidatorBuilder.HyphenationOption
 *
 * @author Peter Liske (CreativeCouple)
 */
public final class ISBNValidator implements Predicate<String> {

    ISBNValidator(BiFunction<String, ISBN, Boolean> inputCheck) {
        this.inputCheck = inputCheck;
    }

    private final BiFunction<String, ISBN, Boolean> inputCheck;

    /**
     * Checks whether a given string passes this validator's criteria.
     *
     * @return whether ot not the input string is valid
     */
    @Override
    public boolean test(String isbnString) {
        ISBN isbn = Parser.parse(isbnString);
        return isbn != null && inputCheck.apply(isbnString, isbn);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof ISBNValidator && inputCheck.equals(((ISBNValidator) obj).inputCheck);
    }

    @Override
    public int hashCode() {
        return inputCheck.hashCode();
    }

    /**
     * Parses a given string input and returns an ISBN object, if it matches this validator's criteria.
     *
     * @param input the string to evaluate
     * @return the ISBN object
     *
     * @throws IllegalArgumentException
     *             if the input is invalid according to this validator
     */
    public ISBN parse(String input) {
        ISBN isbn = Parser.parse(input);
        if (isbn == null || !inputCheck.apply(input, isbn)) {
            throw new IllegalArgumentException("invalid input: '" + input + "'");
        }
        return isbn;
    }

    /**
     * @return a builder object for validating both ISBN-10 and ISBN-13 strings
     */
    public static ISBNValidatorBuilder anyIsbn() {
        return new ISBNValidatorBuilder(0);
    }

    /**
     * @return a builder object for validating ISBN-10 strings only
     */
    public static ISBNValidatorBuilder isbn10() {
        return new ISBNValidatorBuilder(10);
    }

    /**
     * @return a builder object for validating ISBN-13 strings only
     */
    public static ISBNValidatorBuilder isbn13() {
        return new ISBNValidatorBuilder(13);
    }
}