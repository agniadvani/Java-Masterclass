package com.agniadvani;

public class DeluxeBurger extends Hamburger{
    private String fries;
    public DeluxeBurger( String breadRoll, String meat) {
        super(6, breadRoll, meat);
    }

    @Override
    public double itemizeBurger() {
        System.out.println("Coke and Fries added with Deluxe Meal");
        return 6;
    }
}
