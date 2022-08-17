package de.creativecouple.validation.isbn;

import java.io.Serializable;

public final class ISBN implements Serializable {

    private final String prefix;
    private final String group;
    private final String publisher;
    private final String title;
    private final char checkDigit;

    private final String isbn13String;

    private ISBN(String prefix, String group, String publisher, String title, char checkDigit) {
        this.prefix = prefix;
        this.group = group;
        this.publisher = publisher;
        this.title = title;
        this.checkDigit = checkDigit;
        this.isbn13String = prefix + '-' + group + '-' + publisher + '-' + title + '-' + checkDigit;
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

    public char getCheckDigit() {
        return checkDigit;
    }

    @Override
    public String toString() {
        return isbn13String;
    }

    public String toCompactString() {
        return prefix + group + publisher + title + checkDigit;
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
        ISBNParser parser = new ISBNParser().parse(isbn);
        return new ISBN(parser.prefix, parser.group, parser.publisher, parser.title, parser.checkDigit);
    }

    public static void validate(String isbn) throws IllegalArgumentException {
        ISBNParser parser = new ISBNParser().parse(isbn);
    }

    public static String getIsbnDefinitionSource() {
        return ISBNRanges.MESSAGE_SOURCE;
    }

    public static String getIsbnDefinitionSerialNumber() {
        return ISBNRanges.MESSAGE_SERIAL_NUMBER;
    }

    public static String getIsbnDefinitionDate() {
        return ISBNRanges.MESSAGE_DATE;
    }

}
