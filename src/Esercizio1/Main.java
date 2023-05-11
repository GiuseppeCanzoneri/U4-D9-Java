package Esercizio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("The Alchemist", "Books", 150.0 ));
        products.add(new Product("Harry Potter and the Philosopher's Stone", "Books", 200.0  ));
        products.add(new Product("The Lord of the Rings", "Books", 120.0 ));
        products.add(new Product("The Da Vinci Code", "Books", 80.0 ));
        products.add(new Product("To Kill a Mockingbird", "Books", 110.0 ));
        products.add(new Product("Giovane Holden", "Books", 11.90 ));
        products.add(new Product("DSM-5", "Books", 150.0 ));
        
        
        
        
        // filtra i prodotti che appartengono alla categoria "Books" e hanno un prezzo maggiore di 100
        List<Product> expensiveBooks = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equals("Books") && product.getPrice() > 100) {
                expensiveBooks.add(product);
            }
        }
        
        // stampa i prodotti filtrati
        for (Product product : expensiveBooks) {
            System.out.println(product.getName() + " - " + product.getPrice()+ "€");
        }
    }
}