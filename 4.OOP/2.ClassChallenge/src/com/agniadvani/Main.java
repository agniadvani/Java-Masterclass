package com.agniadvani;

public class Main {

    public static void main(String[] args) {
        BankAccount mickJagger = new BankAccount("Mick Jagger", "mickjag@rollingstones.com", 123344555555L);
        BankAccount rogerWaters = new BankAccount();
        System.out.println(mickJagger.getAccountNumber());
        System.out.println(mickJagger.getCustomerName());
        System.out.println(mickJagger.getEmail());
        System.out.println(mickJagger.getPhoneNumber());
        System.out.println(mickJagger.getBalance());
        System.out.println(rogerWaters.getAccountNumber());
        System.out.println(rogerWaters.getCustomerName());
        System.out.println(rogerWaters.getEmail());
        System.out.println(rogerWaters.getPhoneNumber());
    }
}
