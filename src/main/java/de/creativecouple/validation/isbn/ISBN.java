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

import java.io.Serializable;
import java.net.URI;

/**
 * Simple domain object, representing a single ISBN identifier. Usage:
 *
 * <pre>{@code
 * ISBN isbn1 = ISBN.valueOf("978-0557504695");
 * isbn1.toString(); // "978-0-557-50469-5"
 *
 * ISBN isbn2 = ISBN.valueOf("0-557-50469-4");
 * isbn2.toString(); // "978-0-557-50469-5"
 *
 * isbn1.equals(isbn2); // true
 * }</pre>
 *
 * @author Peter Liske (CreativeCouple)
 */
public final class ISBN implements Serializable, Comparable<ISBN> {

    /**
     * the compact ISBN-13 representation
     */
    private final String isbn;

    /**
     * the hyphenation pattern for this ISBN
     */
    private final Hyphenation hyphenation;

    ISBN(String isbn, Hyphenation hyphenation) {
        this.isbn = isbn;
        this.hyphenation = hyphenation;
    }

    /**
     * The EAN/UCC prefix represents the country/region in the EAN/GTIN standard. Currently only "978" and "979" are
     * associated with the International ISBN Agency.
     *
     * <pre>
     *  ,–––⹁
     *   978-0-557-50469-5
     *  `–––´
     * </pre>
     *
     * @return the ISBN prefix, e.g. "978" or "979"
     */
    public String getPrefix() {
        return isbn.substring(0, hyphenation.eanPrefixLength);
    }

    /**
     * The range definition from the International ISBN Agency associates a name with each prefix. So far this is always
     * "International ISBN Agency".
     *
     * @return the agency's name associated with the ISBN prefix
     */
    public String getAgencyName() {
        return ISBNRanges.agencies.get(getPrefix());
    }

    /**
     * There are group codes assigned with each local ISBN agency, e.g. for single countries or language regions. It is
     * the second piece of the ISBN.
     *
     * <pre>
     *      ,–⹁
     *   978-0-557-50469-5
     *      `–´
     * </pre>
     *
     * @return the group code of the ISBN, e.g. "0" or "610"
     */
    public String getGroup() {
        return isbn.substring(hyphenation.eanPrefixLength, hyphenation.groupPrefixLength);
    }

    /**
     * The group prefix is the substring that all valid ISBNs from that group start with.
     *
     * <pre>
     *  ,–––––⹁
     *   978-0-557-50469-5
     *  `–––––´
     * </pre>
     *
     * @return the group code of the ISBN, e.g. "978-0"
     */
    public String getGroupPrefix() {
        return getPrefix() + '-' + getGroup();
    }

    /**
     * The range definition from the Internation ISBN Agency associates a name with each local group.
     *
     * @return the agency's name associated with the group prefix, e.g. "English language" or "Turkey"
     */
    public String getGroupName() {
        return ISBNRanges.agencies.get(getGroupPrefix());
    }

    /**
     * There are local ISBN agencies around the world who take care of assigning number ranges for publishers. This
     * publisher code is the third piece of the ISBN.
     *
     * <pre>
     *        ,–––⹁
     *   978-0-557-50469-5
     *        `–––´
     * </pre>
     *
     * @return the publisher code of the ISBN, e.g. "557"
     */
    public String getPublisher() {
        return isbn.substring(hyphenation.groupPrefixLength, hyphenation.publisherPrefixLength);
    }

    /**
     * The publisher prefix is the substring that all valid ISBNs from that publisher range start with.
     *
     * <pre>
     *  ,–––––––––⹁
     *   978-0-557-50469-5
     *  `–––––––––´
     * </pre>
     *
     * @return the publisher's prefix of the ISBN, e.g. "978-0-557"
     */
    public String getPublisherPrefix() {
        return getPrefix() + '-' + getGroup() + '-' + getPublisher();
    }

    /**
     * Each publication has a title identifier that is unique within the publisher's number range. It is the fourth
     * piece of the ISBN.
     *
     * <pre>
     *            ,–––––⹁
     *   978-0-557-50469-5
     *            `–––––´
     * </pre>
     *
     * @return the title code of the ISBN, e.g. "50469"
     */
    public String getTitle() {
        return isbn.substring(hyphenation.publisherPrefixLength, 12);
    }

    /**
     * To meet the EAN criteria for valid article numbers, each ISBN has an additional digit to increase redundancy and
     * to spot errors. It is a number from '0' to '9'. If any single digit of the ISBN string changes, it will become
     * invalid.
     *
     * <pre>
     *                  ,–⹁
     *   978-0-557-50469-5
     *                  `–´
     * </pre>
     *
     * @return the checkdigit of the ISBN, e.g. '5'
     */
    public char getCheckdigit() {
        return isbn.charAt(12);
    }

    /**
     * Returns the correctly hyphened ISBN-13 representation.
     *
     * @return the official ISBN-13 representation, e.g. "978-0-557-50469-5"
     */
    @Override
    public String toString() {
        return getPrefix() + '-' + getGroup() + '-' + getPublisher() + '-' + getTitle() + '-' + getCheckdigit();
    }

    /**
     * Returns the compact ISBN-13 representation.
     *
     * @return the compact ISBN-13 representation, e.g. "9780557504695"
     */
    public String toCompactString() {
        return isbn;
    }

    /**
     * Returns the URI for this ISBN.
     *
     * @return the URI pointing to this ISBN, e.g. "urn:isbn:9780557504695"
     */
    public URI toURI() {
        return URI.create("urn:isbn:" + toCompactString());
    }

    /**
     * Two ISBN objects with the same ISBN-13 representation are treated equal.
     *
     * @return whether this ISBN is equal to another ISBN object.
     */
    @Override
    public boolean equals(Object obj) {
        return obj instanceof ISBN && ((ISBN) obj).isbn.equals(isbn);
    }

    /**
     * @see #equals(Object)
     */
    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

    /**
     * @see Comparable#compareTo(Object)
     */
    @Override
    public int compareTo(ISBN isbn) {
        return this.isbn.compareTo(isbn.isbn);
    }

    /**
     * Parses a given string input and returns an ISBN object.
     *
     * @param isbn the ISBN string
     * @return the ISBN object
     *
     * @throws NumberFormatException
     *             if the input is not an ISBN
     */
    public static ISBN valueOf(String isbn) throws IllegalArgumentException {
        ISBN parsed = Parser.parse(isbn);
        if (parsed == null) {
            throw new NumberFormatException("ISBN invalid: '" + isbn + "'");
        }
        return parsed;
    }

    static final class Hyphenation implements Serializable {
        private final int eanPrefixLength;
        private final int groupPrefixLength;
        private final int publisherPrefixLength;

        Hyphenation(int eanPrefixLength, int groupPrefixLength, int publisherPrefixLength) {
            this.eanPrefixLength = eanPrefixLength;
            this.groupPrefixLength = groupPrefixLength;
            this.publisherPrefixLength = publisherPrefixLength;
        }
    }

    /**
     * Reload the latest ISBN definition from the latest release at github.com.
     */
    public static void updateRangeDefinition() {
        ISBNRanges.updateRangeDefinition();
    }

}
