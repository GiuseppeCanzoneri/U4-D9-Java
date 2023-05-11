package Esercizio3;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Nike Air-Force-One", "Boys", 120.0));
        products.add(new Product("T-shirt-Nike", "Boys", 50.0));
        products.add(new Product("Jeans-Calvin Klein", "Boys", 35.0));
        products.add(new Product("Nike Jordan", "Boys", 200.0));
        
        // applica il 10% di sconto ai prodotti nella categoria "Boys"
        for (Product product : products) {
            if (product.getCategory().equals("Boys")) {
                double discountedPrice = product.getPrice() * 0.9;
                product.setPrice(discountedPrice);
            }
        }
        
        // stampa i prodotti nella categoria "Boys" con i prezzi scontati
        System.out.println("Boys products with 10% discount:");
        for (Product product : products) {
            if (product.getCategory().equals("Boys")) {
                System.out.println(product.getName() + " - " + product.getPrice()+ "€");
            }
        }
    }
}