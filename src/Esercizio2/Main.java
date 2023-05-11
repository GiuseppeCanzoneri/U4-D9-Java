package Esercizio2;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Pannolini, Pampers", "Baby", 20.0));
        products.add(new Product("Ciuccio Chicco", "Baby", 10.0));
        products.add(new Product("Biberon Chicco", "Baby", 13.0));
        products.add(new Product("Passeggino Chicco", "Baby", 499.0));
        products.add(new Product("Borsa Chicco", "Baby", 40.0));
        
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, products));
        orders.add(new Order(2, products.subList(1, 3))); // crea un ordine con alcuni prodotti dalla posizione 1 alla 3 (esclusa)
        
        // stampa i prodotti di ogni ordine che appartengono alla categoria "Baby"
        for (Order order : orders) {
            System.out.println("Order " + order.getOrderNumber() + ":");
            double orderTotal = 0;
            for (Product product : order.getProducts()) {
                if (product.getCategory().equals("Baby")) {
                    System.out.println(product.getName() + " - " + product.getPrice() + "€");
                    orderTotal += product.getPrice();
                }
            }
            System.out.println("Total: " + orderTotal);
        }
    }
}

