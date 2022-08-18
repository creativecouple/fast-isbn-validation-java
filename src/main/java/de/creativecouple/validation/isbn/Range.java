package de.creativecouple.validation.isbn;

class Range {

    final int width;
    final long lower;
    final long upper;
    final Range[][] rules;

    Range(int width, long lower, long upper) {
        this(width, lower, upper, (Range[][]) null);
    }

    Range(int width, long lower, long upper, Range[]... rules) {
        this.width = width;
        this.lower = lower;
        this.upper = upper;
        this.rules = rules;
    }

}
