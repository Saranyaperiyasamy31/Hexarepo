package com.project.dao;

import java.util.*;

import com.project.entity.Customer;
import com.project.entity.Product;

public interface OrderProcessorRepository {
    void createProduct(Product product);
    void createCustomer(Customer customer);
    void deleteProduct(int productId);
    void deleteCustomer(int customerId);
    void addToCart(Customer customer, Product product, int quantity);
    void removeFromCart(Customer customer, Product product);
    List<Product> getAllFromCart(Customer customer);
    void placeOrder(Customer customer, List<Map<Product, Integer>> items, String shippingAddress);
    List<Map<Product, Integer>> getOrdersByCustomer(int customerId);
}

