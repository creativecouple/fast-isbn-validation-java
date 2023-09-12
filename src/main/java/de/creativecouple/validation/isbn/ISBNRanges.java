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

import de.creativecouple.validation.isbn.ISBN.Hyphenation;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * This class offers static data from the auto-generated resource file <code>isbn-ranges.data</code> for ISBN range
 * definitions given by the <a href="https://www.isbn-international.org/">international ISBN agency</a>.
 *
 * @author Peter Liske (CreativeCouple)
 */
final class ISBNRanges {
    static final Hyphenation[][][][][][][][][][][][][] ranges = new Hyphenation['9' + 1][][][][][][][][][][][][];
    static final Map<String, String> agencies = new HashMap<>();

    private static final String LOCAL_RANGES_FILE = "isbn-ranges.data";
    private static final String REMOTE_RANGES_FILE = "https://raw.githubusercontent.com/creativecouple/isbn-validation-java/tmp-compact-tree/src/main/resources/de/creativecouple/validation/isbn/isbn-ranges.data";

    static {
        try {
            loadRangeDefinition(ISBNRanges.class.getResource(LOCAL_RANGES_FILE));
        } catch (Exception e) {
            throw new IllegalStateException("cannot read ISBN range data from " + LOCAL_RANGES_FILE, e);
        }
    }

    static void updateRangeDefinition() {
        try {
            loadRangeDefinition(new URL(REMOTE_RANGES_FILE));
        } catch (Exception e) {
            throw new IllegalStateException("cannot read ISBN range data from " + REMOTE_RANGES_FILE, e);
        }
    }

    private static void loadRangeDefinition(URL url) throws IOException {
        ISBNRangesLoader parser = new ISBNRangesLoader(url);
        agencies.putAll(parser.getAgencies());
        System.arraycopy(parser.getRangeData(), 0, ranges, 0, ranges.length);
    }

}