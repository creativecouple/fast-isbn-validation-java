package de.creativecouple.validation.isbn;

class Range {

    final int width;
    final int lower;
    final int upper;
    final Range[][] rules;

    Range(int width, int lower, int upper) {
        this(width, lower, upper, (Range[][]) null);
    }

    Range(int width, int lower, int upper, Range[]... rules) {
        this.width = width;
        this.lower = lower;
        this.upper = upper;
        this.rules = rules;
    }

}
