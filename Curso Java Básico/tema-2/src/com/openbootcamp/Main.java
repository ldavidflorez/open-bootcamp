package com.openbootcamp;

public class Main {
    public static void main(String[] args) {
        double price = 1000;
        double iva = 20;

        double newPrice = computeIva(price, iva);

        System.out.println("The new price is:" + " " + newPrice);
    }

    static double computeIva(double price, double iva) {
        return price + price * iva / 100;
    }
}
