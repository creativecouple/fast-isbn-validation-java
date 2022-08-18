package de.creativecouple.validation.isbn;

import java.io.Serializable;

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

    public String getPrefix() {
        return prefix;
    }

    public String getAgencyName() {
        return ISBNRanges.AGENCIES.get(prefix);
    }

    public String getGroup() {
        return group;
    }

    public String getGroupPrefix() {
        return prefix + '-' + group;
    }

    public String getGroupName() {
        return ISBNRanges.AGENCIES.get(getGroupPrefix());
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublisherPrefix() {
        return prefix + '-' + group + '-' + publisher;
    }

    public String getTitle() {
        return title;
    }

    public char getCheckdigit() {
        return checkdigit;
    }

    @Override
    public String toString() {
        return isbn13String;
    }

    public String toCompactString() {
        return prefix + group + publisher + title + checkdigit;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof ISBN && ((ISBN) obj).isbn13String.equals(isbn13String);
    }

    @Override
    public int hashCode() {
        return isbn13String.hashCode();
    }

    public static ISBN valueOf(String isbn) throws IllegalArgumentException {
        ISBN parsed = ISBNParser.parse(isbn);
        if (parsed == null) {
            throw new NumberFormatException("ISBN invalid: '" + isbn + "'");
        }
        return parsed;
    }

}
