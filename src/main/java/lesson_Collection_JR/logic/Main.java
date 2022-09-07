package lesson_Collection_JR.logic;

import lesson_Collection_JR.model.shop.Product;
import lesson_Collection_JR.model.shop.Shop;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop();
        System.out.println(shop.getProducts());

        for (Product product : shop.getProducts()) {
            if (product.getName().equals("Sugar")) {
                product.setPrice(0.8);
            }
        }
        System.out.println(shop.getProducts());

        List<Product> copy = new ArrayList<>(Arrays.asList(
                new Product("Carrot", 1.1),
                new Product("Potato", 1.4),
                new Product("Sugar", 1.8),
                new Product("Carrot", 1.1),
                new Product("Potato", 1.4),
                new Product("Sugar", 1.8)
        ));

        shop.setProducts(new HashSet<>(copy));

        System.out.println(shop.getProducts());
    }
}
