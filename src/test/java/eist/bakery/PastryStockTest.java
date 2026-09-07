package eist.bakery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PastryStockTest {

    private PastryStock stock;

    @BeforeEach
    void setUp() {
        stock = new PastryStock();
        stock.stockPastry("Croissant", 2, 3);
        stock.stockPastry("Bagel", 0, 2);
    }

    @Test
    void testGetPastryReturnsNullForUnknown() {
        assertNull(stock.getPastry("Pretzel"));
    }

    @Test
    void testGetPastryReturnsCorrectStockAndPrice() {
        Pastry croissant = stock.getPastry("Croissant");
        assertNotNull(croissant);
        assertEquals(2, croissant.getStock());
        assertEquals(3, croissant.getPrice());
    }

    @Test
    void testQueryStockReturnsAmountOrMinusOne() {
        assertEquals(2, stock.queryStock("Croissant"));
        assertEquals(-1, stock.queryStock("Pretzel"));
    }

    @Test
    void testBuyPastryDecrements() {
        assertTrue(stock.buyPastry("Croissant"));
        assertEquals(1, stock.queryStock("Croissant"));
    }

    @Test
    void testBuyPastryReturnsFalseWhenOutOfStock() {
        assertFalse(stock.buyPastry("Bagel"));
        assertEquals(0, stock.queryStock("Bagel"));
    }

    @Test
    void testBuyPastryReturnsFalseForUnknownPastry() {
        assertFalse(stock.buyPastry("Pretzel"));
    }

    @Test
    void testBuyPastryDrainsStockCompletely() {
        assertTrue(stock.buyPastry("Croissant"));
        assertTrue(stock.buyPastry("Croissant"));
        assertFalse(stock.buyPastry("Croissant"));
        assertEquals(0, stock.queryStock("Croissant"));
    }
}
