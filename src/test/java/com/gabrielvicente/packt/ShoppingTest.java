package com.gabrielvicente.packt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class ShoppingTest {

    private Product firstProduct;
    private Product secondProduct;
    private Checkout checkout;

    @BeforeEach
    @DisplayName("Given 2 products in the shopping cart")
    public void setup() {

        firstProduct = new Product(1, "USB drive", "120 GB USB Drive", 19.9F);
        secondProduct = new Product(2, "External Hard drive", "1 TB USB Drive", 79.9F);

        checkout = new Checkout();

        checkout.addToCart(firstProduct);
        checkout.addToCart(secondProduct);
    }

}
