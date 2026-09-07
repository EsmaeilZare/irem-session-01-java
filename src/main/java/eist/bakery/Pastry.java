package eist.bakery;

/** Given. Do not change field names — exam JSON/tests depend on names like these. */
public class Pastry {
    private final String name;
    private int stock;
    private final int price;

    public Pastry(String name, int stock, int price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public int getPrice() {
        return price;
    }

    void setStock(int stock) {
        this.stock = stock;
    }
}
