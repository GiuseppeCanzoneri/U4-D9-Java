package Esercizio2;

import java.util.List;

public class Order {
    private int orderNumber;
    private List<Product> products;

    public Order(int orderNumber, List<Product> products) {
        this.orderNumber = orderNumber;
        this.products = products;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public List<Product> getProducts() {
        return products;
    }
    public double getTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }}
