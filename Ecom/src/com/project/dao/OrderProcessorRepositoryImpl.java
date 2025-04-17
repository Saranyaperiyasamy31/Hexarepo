package com.project.dao;

import com.project.entity.Customer;
import com.project.entity.Product;

import java.util.*;

public class OrderProcessorRepositoryImpl implements OrderProcessorRepository {
    private List<Customer> customers = new ArrayList<>();
    private List<Product> products = new ArrayList<>();
    private Map<Integer, List<Map<Product, Integer>>> cart = new HashMap<>();
    private Map<Integer, List<Map<Product, Integer>>> orders = new HashMap<>();

    @Override
    public void createProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product.getName());
    }

    @Override
    public void createCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer added: " + customer.getName());
    }

    @Override
    public void deleteProduct(int productId) {
        products.removeIf(p -> p.getProductId() == productId);
        System.out.println("Product deleted: " + productId);
    }

    @Override
    public void deleteCustomer(int customerId) {
        customers.removeIf(c -> c.getCustomerId() == customerId);
        System.out.println("Customer deleted: " + customerId);
    }

    @Override
    public void addToCart(Customer customer, Product product, int quantity) {
        Map<Product, Integer> entry = new HashMap<>();
        entry.put(product, quantity);
        cart.computeIfAbsent(customer.getCustomerId(), k -> new ArrayList<>()).add(entry);
        System.out.println("Added to cart: " + product.getName() + " x" + quantity);
    }

    @Override
    public void removeFromCart(Customer customer, Product product) {
        List<Map<Product, Integer>> customerCart = cart.get(customer.getCustomerId());
        if (customerCart != null) {
            customerCart.removeIf(map -> map.containsKey(product));
            System.out.println("Removed from cart: " + product.getName());
        }
    }

    @Override
    public List<Product> getAllFromCart(Customer customer) {
        List<Product> cartItems = new ArrayList<>();
        List<Map<Product, Integer>> items = cart.get(customer.getCustomerId());
        if (items != null) {
            for (Map<Product, Integer> entry : items) {
                cartItems.addAll(entry.keySet());
            }
        }
        return cartItems;
    }

    @Override
    public void placeOrder(Customer customer, List<Map<Product, Integer>> items, String shippingAddress) {
        orders.put(customer.getCustomerId(), items);
        cart.remove(customer.getCustomerId()); // clear cart
        System.out.println("Order placed for customer " + customer.getName() + " to " + shippingAddress);
    }

    @Override
    public List<Map<Product, Integer>> getOrdersByCustomer(int customerId) {
        return orders.getOrDefault(customerId, new ArrayList<>());
    }
}

