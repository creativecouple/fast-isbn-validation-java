package de.creativecouple.validation.isbn;

import java.util.regex.Pattern;

/**
 * Helper class to identify whether a given character is hyphen-ish. Supports various Unicode hyphen and minus signs,
 * which simplifies parsing ISBN from different text sources.
 *
 * @author Peter Liske (CreativeCouple)
 * @see #isUnicodeHyphen(char)
 */
public final class Hyphens {
    private static final boolean[] unicodeHyphens = new boolean[Character.MAX_VALUE + 1];
    private static final Pattern hyphenPattern;

    static {
        StringBuilder builder = new StringBuilder();
        for (char c : new char[]{0x002D, 0x005F, 0x00AD, 0x00AF, 0x02C9, 0x02CD, 0x02D7, 0x0320, 0x2010, 0x2011,
                0x2012, 0x2013, 0x2014, 0x2015, 0x203E, 0x2043, 0x207B, 0x208B, 0x2212, 0x23AF, 0x23E4, 0x2500, 0x2501,
                0x2796, 0x29FF, 0x2E3A, 0x2E3B, 0xFE63, 0xFF0D}) {
            unicodeHyphens[c] = true;
            builder.append(c);
        }
        hyphenPattern = Pattern.compile("[" + builder + "]");
    }

    /**
     * Check any given character for being a unicode hyphen.
     *
     * @param ch character
     * @return whether the given character is hyphen-ish. <br>
     * <table>
     * <caption>Currently supported unicode hyphens</caption>
     * <tr>
     * <th>Unicode Position</th>
     * <th>Unicode Name</th>
     * </tr>
     * <tr>
     * <td>U+002D</td>
     * <td>hyphen-minus</td>
     * </tr>
     * <tr>
     * <td>U+005F</td>
     * <td>low line</td>
     * </tr>
     * <tr>
     * <td>U+00AD</td>
     * <td>soft hyphen</td>
     * </tr>
     * <tr>
     * <td>U+00AF</td>
     * <td>macron</td>
     * </tr>
     * <tr>
     * <td>U+02C9</td>
     * <td>modifier letter macron</td>
     * </tr>
     * <tr>
     * <td>U+02CD</td>
     * <td>modifier letter low macron</td>
     * </tr>
     * <tr>
     * <td>U+02D7</td>
     * <td>modifier letter minus sign</td>
     * </tr>
     * <tr>
     * <td>U+0320</td>
     * <td>combining minus sign below</td>
     * </tr>
     * <tr>
     * <td>U+2010</td>
     * <td>hyphen</td>
     * </tr>
     * <tr>
     * <td>U+2011</td>
     * <td>non-breaking hyphen</td>
     * </tr>
     * <tr>
     * <td>U+2012</td>
     * <td>figure dash</td>
     * </tr>
     * <tr>
     * <td>U+2013</td>
     * <td>en dash</td>
     * </tr>
     * <tr>
     * <td>U+2014</td>
     * <td>em dash</td>
     * </tr>
     * <tr>
     * <td>U+2015</td>
     * <td>horizontal bar</td>
     * </tr>
     * <tr>
     * <td>U+203E</td>
     * <td>overline</td>
     * </tr>
     * <tr>
     * <td>U+2043</td>
     * <td>hyphen bullet</td>
     * </tr>
     * <tr>
     * <td>U+207B</td>
     * <td>superscript minus sign</td>
     * </tr>
     * <tr>
     * <td>U+208B</td>
     * <td>subscript minus sign</td>
     * </tr>
     * <tr>
     * <td>U+2212</td>
     * <td>minus sign</td>
     * </tr>
     * <tr>
     * <td>U+23AF</td>
     * <td>horizontal line extension</td>
     * </tr>
     * <tr>
     * <td>U+23E4</td>
     * <td>straightness</td>
     * </tr>
     * <tr>
     * <td>U+2500</td>
     * <td>box drawings light horizontal</td>
     * </tr>
     * <tr>
     * <td>U+2501</td>
     * <td>box drawings heavy horizontal</td>
     * </tr>
     * <tr>
     * <td>U+2E3A</td>
     * <td>two-em dash</td>
     * </tr>
     * <tr>
     * <td>U+2E3B</td>
     * <td>three-em dash</td>
     * </tr>
     * <tr>
     * <td>U+2796</td>
     * <td>heavy minus sign</td>
     * </tr>
     * <tr>
     * <td>U+29FF</td>
     * <td>miny</td>
     * </tr>
     * <tr>
     * <td>U+FE63</td>
     * <td>small hyphen-minus</td>
     * </tr>
     * <tr>
     * <td>U+FF0D</td>
     * <td>fullwidth hyphen-minus</td>
     * </tr>
     * </table>
     */
    public static boolean isUnicodeHyphen(char ch) {
        return unicodeHyphens[ch];
    }

    /**
     * Removes any unicode hyphen from a given input string.
     *
     * @param s input text
     * @return the given text without any unicode hyphen
     * @see #isUnicodeHyphen(char)
     */
    public static String removeAllHyphens(String s) {
        return hyphenPattern.matcher(s).replaceAll("");
    }

    /**
     * Replaces any unicode hyphen with a simple dash.
     *
     * @param s input text
     * @return the given text with normalized dashes.
     * @see #isUnicodeHyphen(char)
     */
    public static String normalizeHyphens(String s) {
        return hyphenPattern.matcher(s).replaceAll("-");
    }

}
