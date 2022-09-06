package lesson_Collection_JR.logic;

import lesson_Collection_JR.model.shop.Product;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();
        products.add(new Product("Carrot", 1.1));
        products.add(new Product("Potato", 1.4));
        products.add(new Product("Carrot", 1.1));

        for (Product product : products
             ) {
            System.out.println(product);
        }
    }
}
