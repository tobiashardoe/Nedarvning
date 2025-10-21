public class Product {
    private String name;
    private int price;

    public Product(int price, String name) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ": " + price + "kr";
    }
}
