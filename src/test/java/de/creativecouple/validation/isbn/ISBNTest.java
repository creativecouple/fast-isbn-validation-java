package de.creativecouple.validation.isbn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ISBNTest {

    @Test
    void testParseISBN13() {
        ISBN isbn = ISBN.valueOf("  9780-6--399635-4-9-- ");
        assertThat(isbn).isNotNull();
        assertThat(isbn.toString()).isEqualTo("978-0-6399635-4-9");
        assertThat(isbn.toCompactString()).isEqualTo("9780639963549");
        assertThat(isbn.getPrefix()).isEqualTo("978");
        assertThat(isbn.getAgencyName()).isEqualTo("International ISBN Agency");
        assertThat(isbn.getGroup()).isEqualTo("0");
        assertThat(isbn.getGroupPrefix()).isEqualTo("978-0");
        assertThat(isbn.getGroupName()).isEqualTo("English language");
        assertThat(isbn.getPublisher()).isEqualTo("6399635");
        assertThat(isbn.getPublisherPrefix()).isEqualTo("978-0-6399635");
        assertThat(isbn.getTitle()).isEqualTo("4");
        assertThat(isbn.getCheckDigit()).isEqualTo('9');
    }

    @Test
    void testEqualsHashmap() {
        ISBN isbnHyphen = ISBN.valueOf("978-0-6399635-4-9");
        ISBN isbnCompact = ISBN.valueOf("9780639963549");
        ISBN isbn10Hyphen = ISBN.valueOf("0-6399635-4-4");
        ISBN isbn10Compact = ISBN.valueOf("0639963544");
        ISBN isbnOther = ISBN.valueOf("978-0-6399635-5-6");

        assertThat(isbnHyphen).isEqualTo(isbnCompact);
        assertThat(isbnHyphen.hashCode()).isEqualTo(isbnCompact.hashCode());
        assertThat(isbnCompact).isEqualTo(isbn10Hyphen);
        assertThat(isbnCompact.hashCode()).isEqualTo(isbn10Hyphen.hashCode());
        assertThat(isbn10Hyphen).isEqualTo(isbn10Compact);
        assertThat(isbn10Hyphen.hashCode()).isEqualTo(isbn10Compact.hashCode());
        assertThat(isbn10Compact).isEqualTo(isbnHyphen);
        assertThat(isbn10Compact.hashCode()).isEqualTo(isbnHyphen.hashCode());

        assertThat(isbnHyphen).isNotEqualTo(isbnOther);
        assertThat(isbnHyphen.hashCode()).isNotEqualTo(isbnOther.hashCode());
        assertThat(isbnOther).isNotEqualTo(isbnCompact);
        assertThat(isbnOther.hashCode()).isNotEqualTo(isbnCompact.hashCode());
        assertThat(isbn10Hyphen).isNotEqualTo(isbnOther);
        assertThat(isbn10Hyphen.hashCode()).isNotEqualTo(isbnOther.hashCode());
        assertThat(isbnOther).isNotEqualTo(isbn10Compact);
        assertThat(isbnOther.hashCode()).isNotEqualTo(isbn10Compact.hashCode());
    }

    @Test
    void testParsingPerformance() {
        long start = System.currentTimeMillis();
        long invalid = 0, valid = 0;
        for (long i = 978_000_000_000_0L; i < 979_000_000_000_0L; i += 11011L) {
            try {
                ISBN.validate(String.valueOf(i));
                valid++;
            } catch (IllegalArgumentException e) {
                invalid++;
            }
        }
        long duration = System.currentTimeMillis() - start;
        System.out.println("valid: " + valid + ", invalid: " + invalid + ", => " + ((invalid + valid) / duration) + " ops/ms");
        assertThat(duration).isLessThan(10_000L);
    }

    @Test
    void testExtraInformation() {
        assertThat(ISBN.getIsbnDefinitionSource()).isNotBlank();
        assertThat(ISBN.getIsbnDefinitionSerialNumber()).isNotBlank();
        assertThat(ISBN.getIsbnDefinitionDate()).isNotBlank();
    }

}