package com.project.main;

import com.project.dao.OrderProcessorRepository;
import com.project.dao.OrderProcessorRepositoryImpl;
import com.project.entity.Customer;
import com.project.entity.Product;

import java.util.*;

public class EcomApp {
    public static void main(String[] args) {
        OrderProcessorRepository repo = new OrderProcessorRepositoryImpl();

        // Create customer
        Customer c1 = new Customer(1, "Suba", "suba@gmail.com", "1234");
        repo.createCustomer(c1);

        // Create products
        Product p1 = new Product(101, "Laptop", 80000, "Gaming Laptop", 10);
        Product p2 = new Product(102, "Mouse", 500, "Wireless Mouse", 50);
        repo.createProduct(p1);
        repo.createProduct(p2);

        // Add to cart
        repo.addToCart(c1, p1, 1);
        repo.addToCart(c1, p2, 2);

        // Show cart
        List<Product> cartItems = repo.getAllFromCart(c1);
        System.out.println("view cart " + c1.getName() + ":");
        for (Product p : cartItems) {
            System.out.println(p.getName());
        }

        // Place order
        List<Map<Product, Integer>> orderItems = new ArrayList<>();
        Map<Product, Integer> item1 = new HashMap<>();
        item1.put(p1, 1);
        Map<Product, Integer> item2 = new HashMap<>();
        item2.put(p2, 2);
        orderItems.add(item1);
        orderItems.add(item2);

        repo.placeOrder(c1, orderItems, "123 Street, City");
        
     // View order
        List<Map<Product, Integer>> orderHistory = repo.getOrdersByCustomer(c1.getCustomerId());
        System.out.println("View customer order " + c1.getName() + ":");
        for (Map<Product, Integer> order : orderHistory) {
            for (Map.Entry<Product, Integer> e : order.entrySet()) {
                System.out.println(e.getKey().getName() + " x" + e.getValue());
            }
        }

        }
    }
