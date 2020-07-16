package com.gabrielvicente.packt;

import java.util.Date;

public class Checkout extends Cart {

    private Float paymentAmount = 0F;

    private Float paymentDue = 0F;

    private Date paymentDate;

    private PaymentStatus paymentStatus;

    public Float getPaymentDue() {
        return paymentDue;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void pay(Float payment) {
        paymentAmount = payment;
        paymentDue = getTotalAmount() - paymentAmount;
        paymentDate = new Date();
    }

    public void confirmOrder() {
        if (paymentDue == 0) {
            System.out.println("Payment successful! Thanks for the order.");
        } else if (paymentDue > 0) {
            System.out.printf("Payment failed! Remaining %f needs to be paid", paymentDue);
        }
    }

    public void complete() {
        printCartDetails();
        confirmOrder();
    }
}
