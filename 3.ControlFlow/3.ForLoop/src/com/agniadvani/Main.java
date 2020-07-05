package com.agniadvani;

public class Main {

    public static void main(String[] args) {
        for (int i = 8; i > 1; i--) {
            System.out.println("Interest for $10000 at " + i + "% rate will be $" + String.format("%.2f", calculateInterest(10000, i)));
        }
    }

    public static double calculateInterest(double amount, double rate) {
        return (amount * (rate / 100));
    }
}
    