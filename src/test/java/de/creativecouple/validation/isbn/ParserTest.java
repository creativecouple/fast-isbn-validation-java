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

import static org.assertj.core.api.Assertions.assertThat;

class ParserTest {

    @Test
    void testParsingPerformanceForCorrectEAN13() {
        long start = System.currentTimeMillis();
        long invalid = 0, valid = 0;
        for (long i = 978_000_000_000L; i < 980_000_000_000L; i += 137) {
            ISBN isbn = Parser.parse("" + i + Parser.calculateCheckDigit(i));
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
            ISBN isbn = Parser.parse("" + i);
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