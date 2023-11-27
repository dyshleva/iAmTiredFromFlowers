package ua.edu.ucu.apps.demo.payments;

public class CreditCardPayment implements Payment {
    @Override
    public double pay(double price) {
        System.out.println("Credit Card method");
        return price;
    }

}
