package com.agniadvani;

public class HealthyBurger extends Hamburger {
    private String healthyBurger1;
    private double healthyBurger1Price;
    private String healthyBurger2;
    private double healthyBurger2Price;
    private double totalPrice;

    public HealthyBurger(double basePrice, String meat) {
        super(basePrice, "wheat rye", meat);
        this.totalPrice = basePrice;
    }

    public void addSpinach() {
        this.healthyBurger1 = "Spinach";
        this.healthyBurger1Price = 0.5;
    }

    public void addPickles() {
        this.healthyBurger2 = "Pickles";
        this.healthyBurger2Price = 0.5;
    }

    @Override
    public double itemizeBurger() {
        double hamburgerPrice = super.itemizeBurger();
        if(healthyBurger1 != null){
            System.out.println("Purchased "+healthyBurger1+" for "+healthyBurger1Price);
            hamburgerPrice += healthyBurger1Price;
        }
        if(healthyBurger2 != null){
            System.out.println("Purchased "+healthyBurger2+" for "+healthyBurger2Price);
            hamburgerPrice += healthyBurger2Price;
        }
        return hamburgerPrice;
    }
}
