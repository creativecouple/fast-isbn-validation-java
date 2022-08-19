package de.creativecouple.validation.isbn;

import org.junit.jupiter.api.Test;

import static de.creativecouple.validation.isbn.ISBNValidatorBuilder.HyphenationOption.ANY;
import static de.creativecouple.validation.isbn.ISBNValidatorBuilder.HyphenationOption.CORRECT;
import static de.creativecouple.validation.isbn.ISBNValidatorBuilder.HyphenationOption.CORRECT_OR_NONE;
import static de.creativecouple.validation.isbn.ISBNValidatorBuilder.HyphenationOption.NONE;
import static org.assertj.core.api.Assertions.assertThat;

class ISBNValidatorTest {

    public static final String BLANK = " ";
    public static final String TEN_DIGITS_NO_ISBN = "987654321X";
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
        assertThat(validator.isValid(null)).isFalse();
        assertThat(validator.isValid(BLANK)).isFalse();
        assertThat(validator.isValid(TEN_DIGITS_NO_ISBN)).isFalse();
        assertThat(validator.isValid(THIRTEEN_DIGITS_NO_ISBN)).isFalse();

        assertThat(validator.isValid(ISBN13_TOO_MANY_HYPHENS)).isTrue();
        assertThat(validator.isValid(ISBN13_TOO_FEW_HYPHENS)).isTrue();
        assertThat(validator.isValid(ISBN13_CORRECT_HYPHENATION)).isTrue();
        assertThat(validator.isValid(ISBN13_WRONG_HYPHENATION)).isTrue();
        assertThat(validator.isValid(ISBN13_NO_HYPHENS)).isTrue();
        assertThat(validator.isValid(ISBN13_UNICODE_DASHES)).isTrue();

