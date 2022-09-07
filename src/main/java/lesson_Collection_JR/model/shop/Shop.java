package lesson_Collection_JR.model.shop;

import java.util.HashSet;
import java.util.Set;

public class Shop {
    private Set<Product> products = createProductsList();

    public Shop(Set<Product> products) {
        this.products = products;
    }

    public Shop() {
    }

    private static Set<Product> createProductsList () {
        Set<Product> products = new HashSet<>();
        products.add(new Product("Carrot", 1.1));
        products.add(new Product("Potato", 1.4));
        products.add(new Product("Sugar", 1.8));

        return  products;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "products=" + products +
                '}';
    }
}
