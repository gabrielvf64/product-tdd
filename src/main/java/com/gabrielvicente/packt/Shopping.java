package com.gabrielvicente.packt;

public class Shopping {
    public static void main(String[] args) {

        Product firstProduct = new Product(1, "USB drive", "120 GB USB Drive", 19.9F);
        Product secondProduct = new Product(2, "External Hard drive", "1 TB USB Drive", 120.0F);

        Checkout checkout = new Checkout();
        checkout.addToCart(firstProduct);
        checkout.addToCart(secondProduct);

        checkout.pay(90F);
        checkout.complete();
    }
}
