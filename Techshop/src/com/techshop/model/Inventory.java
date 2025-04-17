package com.techshop.model;

public class Inventory {
    private int productId;
    private int quantityInStock;

    public Inventory() {}

    public Inventory(int productId, int quantityInStock) {
        this.productId = productId;
        this.quantityInStock = quantityInStock;
    }

    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public int getQuantityInStock() { return quantityInStock; }
    public void setQuantityInStock(int quantityInStock) { this.quantityInStock = quantityInStock; }

	@Override
	public String toString() {
		return "Inventory [productId=" + productId + ", quantityInStock=" + quantityInStock + "]";
	}

    
    }