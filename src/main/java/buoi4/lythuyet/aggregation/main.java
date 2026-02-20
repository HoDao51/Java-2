package buoi4.lythuyet.aggregation;

public class main {
    public static void main(String[] args) {
        Product p = new Product("Laptop", 1000);
        Catalog c = new Catalog("Electronics");
        c.addProduct(p);
    }
}
