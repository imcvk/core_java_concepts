package org.advanced_java.functional_programming.predicate_demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ProductSearch {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.addAll(
                List.of(new Product("MacBook Pro", 2500),
                        new Product("Dell Inspiron", 800),
                        new Product("iPhone 15 pro", 1200),
                        new Product("iPhone 16 pro", 1200),
                        new Product("Mac air M1 pro", 1200),
                        new Product("Mac Air m2 pro", 1200),
                        new Product("Samsung tab", 1200),
                        new Product("Samsung galaxy book", 1200),
                        new Product("Samsung galaxy book pro", 1200)
                ));
        Predicate<Product> proProduct= p->p.getName().contains("pro");
        products.stream().filter(proProduct).forEach(System.out::println);
    }
}
@Getter
@Setter
@ToString
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}