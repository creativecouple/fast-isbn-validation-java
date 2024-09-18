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

package net.creativecouple.validation.isbn;

import net.creativecouple.validation.isbn.ISBN.Hyphenation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

/**
 * This class offers static data from the auto-generated resource file <code>isbn-ranges.data</code> for ISBN range
 * definitions given by the <a href="https://www.isbn-international.org/">international ISBN agency</a>.
 *
 * @author Peter Liske (CreativeCouple)
 */
final class ISBNRangesLoader {
    private final BufferedReader input;

    private final Map<String, Object> indexMap = new HashMap<>();
    private final Map<Object, String> reverseMap = new HashMap<>();

    private final Class<?>[] elemClasses = {Hyphenation[][][][][][][][][][][][].class,
            Hyphenation[][][][][][][][][][][].class, Hyphenation[][][][][][][][][][].class,
            Hyphenation[][][][][][][][][].class, Hyphenation[][][][][][][][].class, Hyphenation[][][][][][][].class,
            Hyphenation[][][][][][].class, Hyphenation[][][][][].class, Hyphenation[][][][].class,
            Hyphenation[][][].class, Hyphenation[][].class, Hyphenation[].class, Hyphenation.class};

    private final Map<String, String> agencies;
    private final Hyphenation[][][][][][][][][][][][][] rangeData;

    ISBNRangesLoader(URL url) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            input = reader;
            skipHeader();
            agencies = parseAgencies();
            parseHyphenations();
            rangeData = (Hyphenation[][][][][][][][][][][][][]) parseRangeData(0, 0);
        }
    }

    public Map<String, String> getAgencies() {
        return agencies;
    }

    public Hyphenation[][][][][][][][][][][][][] getRangeData() {
        return rangeData;
    }

    private void skipHeader() throws IOException {
        String line;
        do {
            line = input.readLine();
        } while (line != null && !line.isEmpty());
    }

    private Map<String, String> parseAgencies() throws IOException {
        Map<String, String> result = new HashMap<>();
        String line;
        do {
            line = input.readLine();
        } while (line.isEmpty());
        do {
            result.put(line.substring(0, line.indexOf(' ')), line.substring(line.indexOf(' ') + 1));
            line = input.readLine();
        } while (line != null && !line.isEmpty());
        return result;
    }

    private Object parseRangeData(int depth, int weightedSum) throws IOException {
        Object result = Array.newInstance(elemClasses[depth], '9' + 1);
        for (int i = 0, data; i <= 9; ) {
            int newWeightedSum = (weightedSum + ((depth & 1) << 1 | 1) * i) % 10;
            if ((data = input.read()) < 0) {
                throw new IllegalStateException("unexpected EOF");
            } else if (data <= ' ') {
                Array.set(result, '0' + i++, parseRangeData(depth + 1, newWeightedSum));
            } else if (data >= 'A') {
                Array.set(result, '0' + i++, getHyphenationArray("" + (char) data, depth + 1, newWeightedSum));
            } else {
                for (int j = data; j > '0'; j--) {
                    Array.set(result, '0' + i++, getNullHyphenationArray(depth + 1));
                }
            }
        }
        return result;
    }

    private void parseHyphenations() throws IOException {
        String line;
        do {
            line = input.readLine();
        } while (line.isEmpty());
        do {
            String name = line.substring(0, line.indexOf(' '));
            String value = line.substring(line.indexOf(' ') + 1);
            String[] split = value.split("-");
            indexMap.put("0_" + name, new Hyphenation(Integer.parseInt(split[0]), Integer.parseInt(split[1]),
                    Integer.parseInt(split[2])));
            line = input.readLine();
        } while (line != null && !line.isEmpty());
    }

    @SuppressWarnings("unchecked")
    private <T> T getHyphenationArray(String name, int depth, int weightedSum) {
        return depth == 13 ? (T) indexMap.get(weightedSum + "_" + name)
                : (T) getOrFindOrCreateArray(weightedSum + "_" + name + "_" + depth, elemClasses[depth],
                i -> getHyphenationArray(name, depth + 1, (weightedSum + ((depth & 1) << 1 | 1) * i) % 10));
    }

    @SuppressWarnings("unchecked")
    private <T> T getNullHyphenationArray(int depth) {
        return depth == 13 ? null : (T) getOrFindOrCreateArray("null_" + depth, elemClasses[depth],
                i -> getNullHyphenationArray(depth + 1));
    }

    private Object getOrFindOrCreateArray(String key, Class<?> elemClass, IntFunction<?> elemCreate) {
        Object result = indexMap.get(key);
        if (result == null) {
            Object[] elems = IntStream.range(0, 10).mapToObj(elemCreate).toArray();
            String existingKey = reverseMap.computeIfAbsent(Arrays.asList(elems), ignore -> key);
            if (existingKey.equals(key)) {
                indexMap.put(key, result = Array.newInstance(elemClass, '9' + 1));
                for (int i = 0; i <= 9; i++) {
                    Array.set(result, '0' + i, elems[i]);
                }
            } else {
                indexMap.put(key, result = indexMap.get(existingKey));
            }
        }
        return result;
    }

}