package com.agniadvani;

public class Hamburger {
    private String breadRoll;
    private String meat;
    private double hamburgerPrice;
    private double price1;
    private double price2;
    private double price3;
    private double price4;
    private String addItem1;
    private String addItem2;
    private String addItem3;
    private String addItem4;


    public Hamburger(double hamburgerPrice, String breadRoll, String meat) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.hamburgerPrice = hamburgerPrice;
    }

    public void addCheese() {
        System.out.println("Cheese added");
        this.price1 = 0.5;
        this.addItem1 = "Cheese ";
    }

    public void addTomato() {
        System.out.println("Tomato added");
        this.price2 += 0.5;
        this.addItem2 = "Tomato ";
    }

    public void addLettuce() {
        System.out.println("Lettuce added");
        this.price3 += 0.5;
        this.addItem3 = "Lettuce ";
    }

    public void addOnion() {
        System.out.println("Onion added");
        this.price4 += 0.5;
        this.addItem4 = "Onion ";
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public double itemizeBurger() {
        System.out.println("Hamburger made of " + breadRoll + " base bread and " + meat + " meat.");
        if (addItem1 != null) {
            System.out.println("Purchased " + addItem1 + " for " + price1);
            hamburgerPrice += price1;
        }
        if (addItem2 != null) {
            System.out.println("Purchased " + addItem2 + " for " + price2);
            hamburgerPrice += price2;
        }
        if (addItem3 != null) {
            System.out.println("Purchased " + addItem3 + " for " + price3);
            hamburgerPrice += price3;
        }
        if (addItem4 != null) {
            System.out.println("Purchased " + addItem4 + " for " + price4);
            hamburgerPrice += price4;
        }
        return hamburgerPrice;
    }
}
