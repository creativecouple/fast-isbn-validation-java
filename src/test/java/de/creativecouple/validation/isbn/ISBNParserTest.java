package de.creativecouple.validation.isbn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ISBNParserTest {

    @Test
    void testParsingPerformanceForCorrectEAN13() {
        long start = System.currentTimeMillis();
        long invalid = 0, valid = 0;
        for (long i = 978_000_000_000L; i < 980_000_000_000L; i += 137) {
            ISBN isbn = ISBNParser.parse("" + i + ISBNParser.calculateCheckDigit(i));
            if (isbn == null) {
                invalid++;
            } else {
                valid++;
            }
        }
        long duration = System.currentTimeMillis() - start;
        System.out.println(
                "valid: " + valid + ", invalid: " + invalid + ", => " + ((invalid + valid) / duration) + " ops/ms");
        assertThat(duration).isLessThan(10_000L);
    }

    @Test
    void testParsingPerformanceForWrongCheckdigit() {
        long start = System.currentTimeMillis();
        long invalid = 0, valid = 0;
        for (long i = 978_000_000_000_0L; i < 980_000_000_000_0L; i += 1337) {
            ISBN isbn = ISBNParser.parse("" + i);
            if (isbn == null) {
                invalid++;
            } else {
                valid++;
            }
        }
        long duration = System.currentTimeMillis() - start;
        System.out.println(
                "valid: " + valid + ", invalid: " + invalid + ", => " + ((invalid + valid) / duration) + " ops/ms");
        assertThat(duration).isLessThan(10_000L);
    }

}