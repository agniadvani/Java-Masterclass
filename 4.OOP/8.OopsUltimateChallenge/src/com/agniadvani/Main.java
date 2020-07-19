package com.agniadvani;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger(3, "rye", "chicken");
        HealthyBurger healthyBurger = new HealthyBurger(5, "beef");
        DeluxeBurger deluxeBurger = new DeluxeBurger("rye", "chicken");
        hamburger.addCheese();
        hamburger.addLettuce();
        hamburger.addOnion();
        hamburger.addTomato();
        System.out.println(hamburger.itemizeBurger());

        healthyBurger.addLettuce();
        healthyBurger.addTomato();
        healthyBurger.addPickles();
        healthyBurger.addSpinach();
        System.out.println(healthyBurger.itemizeBurger());

        System.out.println(deluxeBurger.itemizeBurger());
    }
}
