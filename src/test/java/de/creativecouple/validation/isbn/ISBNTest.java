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

import java.net.URI;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ISBNTest {

    @Test
    void testParseISBN_normalizingDashes() {
        ISBN isbn = ISBN.valueOf("9-780-6-3-9-96-35-4-9");
        assertThat(isbn).isNotNull();
        assertThat(isbn.toString()).isEqualTo("978-0-6399635-4-9");
        assertThat(isbn.toIso2108()).isEqualTo("ISBN 978-0-6399635-4-9");
        assertThat(isbn.toCompactString()).isEqualTo("9780639963549");
        assertThat(isbn.toURI()).isEqualTo(URI.create("urn:isbn:9780639963549"));
        assertThat(isbn.getPrefix()).isEqualTo("978");
        assertThat(isbn.getPrefixName()).isEqualTo("International ISBN Agency");
        assertThat(isbn.getGroup()).isEqualTo("0");
        assertThat(isbn.getGroupPrefix()).isEqualTo("978-0");
        assertThat(isbn.getGroupName()).isEqualTo("English language");
        assertThat(isbn.getPublisher()).isEqualTo("6399635");
        assertThat(isbn.getPublisherPrefix()).isEqualTo("978-0-6399635");
        assertThat(isbn.getTitle()).isEqualTo("4");
        assertThat(isbn.getCheckdigit()).isEqualTo('9');
    }

    @Test
    void testParseISBN_specialDashes() {
        ISBN isbn = ISBN.valueOf("9_780-6\u20133\u20149_9_63-5-4\u22129");
        assertThat(isbn).isNotNull();
        assertThat(isbn.toString()).isEqualTo("978-0-6399635-4-9");
        assertThat(isbn.toIso2108()).isEqualTo("ISBN 978-0-6399635-4-9");
        assertThat(isbn.toCompactString()).isEqualTo("9780639963549");
        assertThat(isbn.toURI()).isEqualTo(URI.create("urn:isbn:9780639963549"));
        assertThat(isbn.getPrefix()).isEqualTo("978");
        assertThat(isbn.getPrefixName()).isEqualTo("International ISBN Agency");
        assertThat(isbn.getGroup()).isEqualTo("0");
        assertThat(isbn.getGroupPrefix()).isEqualTo("978-0");
        assertThat(isbn.getGroupName()).isEqualTo("English language");
        assertThat(isbn.getPublisher()).isEqualTo("6399635");
        assertThat(isbn.getPublisherPrefix()).isEqualTo("978-0-6399635");
        assertThat(isbn.getTitle()).isEqualTo("4");
        assertThat(isbn.getCheckdigit()).isEqualTo('9');
    }

    @Test
    void testParseISBN13_979() {
        ISBN isbn = ISBN.valueOf("979-8421221814");
        assertThat(isbn).isNotNull();
        assertThat(isbn.toString()).isEqualTo("979-8-4212-2181-4");
        assertThat(isbn.toIso2108()).isEqualTo("ISBN 979-8-4212-2181-4");
        assertThat(isbn.toCompactString()).isEqualTo("9798421221814");
        assertThat(isbn.toURI()).isEqualTo(URI.create("urn:isbn:9798421221814"));
        assertThat(isbn.getPrefix()).isEqualTo("979");
        assertThat(isbn.getPrefixName()).isEqualTo("International ISBN Agency");
        assertThat(isbn.getGroup()).isEqualTo("8");
        assertThat(isbn.getGroupPrefix()).isEqualTo("979-8");
        assertThat(isbn.getGroupName()).isEqualTo("United States");
        assertThat(isbn.getPublisher()).isEqualTo("4212");
        assertThat(isbn.getPublisherPrefix()).isEqualTo("979-8-4212");
        assertThat(isbn.getTitle()).isEqualTo("2181");
        assertThat(isbn.getCheckdigit()).isEqualTo('4');
    }

    @Test
    void testParseISBN10() {
        ISBN isbn = ISBN.valueOf("394718834-X");
        assertThat(isbn).isNotNull();
        assertThat(isbn.toString()).isEqualTo("978-3-947188-34-5");
        assertThat(isbn.toIso2108()).isEqualTo("ISBN 978-3-947188-34-5");
        assertThat(isbn.toCompactString()).isEqualTo("9783947188345");
        assertThat(isbn.toURI()).isEqualTo(URI.create("urn:isbn:9783947188345"));
        assertThat(isbn.getPrefix()).isEqualTo("978");
        assertThat(isbn.getPrefixName()).isEqualTo("International ISBN Agency");
        assertThat(isbn.getGroup()).isEqualTo("3");
        assertThat(isbn.getGroupPrefix()).isEqualTo("978-3");
        assertThat(isbn.getGroupName()).isEqualTo("German language");
        assertThat(isbn.getPublisher()).isEqualTo("947188");
        assertThat(isbn.getPublisherPrefix()).isEqualTo("978-3-947188");
        assertThat(isbn.getTitle()).isEqualTo("34");
        assertThat(isbn.getCheckdigit()).isEqualTo('5');
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
    void testInvalidStrings() {
        assertThatThrownBy(() -> ISBN.valueOf(null)).isInstanceOf(NumberFormatException.class);

        assertThatThrownBy(() -> ISBN.valueOf("")).isInstanceOf(NumberFormatException.class);

        assertThatThrownBy(() -> ISBN.valueOf("108349706583147698275981237147548705241985"))
                .isInstanceOf(NumberFormatException.class);

        assertThatThrownBy(() -> ISBN.valueOf("X987654321")).isInstanceOf(NumberFormatException.class);

        assertThatThrownBy(() -> ISBN.valueOf("978~0*6399635#4+9")).isInstanceOf(NumberFormatException.class);

        assertThatThrownBy(() -> ISBN.valueOf(" 978-0-6399635-4-9 ")).isInstanceOf(NumberFormatException.class);
    }
}