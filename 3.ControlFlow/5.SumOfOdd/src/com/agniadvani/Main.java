package com.agniadvani;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                sum += i;
            }
        }
        System.out.println("The sum of odd numbers upto 100 = "+sum);
    }
}
