package com.company;

public class Main {

    public static void main(String[] args) {
        double doubleValue = 20d;
        double anotherDoubleValue = 80d;
        double operatedValue = (doubleValue + anotherDoubleValue) * 100.00d;
        double remainder = operatedValue % 40.00;
        boolean isRemainderZero = (remainder == 0) ? true : false;
        System.out.println(isRemainderZero);
        if (!isRemainderZero){
            System.out.println("Got some remainder");
        }
    }
}
