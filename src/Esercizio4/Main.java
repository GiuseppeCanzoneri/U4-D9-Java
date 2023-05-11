package Esercizio4;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, LocalDate.of(2021, 2, 15), 2, 
                List.of(new Product("Sneakers", "Men", 80.0),
                        new Product("T-shirt", "Men", 30.0))));
        orders.add(new Order(2, LocalDate.of(2021, 3, 10), 1, 
                List.of(new Product("Jeans", "Women", 50.0))));
        orders.add(new Order(3, LocalDate.of(2021, 4, 5), 2, 
                List.of(new Product("Hoodie", "Men", 45.0),
                        new Product("Socks", "Men", 10.0))));
        orders.add(new Order(4, LocalDate.of(2021, 2, 25), 2, 
                List.of(new Product("Hat", "Men", 20.0),
                        new Product("Gloves", "Men", 15.0))));
        
        LocalDate start = LocalDate.of(2021, 2, 1);
        LocalDate end = LocalDate.of(2021, 4, 1);
        
        List<Product> productsOrdered = new ArrayList<>();
        
        for (Order order : orders) {
            LocalDate orderDate = order.getOrderDate();
            int customerTier = order.getCustomerTier();
            if (orderDate.isAfter(start) && orderDate.isBefore(end) && customerTier == 2) {
                List<Product> products = order.getProducts();
                productsOrdered.addAll(products);
                System.out.println("Order date: " + orderDate.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
                for (Product product : products) {
                    System.out.println("Product: " + product.getName() + " | Category: " + product.getCategory() + " | Price: " + product.getPrice());
                }
            }
        }
    }
}




