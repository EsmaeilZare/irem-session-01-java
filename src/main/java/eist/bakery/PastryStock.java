package eist.bakery;

/**
 * Session 1 live kata / homework. Same shape as Bakery DatabaseAdapter:
 * store by name, query, buy, unknown → null / -1 / false.
 *
 * Only fill in the TODO methods. Do not rename them.
 */
public class PastryStock {

    // TODO: hold pastries by name. HashMap is the right tool.

    public void stockPastry(String name, int stock, int price) {
        // TODO: add or replace the pastry under this name.
        throw new UnsupportedOperationException("TODO");
    }

    public Pastry getPastry(String name) {
        // TODO: return the pastry, or null if it was never stocked.
        throw new UnsupportedOperationException("TODO");
    }

    public int queryStock(String name) {
        // TODO: current stock, or -1 if unknown. Same contract as Bakery GET /stock/{name}.
        throw new UnsupportedOperationException("TODO");
    }

    public boolean buyPastry(String name) {
        // TODO: if unknown or stock is 0 → false, leave state unchanged.
        // TODO: otherwise decrement stock by 1 and return true.
        throw new UnsupportedOperationException("TODO");
    }
}
