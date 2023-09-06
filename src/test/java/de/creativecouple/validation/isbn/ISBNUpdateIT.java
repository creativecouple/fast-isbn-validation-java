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

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ISBNUpdateIT {

    @Test
    void updateRangeDefinitionsOnline() {
        String groupName1 = ISBN.valueOf("9780639963549").getGroupName();
        assertThat(groupName1).isEqualTo("English language");
        String groupName2 = ISBN.valueOf("9780639964744").getGroupName();
        assertThat(groupName2).isSameAs(groupName1);

        ISBN.updateRangeDefinition();

        String groupName3 = ISBN.valueOf("9780639963549").getGroupName();
        assertThat(groupName3).isEqualTo(groupName1);
        assertThat(groupName3).isNotSameAs(groupName1);
        String groupName4 = ISBN.valueOf("9780639964744").getGroupName();
        assertThat(groupName4).isSameAs(groupName3);
    }
}