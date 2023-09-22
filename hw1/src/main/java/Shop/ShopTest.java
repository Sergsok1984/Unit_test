package Shop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {
    private Shop shop;
    Product mostExpensiveProduct;

    @BeforeEach
    public void setUp() {
        shop = new Shop();
        List<Product> products = new ArrayList<>();
        products.add(new Product(15, "Apple"));
        products.add(new Product(45, "Orange"));
        shop.setProducts(products);

        mostExpensiveProduct = new Product(45, "Orange");
    }

    @Test
    public void testStoreProducts() {
        assertThat(shop.getProducts()).hasSize(2);
    }

    @Test
    public void testGetMostExpensiveProduct() {
        assertThat(shop.getMostExpensiveProduct().getPrice()).isEqualTo(mostExpensiveProduct.getPrice());
    }


    @Test
    public void testSortProductsByPrice() {
        List<Product> sortedProducts = shop.sortProductsByPrice();
        assertThat(sortedProducts).isSortedAccordingTo(Comparator.comparingInt(Product::getPrice));
    }
}