        assertThat(validator.isValid(ISBN10_TOO_MANY_HYPHENS)).isTrue();
        assertThat(validator.isValid(ISBN10_TOO_FEW_HYPHENS)).isTrue();
        assertThat(validator.isValid(ISBN10_CORRECT_HYPHENATION)).isTrue();
        assertThat(validator.isValid(ISBN10_WRONG_HYPHENATION)).isTrue();
        assertThat(validator.isValid(ISBN10_NO_HYPHENS)).isTrue();
        assertThat(validator.isValid(ISBN10_UNICODE_DASHES)).isTrue();
    }

    @Test
    void testAnyIsbnCheckingHyphenation() {
        ISBNValidator validator = ISBNValidator.anyIsbn().hyphenation(CORRECT);

        assertThat(validator).isNotNull();
        assertThat(validator.isValid(null)).isFalse();
        assertThat(validator.isValid(BLANK)).isFalse();
        assertThat(validator.isValid(TEN_DIGITS_NO_ISBN)).isFalse();
        assertThat(validator.isValid(THIRTEEN_DIGITS_NO_ISBN)).isFalse();

        assertThat(validator.isValid(ISBN13_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_CORRECT_HYPHENATION)).isTrue();
        assertThat(validator.isValid(ISBN13_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN13_NO_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_UNICODE_DASHES)).isFalse();

        assertThat(validator.isValid(ISBN10_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_CORRECT_HYPHENATION)).isTrue();
        assertThat(validator.isValid(ISBN10_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN10_NO_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_UNICODE_DASHES)).isFalse();
    }

    @Test
    void testAnyIsbnWithoutHyphenation() {
        ISBNValidator validator = ISBNValidator.anyIsbn().hyphenation(NONE);

        assertThat(validator).isNotNull();
        assertThat(validator.isValid(null)).isFalse();
        assertThat(validator.isValid(BLANK)).isFalse();
        assertThat(validator.isValid(TEN_DIGITS_NO_ISBN)).isFalse();
        assertThat(validator.isValid(THIRTEEN_DIGITS_NO_ISBN)).isFalse();

        assertThat(validator.isValid(ISBN13_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_CORRECT_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN13_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN13_NO_HYPHENS)).isTrue();
        assertThat(validator.isValid(ISBN13_UNICODE_DASHES)).isFalse();

        assertThat(validator.isValid(ISBN10_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_CORRECT_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN10_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN10_NO_HYPHENS)).isTrue();
        assertThat(validator.isValid(ISBN10_UNICODE_DASHES)).isFalse();
    }

    @Test
    void testAnyIsbnCorrectOrNoHyphenation() {
        ISBNValidator validator = ISBNValidator.anyIsbn().hyphenation(CORRECT_OR_NONE);

        assertThat(validator).isNotNull();
        assertThat(validator.isValid(null)).isFalse();
        assertThat(validator.isValid(BLANK)).isFalse();
        assertThat(validator.isValid(TEN_DIGITS_NO_ISBN)).isFalse();
        assertThat(validator.isValid(THIRTEEN_DIGITS_NO_ISBN)).isFalse();

        assertThat(validator.isValid(ISBN13_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_CORRECT_HYPHENATION)).isTrue();
        assertThat(validator.isValid(ISBN13_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN13_NO_HYPHENS)).isTrue();
        assertThat(validator.isValid(ISBN13_UNICODE_DASHES)).isFalse();

        assertThat(validator.isValid(ISBN10_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_CORRECT_HYPHENATION)).isTrue();
        assertThat(validator.isValid(ISBN10_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN10_NO_HYPHENS)).isTrue();
        assertThat(validator.isValid(ISBN10_UNICODE_DASHES)).isFalse();
    }

    @Test
    void testIsbn13IgnoringHyphenation() {
        ISBNValidator validator = ISBNValidator.isbn13().hyphenation(ANY);

        assertThat(validator).isNotNull();
        assertThat(validator.isValid(null)).isFalse();
        assertThat(validator.isValid(BLANK)).isFalse();
        assertThat(validator.isValid(TEN_DIGITS_NO_ISBN)).isFalse();
        assertThat(validator.isValid(THIRTEEN_DIGITS_NO_ISBN)).isFalse();

        assertThat(validator.isValid(ISBN13_TOO_MANY_HYPHENS)).isTrue();
        assertThat(validator.isValid(ISBN13_TOO_FEW_HYPHENS)).isTrue();
        assertThat(validator.isValid(ISBN13_CORRECT_HYPHENATION)).isTrue();
        assertThat(validator.isValid(ISBN13_WRONG_HYPHENATION)).isTrue();
        assertThat(validator.isValid(ISBN13_NO_HYPHENS)).isTrue();
        assertThat(validator.isValid(ISBN13_UNICODE_DASHES)).isTrue();

        assertThat(validator.isValid(ISBN10_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_CORRECT_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN10_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN10_NO_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_UNICODE_DASHES)).isFalse();
    }

    @Test
    void testIsbn13CheckingHyphenation() {
        ISBNValidator validator = ISBNValidator.isbn13().hyphenation(CORRECT);

        assertThat(validator).isNotNull();
        assertThat(validator.isValid(null)).isFalse();
        assertThat(validator.isValid(BLANK)).isFalse();
        assertThat(validator.isValid(TEN_DIGITS_NO_ISBN)).isFalse();
        assertThat(validator.isValid(THIRTEEN_DIGITS_NO_ISBN)).isFalse();

        assertThat(validator.isValid(ISBN13_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_CORRECT_HYPHENATION)).isTrue();
        assertThat(validator.isValid(ISBN13_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN13_NO_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_UNICODE_DASHES)).isFalse();

        assertThat(validator.isValid(ISBN10_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_CORRECT_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN10_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN10_NO_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_UNICODE_DASHES)).isFalse();
    }

    @Test
    void testIsbn13WithoutHyphenation() {
        ISBNValidator validator = ISBNValidator.isbn13().hyphenation(NONE);

        assertThat(validator).isNotNull();
        assertThat(validator.isValid(null)).isFalse();
        assertThat(validator.isValid(BLANK)).isFalse();
        assertThat(validator.isValid(TEN_DIGITS_NO_ISBN)).isFalse();
        assertThat(validator.isValid(THIRTEEN_DIGITS_NO_ISBN)).isFalse();

        assertThat(validator.isValid(ISBN13_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_CORRECT_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN13_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN13_NO_HYPHENS)).isTrue();
        assertThat(validator.isValid(ISBN13_UNICODE_DASHES)).isFalse();

        assertThat(validator.isValid(ISBN10_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_CORRECT_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN10_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN10_NO_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_UNICODE_DASHES)).isFalse();
    }

    @Test
    void testIsbn13CorrectOrNoHyphenation() {
        ISBNValidator validator = ISBNValidator.isbn13().hyphenation(CORRECT_OR_NONE);

        assertThat(validator).isNotNull();
        assertThat(validator.isValid(null)).isFalse();
        assertThat(validator.isValid(BLANK)).isFalse();
        assertThat(validator.isValid(TEN_DIGITS_NO_ISBN)).isFalse();
        assertThat(validator.isValid(THIRTEEN_DIGITS_NO_ISBN)).isFalse();

        assertThat(validator.isValid(ISBN13_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_CORRECT_HYPHENATION)).isTrue();
        assertThat(validator.isValid(ISBN13_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN13_NO_HYPHENS)).isTrue();
        assertThat(validator.isValid(ISBN13_UNICODE_DASHES)).isFalse();

        assertThat(validator.isValid(ISBN10_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_CORRECT_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN10_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN10_NO_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_UNICODE_DASHES)).isFalse();
    }

    @Test
    void testIsbn10IgnoringHyphenation() {
        ISBNValidator validator = ISBNValidator.isbn10().hyphenation(ANY);

        assertThat(validator).isNotNull();
        assertThat(validator.isValid(null)).isFalse();
        assertThat(validator.isValid(BLANK)).isFalse();
        assertThat(validator.isValid(TEN_DIGITS_NO_ISBN)).isFalse();
        assertThat(validator.isValid(THIRTEEN_DIGITS_NO_ISBN)).isFalse();

        assertThat(validator.isValid(ISBN13_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_CORRECT_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN13_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN13_NO_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_UNICODE_DASHES)).isFalse();

        assertThat(validator.isValid(ISBN10_TOO_MANY_HYPHENS)).isTrue();
        assertThat(validator.isValid(ISBN10_TOO_FEW_HYPHENS)).isTrue();
        assertThat(validator.isValid(ISBN10_CORRECT_HYPHENATION)).isTrue();
        assertThat(validator.isValid(ISBN10_WRONG_HYPHENATION)).isTrue();
        assertThat(validator.isValid(ISBN10_NO_HYPHENS)).isTrue();
        assertThat(validator.isValid(ISBN10_UNICODE_DASHES)).isTrue();
    }

    @Test
    void testIsbn10CheckingHyphenation() {
        ISBNValidator validator = ISBNValidator.isbn10().hyphenation(CORRECT);

        assertThat(validator).isNotNull();
        assertThat(validator.isValid(null)).isFalse();
        assertThat(validator.isValid(BLANK)).isFalse();
        assertThat(validator.isValid(TEN_DIGITS_NO_ISBN)).isFalse();
        assertThat(validator.isValid(THIRTEEN_DIGITS_NO_ISBN)).isFalse();

        assertThat(validator.isValid(ISBN13_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_CORRECT_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN13_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN13_NO_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_UNICODE_DASHES)).isFalse();

        assertThat(validator.isValid(ISBN10_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_CORRECT_HYPHENATION)).isTrue();
        assertThat(validator.isValid(ISBN10_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN10_NO_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_UNICODE_DASHES)).isFalse();
    }

    @Test
    void testIsbn10WithoutHyphenation() {
        ISBNValidator validator = ISBNValidator.isbn10().hyphenation(NONE);

        assertThat(validator).isNotNull();
        assertThat(validator.isValid(null)).isFalse();
        assertThat(validator.isValid(BLANK)).isFalse();
        assertThat(validator.isValid(TEN_DIGITS_NO_ISBN)).isFalse();
        assertThat(validator.isValid(THIRTEEN_DIGITS_NO_ISBN)).isFalse();

        assertThat(validator.isValid(ISBN13_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_CORRECT_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN13_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN13_NO_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_UNICODE_DASHES)).isFalse();

        assertThat(validator.isValid(ISBN10_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_CORRECT_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN10_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN10_NO_HYPHENS)).isTrue();
        assertThat(validator.isValid(ISBN10_UNICODE_DASHES)).isFalse();
    }

    @Test
    void testIsbn10CorrectOrNoHyphenation() {
        ISBNValidator validator = ISBNValidator.isbn10().hyphenation(CORRECT_OR_NONE);

        assertThat(validator).isNotNull();
        assertThat(validator.isValid(null)).isFalse();
        assertThat(validator.isValid(BLANK)).isFalse();
        assertThat(validator.isValid(TEN_DIGITS_NO_ISBN)).isFalse();
        assertThat(validator.isValid(THIRTEEN_DIGITS_NO_ISBN)).isFalse();

        assertThat(validator.isValid(ISBN13_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_CORRECT_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN13_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN13_NO_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN13_UNICODE_DASHES)).isFalse();

        assertThat(validator.isValid(ISBN10_TOO_MANY_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_TOO_FEW_HYPHENS)).isFalse();
        assertThat(validator.isValid(ISBN10_CORRECT_HYPHENATION)).isTrue();
        assertThat(validator.isValid(ISBN10_WRONG_HYPHENATION)).isFalse();
        assertThat(validator.isValid(ISBN10_NO_HYPHENS)).isTrue();
        assertThat(validator.isValid(ISBN10_UNICODE_DASHES)).isFalse();
    }

}