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

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ParserTest {

    @BeforeAll
    static void checkRanges() {
        assertNotNull(ISBNRanges.ranges);
    }

    @Test
    void testParsingPerformanceForCorrectEAN13() {
        int step = 37;
        long from = 978_000_000_000L;
        long to = 980_000_000_000L;
        final int nr = (int) (to - from) / step + 1;
        byte[] checkdigits = new byte[nr];
        {
            int i = 0;
            for (long l = from; l < to; l += step) {
                checkdigits[i++] = (byte) calculateCheckDigit(l);
            }
        }
        long start = System.currentTimeMillis();
        long invalid = 0, valid = 0;
        int i = 0;
        for (long l = from; l < to; l += step) {
            ISBN isbn = Parser.parse("" + l + checkdigits[i++]);
            if (isbn == null) {
                invalid++;
            } else {
                valid++;
            }
        }
        long duration = System.currentTimeMillis() - start + 1;
        System.out.printf("valid: %d, invalid: %d, => %d ops/ms%n", valid, invalid, (invalid + valid) / duration);
        assertThat(duration).isLessThan(20_000L);
    }

    @Test
    void testParsingPerformanceForWrongCheckdigit() {
        long start = System.currentTimeMillis();
        long invalid = 0, valid = 0;
        for (long i = 978_000_000_000_0L; i < 980_000_000_000_0L; i += 371) {
            ISBN isbn = Parser.parse("" + i);
            if (isbn == null) {
                invalid++;
            } else {
                valid++;
            }
        }
        long duration = System.currentTimeMillis() - start;
        System.out.printf("valid: %d, invalid: %d, => %d ops/ms%n", valid, invalid, (invalid + valid) / duration);
        assertThat(duration).isLessThan(20_000L);
    }

    @Test
    void testUnknownPrefix() {
        assertThat(Parser.parse("977-012345678-7")).isNull();
        assertThat(Parser.parse("980-012345678-1")).isNull();
    }

    @Test
    void testUnassignedGroupRange() {
        assertThat(Parser.parse("978-611001122-8")).isNull();
        assertThat(Parser.parse("979-444444444-5")).isNull();
    }

    private int calculateCheckDigit(long value) {
        int sum = 0;
        for (int i = 0, weight = 3; i < 12; i++, weight ^= 2, value /= 10) {
            sum += weight * (int) (value % 10L);
        }
        return (10 - (sum % 10)) % 10;
    }
}