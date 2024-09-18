package net.creativecouple.validation.isbn;

import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ISBNRangesLoaderTest {

    @Test
    void name() throws Exception {
        URL url = getClass().getResource("/simple-ranges.txt");
        assertNotNull(url);
        ISBNRangesLoader loader = new ISBNRangesLoader(url);

        Map<String, String> agencies = new HashMap<>();
        agencies.put("978", "International ISBN Agency");
        agencies.put("979", "International ISBN Agency");
        agencies.put("978-0", "English language");
        agencies.put("979-10", "France");
        assertEquals(agencies, loader.getAgencies());

        assertNotNull(loader.getRangeData());
    }
}