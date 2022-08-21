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
public final class ISBN implements Serializable {

    private final String prefix;
    private final String group;
    private final String publisher;
    private final String title;
    private final char checkdigit;

    private final String isbn13String;

    ISBN(String prefix, String group, String publisher, String title, char checkdigit) {
        this.prefix = prefix;
        this.group = group;
        this.publisher = publisher;
        this.title = title;
        this.checkdigit = checkdigit;
        this.isbn13String = prefix + '-' + group + '-' + publisher + '-' + title + '-' + checkdigit;
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
        return prefix;
    }

    /**
     * The range definition from the International ISBN Agency associates a name with each prefix. So far this is always
     * "International ISBN Agency".
     *
     * @return the agency's name associated with the ISBN prefix
     */
    public String getAgencyName() {
        return ISBNRanges.AGENCIES.get(prefix);
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
        return group;
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
        return prefix + '-' + group;
    }

    /**
     * The range definition from the Internation ISBN Agency associates a name with each local group.
     *
     * @return the agency's name associated with the group prefix, e.g. "English language" or "Turkey"
     */
    public String getGroupName() {
        return ISBNRanges.AGENCIES.get(getGroupPrefix());
    }

    /**
     * There are local ISBN agencies around the world take care of assigning number ranges for publishers. This is the
     * third piece of the ISBN.
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
        return publisher;
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
     * @return the group code of the ISBN, e.g. "978-0-557"
     */
    public String getPublisherPrefix() {
        return prefix + '-' + group + '-' + publisher;
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
        return title;
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
        return checkdigit;
    }

    /**
     * Returns the correctly hyphened ISBN-13 representation.
     *
     * @return the official ISBN-13 representation, e.g. "978-0-557-50469-5"
     */
    @Override
    public String toString() {
        return isbn13String;
    }

    /**
     * Returns the compact ISBN-13 representation.
     *
     * @return the compact ISBN-13 representation, e.g. "9780557504695"
     */
    public String toCompactString() {
        return prefix + group + publisher + title + checkdigit;
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
        return obj instanceof ISBN && ((ISBN) obj).isbn13String.equals(isbn13String);
    }

    /**
     * @see #equals(Object)
     */
    @Override
    public int hashCode() {
        return isbn13String.hashCode();
    }

    /**
     * Parses a given string input and returns an ISBN object.
     *
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

}
