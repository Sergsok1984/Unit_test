package Shop;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> sortProductsByPrice() {
        products.sort(Comparator.comparingDouble(Product::getPrice));
        return products;
    }

    public Product getMostExpensiveProduct() {
        return Collections.max(products, Comparator.comparingDouble(Product::getPrice));

    }
}
