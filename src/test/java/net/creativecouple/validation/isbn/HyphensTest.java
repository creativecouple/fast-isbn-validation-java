package net.creativecouple.validation.isbn;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Named.named;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class HyphensTest {

    static Stream<Arguments> unicodeHyphens() {
        return Stream.of(arguments(named("hyphen-minus", '\u002D')), arguments(named("low line", '\u005F')),
                arguments(named("soft hyphen", '\u00AD')), arguments(named("macron", '\u00AF')),
                arguments(named("modifier letter macron", '\u02C9')),
                arguments(named("modifier letter low macron", '\u02CD')),
                arguments(named("modifier letter minus sign", '\u02D7')),
                arguments(named("combining minus sign below", '\u0320')), arguments(named("hyphen", '\u2010')),
                arguments(named("non-breaking hyphen", '\u2011')), arguments(named("figure dash", '\u2012')),
                arguments(named("en dash", '\u2013')), arguments(named("em dash", '\u2014')),
                arguments(named("horizontal bar", '\u2015')), arguments(named("overline", '\u203E')),
                arguments(named("hyphen bullet", '\u2043')), arguments(named("superscript minus sign", '\u207B')),
                arguments(named("subscript minus sign", '\u208B')), arguments(named("minus sign", '\u2212')),
                arguments(named("horizontal line extension", '\u23AF')), arguments(named("straightness", '\u23E4')),
                arguments(named("box drawings light horizontal", '\u2500')),
                arguments(named("box drawings heavy horizontal", '\u2501')), arguments(named("two-em dash", '\u2E3A')),
                arguments(named("three-em dash", '\u2E3B')), arguments(named("heavy minus sign", '\u2796')),
                arguments(named("miny", '\u29FF')), arguments(named("small hyphen-minus", '\uFE63')),
                arguments(named("fullwidth hyphen-minus", '\uFF0D')));
    }

    @ParameterizedTest
    @MethodSource("unicodeHyphens")
    void removeHyphens(char hyphen) {
        assertEquals("abc", Hyphens.removeAllHyphens("ab" + hyphen + "c"));
    }

    @ParameterizedTest
    @MethodSource("unicodeHyphens")
    void normalizeHyphens(char hyphen) {
        assertEquals("ab-c", Hyphens.normalizeHyphens("ab" + hyphen + "c"));
    }

    @ParameterizedTest
    @MethodSource("unicodeHyphens")
    void checkHyphens(char hyphen) {
        assertTrue(Hyphens.isUnicodeHyphen(hyphen));
    }

    @Test
    void checkNoHyphens() {
        assertFalse(Hyphens.isUnicodeHyphen('+'));
        assertFalse(Hyphens.isUnicodeHyphen('~'));
        assertFalse(Hyphens.isUnicodeHyphen('/'));
    }
}