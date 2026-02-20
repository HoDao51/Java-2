package buoi4.lythuyet.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private String name;
    private List<Product> productList;

    public Catalog(String name) {
        this.name = name;
        productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }
}
