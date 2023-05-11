package Esercizio4;

import java.time.LocalDate;

import java.util.List;

public class Order {
    private int orderId;
    private LocalDate orderDate;
    private int customerTier;
    private List<Product> products;

    public Order(int orderId, LocalDate orderDate, int customerTier, List<Product> products) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.customerTier = customerTier;
        this.products = products;
    }

    public int getOrderId() {
        return orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public int getCustomerTier() {
        return customerTier;
    }

    public List<Product> getProducts() {
        return products;
    }
}