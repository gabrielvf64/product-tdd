package com.gabrielvicente.packt;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private Float totalAmount = 0F;

    private List<Product> productList = new ArrayList<>();

    public void addToCart(Product product) {
        productList.add(product);
        totalAmount = totalAmount + product.getPrice();
    }

    public void removeFromCart(Product product) {
        productList.remove(product);
    }

    public void emptyCart() {
        productList.clear();
    }

    public Float getTotalAmount() {
        return totalAmount;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void printCartDetails() {
        System.out.println("Here are the products of your shopping cart: ");
        for (Product product : getProductList()) {
            System.out.println("==============================================");
            System.out.println("Product id: " + product.getId());
            System.out.println("Product name: " + product.getName());
            System.out.println("Product description: " + product.getDescription());
            System.out.println("Product price: " + product.getPrice());
            System.out.println("==============================================");
        }

        System.out.println("Shopping cart total: " + totalAmount);
    }
}
