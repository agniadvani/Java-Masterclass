package com.agniadvani;

public class BankAccount {
    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;

     //constructors
    public BankAccount() {
        this("Default name", "example@email.id", 1234567899L, 1234567899L, 0000.0);
        System.out.println("Empty constructor called.");
    }

    public BankAccount(String name, String emailID, long phoneNumber, long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = name;
        this.email = emailID;
        this.phoneNumber = phoneNumber;
        System.out.println("Constructor with parameters called.");
    }

    public BankAccount(String name, String emailID, long phoneNumber) {
        this(name, emailID, phoneNumber, 1234567899L, 0000.0);
    }

    //setters
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public void setEmail(String emailID) {
        this.email = emailID;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //getters

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    //misc. methods
    public void depositFunds(double amount) {
        balance += amount;
    }

    public void withdrawFunds(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds, withdrawal request = " + amount + ", Balance = " + this.balance + ", Insufficient amount = " + (amount - this.balance));
        } else {
            balance -= amount;
        }
    }
}