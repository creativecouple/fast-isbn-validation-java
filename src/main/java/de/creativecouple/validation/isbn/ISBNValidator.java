package de.creativecouple.validation.isbn;

import java.util.function.BiFunction;

public final class ISBNValidator {

    ISBNValidator(BiFunction<String, ISBN, Boolean> inputCheck) {
        this.inputCheck = inputCheck;
    }

    private final BiFunction<String, ISBN, Boolean> inputCheck;

    public boolean isValid(String isbnString) {
        ISBN isbn = ISBNParser.parse(isbnString);
        return isbn != null && inputCheck.apply(isbnString, isbn);
    }

    public static ISBNValidatorBuilder anyIsbn() {
        return new ISBNValidatorBuilder(0);
    }

    public static ISBNValidatorBuilder isbn10() {
        return new ISBNValidatorBuilder(10);
    }

    public static ISBNValidatorBuilder isbn13() {
        return new ISBNValidatorBuilder(13);
    }

}