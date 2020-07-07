package com.agniadvani;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailID;


    public VipCustomer() {
        this("Default Name", 50000.0, "Default email");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "Default email");
    }

    public VipCustomer(String name, double creditLimit, String emailID) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailID = emailID;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailID() {
        return emailID;
    }
}
