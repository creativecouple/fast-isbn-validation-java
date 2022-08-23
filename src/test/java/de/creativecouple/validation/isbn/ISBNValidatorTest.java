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

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static de.creativecouple.validation.isbn.ISBNValidatorBuilder.HyphenationOption.ANY;
import static de.creativecouple.validation.isbn.ISBNValidatorBuilder.HyphenationOption.CORRECT;
import static de.creativecouple.validation.isbn.ISBNValidatorBuilder.HyphenationOption.CORRECT_OR_NONE;
import static de.creativecouple.validation.isbn.ISBNValidatorBuilder.HyphenationOption.NONE;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ISBNValidatorTest {

    public static final String BLANK = " ";
    public static final String TEN_DIGITS_NO_ISBN = "9X7654321X";
    public static final String THIRTEEN_DIGITS_NO_ISBN = "9876543210987";
    public static final String ISBN13_TOO_MANY_HYPHENS = "9-780-6--399635-4-9--";
    public static final String ISBN13_TOO_FEW_HYPHENS = "978-0639963549";
    public static final String ISBN13_CORRECT_HYPHENATION = "978-0-6399635-4-9";
    public static final String ISBN13_WRONG_HYPHENATION = "978-0-63996-354-9";
    public static final String ISBN13_NO_HYPHENS = "9780639963549";
    public static final String ISBN13_UNICODE_DASHES = "_9780-6\u2013\u201439__9635-4-9\u2212-";
    public static final String ISBN10_TOO_MANY_HYPHENS = "3-94--718-834-X-";
    public static final String ISBN10_TOO_FEW_HYPHENS = "3-94718834X";
    public static final String ISBN10_CORRECT_HYPHENATION = "3-947188-34-X";
    public static final String ISBN10_WRONG_HYPHENATION = "3-9471-8834-X";
    public static final String ISBN10_NO_HYPHENS = "394718834X";
    public static final String ISBN10_UNICODE_DASHES = "_3-94\u2013\u2014718__834\u2212X-";

    @Test
    void testAnyIsbnIgnoringHyphenation() {
        ISBNValidator validator = ISBNValidator.anyIsbn().hyphenation(ANY);

        assertThat(validator).isNotNull();
        assertThat(validator.test(null)).isFalse();
        assertThat(validator.test(BLANK)).isFalse();
        assertThat(validator.test(TEN_DIGITS_NO_ISBN)).isFalse();
        assertThat(validator.test(THIRTEEN_DIGITS_NO_ISBN)).isFalse();

        assertThat(validator.test(ISBN13_TOO_MANY_HYPHENS)).isTrue();
        assertThat(validator.test(ISBN13_TOO_FEW_HYPHENS)).isTrue();
        assertThat(validator.test(ISBN13_CORRECT_HYPHENATION)).isTrue();
        assertThat(validator.test(ISBN13_WRONG_HYPHENATION)).isTrue();
        assertThat(validator.test(ISBN13_NO_HYPHENS)).isTrue();
        assertThat(validator.test(ISBN13_UNICODE_DASHES)).isTrue();

        assertThat(validator.test(ISBN10_TOO_MANY_HYPHENS)).isTrue();
        assertThat(validator.test(ISBN10_TOO_FEW_HYPHENS)).isTrue();
        assertThat(validator.test(ISBN10_CORRECT_HYPHENATION)).isTrue();
        assertThat(validator.test(ISBN10_WRONG_HYPHENATION)).isTrue();
        assertThat(validator.test(ISBN10_NO_HYPHENS)).isTrue();
        assertThat(validator.test(ISBN10_UNICODE_DASHES)).isTrue();
    }

    @Test
    void parseAnyIsbnIgnoringHyphenation() {
        ISBNValidator validator = ISBNValidator.anyIsbn().hyphenation(ANY);

        assertThat(validator).isNotNull();
        assertThatThrownBy(() -> validator.parse(null)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(BLANK)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(TEN_DIGITS_NO_ISBN)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(THIRTEEN_DIGITS_NO_ISBN)).isInstanceOf(IllegalArgumentException.class);

        assertThat(validator.parse(ISBN13_TOO_MANY_HYPHENS)).isNotNull();
        assertThat(validator.parse(ISBN13_TOO_FEW_HYPHENS)).isNotNull();
        assertThat(validator.parse(ISBN13_CORRECT_HYPHENATION)).isNotNull();
        assertThat(validator.parse(ISBN13_WRONG_HYPHENATION)).isNotNull();
        assertThat(validator.parse(ISBN13_NO_HYPHENS)).isNotNull();
        assertThat(validator.parse(ISBN13_UNICODE_DASHES)).isNotNull();

        assertThat(validator.parse(ISBN10_TOO_MANY_HYPHENS)).isNotNull();
        assertThat(validator.parse(ISBN10_TOO_FEW_HYPHENS)).isNotNull();
        assertThat(validator.parse(ISBN10_CORRECT_HYPHENATION)).isNotNull();
        assertThat(validator.parse(ISBN10_WRONG_HYPHENATION)).isNotNull();
        assertThat(validator.parse(ISBN10_NO_HYPHENS)).isNotNull();
        assertThat(validator.parse(ISBN10_UNICODE_DASHES)).isNotNull();
    }

    @Test
    void testAnyIsbnCheckingHyphenation() {
        ISBNValidator validator = ISBNValidator.anyIsbn().hyphenation(CORRECT);

        assertThat(validator).isNotNull();
        assertThat(validator.test(null)).isFalse();
        assertThat(validator.test(BLANK)).isFalse();
        assertThat(validator.test(TEN_DIGITS_NO_ISBN)).isFalse();
        assertThat(validator.test(THIRTEEN_DIGITS_NO_ISBN)).isFalse();

        assertThat(validator.test(ISBN13_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_CORRECT_HYPHENATION)).isTrue();
        assertThat(validator.test(ISBN13_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN13_NO_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_UNICODE_DASHES)).isFalse();

        assertThat(validator.test(ISBN10_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_CORRECT_HYPHENATION)).isTrue();
        assertThat(validator.test(ISBN10_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN10_NO_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_UNICODE_DASHES)).isFalse();
    }

    @Test
    void parseAnyIsbnCheckingHyphenation() {
        ISBNValidator validator = ISBNValidator.anyIsbn().hyphenation(CORRECT);

        assertThat(validator).isNotNull();
        assertThatThrownBy(() -> validator.parse(null)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(BLANK)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(TEN_DIGITS_NO_ISBN)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(THIRTEEN_DIGITS_NO_ISBN)).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> validator.parse(ISBN13_TOO_MANY_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_TOO_FEW_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThat(validator.parse(ISBN13_CORRECT_HYPHENATION)).isNotNull();
        assertThatThrownBy(() -> validator.parse(ISBN13_WRONG_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_NO_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_UNICODE_DASHES)).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> validator.parse(ISBN10_TOO_MANY_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_TOO_FEW_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThat(validator.parse(ISBN10_CORRECT_HYPHENATION)).isNotNull();
        assertThatThrownBy(() -> validator.parse(ISBN10_WRONG_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_NO_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_UNICODE_DASHES)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void testAnyIsbnWithoutHyphenation() {
        ISBNValidator validator = ISBNValidator.anyIsbn().hyphenation(NONE);

        assertThat(validator).isNotNull();
        assertThat(validator.test(null)).isFalse();
        assertThat(validator.test(BLANK)).isFalse();
        assertThat(validator.test(TEN_DIGITS_NO_ISBN)).isFalse();
        assertThat(validator.test(THIRTEEN_DIGITS_NO_ISBN)).isFalse();

        assertThat(validator.test(ISBN13_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_CORRECT_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN13_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN13_NO_HYPHENS)).isTrue();
        assertThat(validator.test(ISBN13_UNICODE_DASHES)).isFalse();

        assertThat(validator.test(ISBN10_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_CORRECT_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN10_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN10_NO_HYPHENS)).isTrue();
        assertThat(validator.test(ISBN10_UNICODE_DASHES)).isFalse();
    }

    @Test
    void parseAnyIsbnWithoutHyphenation() {
        ISBNValidator validator = ISBNValidator.anyIsbn().hyphenation(NONE);

        assertThat(validator).isNotNull();
        assertThatThrownBy(() -> validator.parse(null)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(BLANK)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(TEN_DIGITS_NO_ISBN)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(THIRTEEN_DIGITS_NO_ISBN)).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> validator.parse(ISBN13_TOO_MANY_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_TOO_FEW_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_CORRECT_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_WRONG_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThat(validator.parse(ISBN13_NO_HYPHENS)).isNotNull();
        assertThatThrownBy(() -> validator.parse(ISBN13_UNICODE_DASHES)).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> validator.parse(ISBN10_TOO_MANY_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_TOO_FEW_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_CORRECT_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_WRONG_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThat(validator.parse(ISBN10_NO_HYPHENS)).isNotNull();
        assertThatThrownBy(() -> validator.parse(ISBN10_UNICODE_DASHES)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void testAnyIsbnCorrectOrNoHyphenation() {
        ISBNValidator validator = ISBNValidator.anyIsbn().hyphenation(CORRECT_OR_NONE);

        assertThat(validator).isNotNull();
        assertThat(validator.test(null)).isFalse();
        assertThat(validator.test(BLANK)).isFalse();
        assertThat(validator.test(TEN_DIGITS_NO_ISBN)).isFalse();
        assertThat(validator.test(THIRTEEN_DIGITS_NO_ISBN)).isFalse();

        assertThat(validator.test(ISBN13_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_CORRECT_HYPHENATION)).isTrue();
        assertThat(validator.test(ISBN13_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN13_NO_HYPHENS)).isTrue();
        assertThat(validator.test(ISBN13_UNICODE_DASHES)).isFalse();

        assertThat(validator.test(ISBN10_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_CORRECT_HYPHENATION)).isTrue();
        assertThat(validator.test(ISBN10_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN10_NO_HYPHENS)).isTrue();
        assertThat(validator.test(ISBN10_UNICODE_DASHES)).isFalse();
    }

    @Test
    void parseAnyIsbnCorrectOrNoHyphenation() {
        ISBNValidator validator = ISBNValidator.anyIsbn().hyphenation(CORRECT_OR_NONE);

        assertThat(validator).isNotNull();
        assertThatThrownBy(() -> validator.parse(null)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(BLANK)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(TEN_DIGITS_NO_ISBN)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(THIRTEEN_DIGITS_NO_ISBN)).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> validator.parse(ISBN13_TOO_MANY_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_TOO_FEW_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThat(validator.parse(ISBN13_CORRECT_HYPHENATION)).isNotNull();
        assertThatThrownBy(() -> validator.parse(ISBN13_WRONG_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThat(validator.parse(ISBN13_NO_HYPHENS)).isNotNull();
        assertThatThrownBy(() -> validator.parse(ISBN13_UNICODE_DASHES)).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> validator.parse(ISBN10_TOO_MANY_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_TOO_FEW_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThat(validator.parse(ISBN10_CORRECT_HYPHENATION)).isNotNull();
        assertThatThrownBy(() -> validator.parse(ISBN10_WRONG_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThat(validator.parse(ISBN10_NO_HYPHENS)).isNotNull();
        assertThatThrownBy(() -> validator.parse(ISBN10_UNICODE_DASHES)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void testIsbn13IgnoringHyphenation() {
        ISBNValidator validator = ISBNValidator.isbn13().hyphenation(ANY);

        assertThat(validator).isNotNull();
        assertThat(validator.test(null)).isFalse();
        assertThat(validator.test(BLANK)).isFalse();
        assertThat(validator.test(TEN_DIGITS_NO_ISBN)).isFalse();
        assertThat(validator.test(THIRTEEN_DIGITS_NO_ISBN)).isFalse();

        assertThat(validator.test(ISBN13_TOO_MANY_HYPHENS)).isTrue();
        assertThat(validator.test(ISBN13_TOO_FEW_HYPHENS)).isTrue();
        assertThat(validator.test(ISBN13_CORRECT_HYPHENATION)).isTrue();
        assertThat(validator.test(ISBN13_WRONG_HYPHENATION)).isTrue();
        assertThat(validator.test(ISBN13_NO_HYPHENS)).isTrue();
        assertThat(validator.test(ISBN13_UNICODE_DASHES)).isTrue();

        assertThat(validator.test(ISBN10_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_CORRECT_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN10_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN10_NO_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_UNICODE_DASHES)).isFalse();
    }

    @Test
    void parseIsbn13IgnoringHyphenation() {
        ISBNValidator validator = ISBNValidator.isbn13().hyphenation(ANY);

        assertThat(validator).isNotNull();
        assertThatThrownBy(() -> validator.parse(null)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(BLANK)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(TEN_DIGITS_NO_ISBN)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(THIRTEEN_DIGITS_NO_ISBN)).isInstanceOf(IllegalArgumentException.class);

        assertThat(validator.parse(ISBN13_TOO_MANY_HYPHENS)).isNotNull();
        assertThat(validator.parse(ISBN13_TOO_FEW_HYPHENS)).isNotNull();
        assertThat(validator.parse(ISBN13_CORRECT_HYPHENATION)).isNotNull();
        assertThat(validator.parse(ISBN13_WRONG_HYPHENATION)).isNotNull();
        assertThat(validator.parse(ISBN13_NO_HYPHENS)).isNotNull();
        assertThat(validator.parse(ISBN13_UNICODE_DASHES)).isNotNull();

        assertThatThrownBy(() -> validator.parse(ISBN10_TOO_MANY_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_TOO_FEW_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_CORRECT_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_WRONG_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_NO_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_UNICODE_DASHES)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void testIsbn13CheckingHyphenation() {
        ISBNValidator validator = ISBNValidator.isbn13().hyphenation(CORRECT);

        assertThat(validator).isNotNull();
        assertThat(validator.test(null)).isFalse();
        assertThat(validator.test(BLANK)).isFalse();
        assertThat(validator.test(TEN_DIGITS_NO_ISBN)).isFalse();
        assertThat(validator.test(THIRTEEN_DIGITS_NO_ISBN)).isFalse();

        assertThat(validator.test(ISBN13_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_CORRECT_HYPHENATION)).isTrue();
        assertThat(validator.test(ISBN13_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN13_NO_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_UNICODE_DASHES)).isFalse();

        assertThat(validator.test(ISBN10_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_CORRECT_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN10_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN10_NO_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_UNICODE_DASHES)).isFalse();
    }

    @Test
    void parseIsbn13CheckingHyphenation() {
        ISBNValidator validator = ISBNValidator.isbn13().hyphenation(CORRECT);

        assertThat(validator).isNotNull();
        assertThatThrownBy(() -> validator.parse(null)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(BLANK)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(TEN_DIGITS_NO_ISBN)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(THIRTEEN_DIGITS_NO_ISBN)).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> validator.parse(ISBN13_TOO_MANY_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_TOO_FEW_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThat(validator.parse(ISBN13_CORRECT_HYPHENATION)).isNotNull();
        assertThatThrownBy(() -> validator.parse(ISBN13_WRONG_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_NO_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_UNICODE_DASHES)).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> validator.parse(ISBN10_TOO_MANY_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_TOO_FEW_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_CORRECT_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_WRONG_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_NO_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_UNICODE_DASHES)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void testIsbn13WithoutHyphenation() {
        ISBNValidator validator = ISBNValidator.isbn13().hyphenation(NONE);

        assertThat(validator).isNotNull();
        assertThat(validator.test(null)).isFalse();
        assertThat(validator.test(BLANK)).isFalse();
        assertThat(validator.test(TEN_DIGITS_NO_ISBN)).isFalse();
        assertThat(validator.test(THIRTEEN_DIGITS_NO_ISBN)).isFalse();

        assertThat(validator.test(ISBN13_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_CORRECT_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN13_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN13_NO_HYPHENS)).isTrue();
        assertThat(validator.test(ISBN13_UNICODE_DASHES)).isFalse();

        assertThat(validator.test(ISBN10_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_CORRECT_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN10_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN10_NO_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_UNICODE_DASHES)).isFalse();
    }

    @Test
    void parseIsbn13WithoutHyphenation() {
        ISBNValidator validator = ISBNValidator.isbn13().hyphenation(NONE);

        assertThat(validator).isNotNull();
        assertThatThrownBy(() -> validator.parse(null)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(BLANK)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(TEN_DIGITS_NO_ISBN)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(THIRTEEN_DIGITS_NO_ISBN)).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> validator.parse(ISBN13_TOO_MANY_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_TOO_FEW_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_CORRECT_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_WRONG_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThat(validator.parse(ISBN13_NO_HYPHENS)).isNotNull();
        assertThatThrownBy(() -> validator.parse(ISBN13_UNICODE_DASHES)).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> validator.parse(ISBN10_TOO_MANY_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_TOO_FEW_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_CORRECT_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_WRONG_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_NO_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_UNICODE_DASHES)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void testIsbn13CorrectOrNoHyphenation() {
        ISBNValidator validator = ISBNValidator.isbn13().hyphenation(CORRECT_OR_NONE);

        assertThat(validator).isNotNull();
        assertThat(validator.test(null)).isFalse();
        assertThat(validator.test(BLANK)).isFalse();
        assertThat(validator.test(TEN_DIGITS_NO_ISBN)).isFalse();
        assertThat(validator.test(THIRTEEN_DIGITS_NO_ISBN)).isFalse();

        assertThat(validator.test(ISBN13_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_CORRECT_HYPHENATION)).isTrue();
        assertThat(validator.test(ISBN13_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN13_NO_HYPHENS)).isTrue();
        assertThat(validator.test(ISBN13_UNICODE_DASHES)).isFalse();

        assertThat(validator.test(ISBN10_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_CORRECT_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN10_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN10_NO_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_UNICODE_DASHES)).isFalse();
    }

    @Test
    void parseIsbn13CorrectOrNoHyphenation() {
        ISBNValidator validator = ISBNValidator.isbn13().hyphenation(CORRECT_OR_NONE);

        assertThat(validator).isNotNull();
        assertThatThrownBy(() -> validator.parse(null)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(BLANK)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(TEN_DIGITS_NO_ISBN)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(THIRTEEN_DIGITS_NO_ISBN)).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> validator.parse(ISBN13_TOO_MANY_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_TOO_FEW_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThat(validator.parse(ISBN13_CORRECT_HYPHENATION)).isNotNull();
        assertThatThrownBy(() -> validator.parse(ISBN13_WRONG_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThat(validator.parse(ISBN13_NO_HYPHENS)).isNotNull();
        assertThatThrownBy(() -> validator.parse(ISBN13_UNICODE_DASHES)).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> validator.parse(ISBN10_TOO_MANY_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_TOO_FEW_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_CORRECT_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_WRONG_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_NO_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_UNICODE_DASHES)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void testIsbn10IgnoringHyphenation() {
        ISBNValidator validator = ISBNValidator.isbn10().hyphenation(ANY);

        assertThat(validator).isNotNull();
        assertThat(validator.test(null)).isFalse();
        assertThat(validator.test(BLANK)).isFalse();
        assertThat(validator.test(TEN_DIGITS_NO_ISBN)).isFalse();
        assertThat(validator.test(THIRTEEN_DIGITS_NO_ISBN)).isFalse();

        assertThat(validator.test(ISBN13_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_CORRECT_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN13_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN13_NO_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_UNICODE_DASHES)).isFalse();

        assertThat(validator.test(ISBN10_TOO_MANY_HYPHENS)).isTrue();
        assertThat(validator.test(ISBN10_TOO_FEW_HYPHENS)).isTrue();
        assertThat(validator.test(ISBN10_CORRECT_HYPHENATION)).isTrue();
        assertThat(validator.test(ISBN10_WRONG_HYPHENATION)).isTrue();
        assertThat(validator.test(ISBN10_NO_HYPHENS)).isTrue();
        assertThat(validator.test(ISBN10_UNICODE_DASHES)).isTrue();
    }

    @Test
    void parseIsbn10IgnoringHyphenation() {
        ISBNValidator validator = ISBNValidator.isbn10().hyphenation(ANY);

        assertThat(validator).isNotNull();
        assertThatThrownBy(() -> validator.parse(null)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(BLANK)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(TEN_DIGITS_NO_ISBN)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(THIRTEEN_DIGITS_NO_ISBN)).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> validator.parse(ISBN13_TOO_MANY_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_TOO_FEW_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_CORRECT_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_WRONG_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_NO_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_UNICODE_DASHES)).isInstanceOf(IllegalArgumentException.class);

        assertThat(validator.parse(ISBN10_TOO_MANY_HYPHENS)).isNotNull();
        assertThat(validator.parse(ISBN10_TOO_FEW_HYPHENS)).isNotNull();
        assertThat(validator.parse(ISBN10_CORRECT_HYPHENATION)).isNotNull();
        assertThat(validator.parse(ISBN10_WRONG_HYPHENATION)).isNotNull();
        assertThat(validator.parse(ISBN10_NO_HYPHENS)).isNotNull();
        assertThat(validator.parse(ISBN10_UNICODE_DASHES)).isNotNull();
    }

    @Test
    void testIsbn10CheckingHyphenation() {
        ISBNValidator validator = ISBNValidator.isbn10().hyphenation(CORRECT);

        assertThat(validator).isNotNull();
        assertThat(validator.test(null)).isFalse();
        assertThat(validator.test(BLANK)).isFalse();
        assertThat(validator.test(TEN_DIGITS_NO_ISBN)).isFalse();
        assertThat(validator.test(THIRTEEN_DIGITS_NO_ISBN)).isFalse();

        assertThat(validator.test(ISBN13_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_CORRECT_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN13_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN13_NO_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_UNICODE_DASHES)).isFalse();

        assertThat(validator.test(ISBN10_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_CORRECT_HYPHENATION)).isTrue();
        assertThat(validator.test(ISBN10_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN10_NO_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_UNICODE_DASHES)).isFalse();
    }

    @Test
    void parseIsbn10CheckingHyphenation() {
        ISBNValidator validator = ISBNValidator.isbn10().hyphenation(CORRECT);

        assertThat(validator).isNotNull();
        assertThatThrownBy(() -> validator.parse(null)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(BLANK)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(TEN_DIGITS_NO_ISBN)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(THIRTEEN_DIGITS_NO_ISBN)).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> validator.parse(ISBN13_TOO_MANY_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_TOO_FEW_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_CORRECT_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_WRONG_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_NO_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_UNICODE_DASHES)).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> validator.parse(ISBN10_TOO_MANY_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_TOO_FEW_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThat(validator.parse(ISBN10_CORRECT_HYPHENATION)).isNotNull();
        assertThatThrownBy(() -> validator.parse(ISBN10_WRONG_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_NO_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_UNICODE_DASHES)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void testIsbn10WithoutHyphenation() {
        ISBNValidator validator = ISBNValidator.isbn10().hyphenation(NONE);

        assertThat(validator).isNotNull();
        assertThat(validator.test(null)).isFalse();
        assertThat(validator.test(BLANK)).isFalse();
        assertThat(validator.test(TEN_DIGITS_NO_ISBN)).isFalse();
        assertThat(validator.test(THIRTEEN_DIGITS_NO_ISBN)).isFalse();

        assertThat(validator.test(ISBN13_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_CORRECT_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN13_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN13_NO_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_UNICODE_DASHES)).isFalse();

        assertThat(validator.test(ISBN10_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_CORRECT_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN10_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN10_NO_HYPHENS)).isTrue();
        assertThat(validator.test(ISBN10_UNICODE_DASHES)).isFalse();
    }

    @Test
    void parseIsbn10WithoutHyphenation() {
        ISBNValidator validator = ISBNValidator.isbn10().hyphenation(NONE);

        assertThat(validator).isNotNull();
        assertThatThrownBy(() -> validator.parse(null)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(BLANK)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(TEN_DIGITS_NO_ISBN)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(THIRTEEN_DIGITS_NO_ISBN)).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> validator.parse(ISBN13_TOO_MANY_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_TOO_FEW_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_CORRECT_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_WRONG_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_NO_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_UNICODE_DASHES)).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> validator.parse(ISBN10_TOO_MANY_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_TOO_FEW_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_CORRECT_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_WRONG_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThat(validator.parse(ISBN10_NO_HYPHENS)).isNotNull();
        assertThatThrownBy(() -> validator.parse(ISBN10_UNICODE_DASHES)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void testIsbn10CorrectOrNoHyphenation() {
        ISBNValidator validator = ISBNValidator.isbn10().hyphenation(CORRECT_OR_NONE);

        assertThat(validator).isNotNull();
        assertThat(validator.test(null)).isFalse();
        assertThat(validator.test(BLANK)).isFalse();
        assertThat(validator.test(TEN_DIGITS_NO_ISBN)).isFalse();
        assertThat(validator.test(THIRTEEN_DIGITS_NO_ISBN)).isFalse();

        assertThat(validator.test(ISBN13_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_CORRECT_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN13_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN13_NO_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN13_UNICODE_DASHES)).isFalse();

        assertThat(validator.test(ISBN10_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.test(ISBN10_CORRECT_HYPHENATION)).isTrue();
        assertThat(validator.test(ISBN10_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.test(ISBN10_NO_HYPHENS)).isTrue();
        assertThat(validator.test(ISBN10_UNICODE_DASHES)).isFalse();
    }

    @Test
    void parseIsbn10CorrectOrNoHyphenation() {
        ISBNValidator validator = ISBNValidator.isbn10().hyphenation(CORRECT_OR_NONE);

        assertThat(validator).isNotNull();
        assertThatThrownBy(() -> validator.parse(null)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(BLANK)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(TEN_DIGITS_NO_ISBN)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(THIRTEEN_DIGITS_NO_ISBN)).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> validator.parse(ISBN13_TOO_MANY_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_TOO_FEW_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_CORRECT_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_WRONG_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_NO_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN13_UNICODE_DASHES)).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> validator.parse(ISBN10_TOO_MANY_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> validator.parse(ISBN10_TOO_FEW_HYPHENS)).isInstanceOf(IllegalArgumentException.class);
        assertThat(validator.parse(ISBN10_CORRECT_HYPHENATION)).isNotNull();
        assertThatThrownBy(() -> validator.parse(ISBN10_WRONG_HYPHENATION))
                .isInstanceOf(IllegalArgumentException.class);
        assertThat(validator.parse(ISBN10_NO_HYPHENS)).isNotNull();
        assertThatThrownBy(() -> validator.parse(ISBN10_UNICODE_DASHES)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void testEqualsAndHashcode() {
        Set<ISBNValidator> set = new HashSet<>();
        // first round all different
        assertThat(set.add(ISBNValidator.anyIsbn().hyphenation(ANY))).isTrue();
        assertThat(set.add(ISBNValidator.anyIsbn().hyphenation(CORRECT))).isTrue();
        assertThat(set.add(ISBNValidator.anyIsbn().hyphenation(NONE))).isTrue();
        assertThat(set.add(ISBNValidator.anyIsbn().hyphenation(CORRECT_OR_NONE))).isTrue();
        assertThat(set.add(ISBNValidator.isbn13().hyphenation(ANY))).isTrue();
        assertThat(set.add(ISBNValidator.isbn13().hyphenation(CORRECT))).isTrue();
        assertThat(set.add(ISBNValidator.isbn13().hyphenation(NONE))).isTrue();
        assertThat(set.add(ISBNValidator.isbn13().hyphenation(CORRECT_OR_NONE))).isTrue();
        assertThat(set.add(ISBNValidator.isbn10().hyphenation(ANY))).isTrue();
        assertThat(set.add(ISBNValidator.isbn10().hyphenation(CORRECT))).isTrue();
        assertThat(set.add(ISBNValidator.isbn10().hyphenation(NONE))).isTrue();
        assertThat(set.add(ISBNValidator.isbn10().hyphenation(CORRECT_OR_NONE))).isTrue();
        // second round all known
        assertThat(set.add(ISBNValidator.anyIsbn().hyphenation(ANY))).isFalse();
        assertThat(set.add(ISBNValidator.anyIsbn().hyphenation(CORRECT))).isFalse();
        assertThat(set.add(ISBNValidator.anyIsbn().hyphenation(NONE))).isFalse();
        assertThat(set.add(ISBNValidator.anyIsbn().hyphenation(CORRECT_OR_NONE))).isFalse();
        assertThat(set.add(ISBNValidator.isbn13().hyphenation(ANY))).isFalse();
        assertThat(set.add(ISBNValidator.isbn13().hyphenation(CORRECT))).isFalse();
        assertThat(set.add(ISBNValidator.isbn13().hyphenation(NONE))).isFalse();
        assertThat(set.add(ISBNValidator.isbn13().hyphenation(CORRECT_OR_NONE))).isFalse();
        assertThat(set.add(ISBNValidator.isbn10().hyphenation(ANY))).isFalse();
        assertThat(set.add(ISBNValidator.isbn10().hyphenation(CORRECT))).isFalse();
        assertThat(set.add(ISBNValidator.isbn10().hyphenation(NONE))).isFalse();
        assertThat(set.add(ISBNValidator.isbn10().hyphenation(CORRECT_OR_NONE))).isFalse();
    }
}