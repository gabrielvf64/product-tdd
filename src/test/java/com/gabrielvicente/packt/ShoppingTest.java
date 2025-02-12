package com.gabrielvicente.packt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    @DisplayName("Test if products added to shopping cart successfully")
    public void test_products_added_to_ShoppingCart() {
        // GIVEN two products in the shopping cart

        // WHEN
        Product newProduct = new Product(3, "New External Hard drive", "1 TB USB Drive", 79.9F);
        checkout.addToCart(newProduct);

        // THEN
        assertEquals(3, checkout.getProductList().size());
    }

    @Test
    @DisplayName("Test if shopping cart total amount is calculated correctly")
    public void test_ShoppingCart_amount() {
        // GIVEN two products in the shopping cart

        // THEN
        assertEquals(2, checkout.getProductList().size());
        assertEquals(99.8F, checkout.getTotalAmount());
    }

    @Test
    @DisplayName("Test if due amount is calculated correctly")
    public void test_due_amount_calculation() {
        // GIVEN two products in the shopping cart

        // WHEN
        checkout.pay(90.8F);

        // THEN
        assertEquals(9.0F, (float) checkout.getPaymentDue());
    }

    @Test
    @DisplayName("Test if product removed from cart correctly")
    public void test_product_removal_from_cart() {
        // GIVEN two products in the shopping cart

        // WHEN
        checkout.removeFromCart(firstProduct);

        // THEN
        assertEquals(1, checkout.getProductList().size());
        assertEquals(79.9F, (float) checkout.getTotalAmount());
    }

    @Test
    @DisplayName("Test if payment is correct")
    public void test_if_payment_status_is_correct() {
        // GIVEN two products in the shopping cart

        // WHEN
        checkout.pay(99.8F);
        checkout.complete();

        // THEN
        assertEquals(PaymentStatus.DONE, checkout.getPaymentStatus());
    }
}
