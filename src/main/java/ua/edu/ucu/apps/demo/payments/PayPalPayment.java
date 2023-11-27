package ua.edu.ucu.apps.demo.payments;

public class PayPalPayment implements Payment {
    @Override
    public double pay(double price) {
        System.out.println("PayPal method");
        return price;
    }

}
