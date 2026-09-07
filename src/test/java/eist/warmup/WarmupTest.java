package eist.warmup;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WarmupTest {

    @Test
    void maxReturnsLarger() {
        assertEquals(3, Warmup.max(1, 3));
        assertEquals(3, Warmup.max(3, 1));
        assertEquals(2, Warmup.max(2, 2));
    }

    @Test
    void countCountsMatches() {
        assertEquals(0, Warmup.count(new String[] {}, "a"));
        assertEquals(2, Warmup.count(new String[] {"a", "b", "a"}, "a"));
        assertEquals(0, Warmup.count(new String[] {"a"}, "z"));
    }

    @Test
    void firstIndexKeepsFirstOccurrence() {
        Map<String, Integer> got = Warmup.firstIndex(List.of("croissant", "bagel", "croissant"));
        assertEquals(0, got.get("croissant"));
        assertEquals(1, got.get("bagel"));
        assertEquals(2, got.size());
    }
}
