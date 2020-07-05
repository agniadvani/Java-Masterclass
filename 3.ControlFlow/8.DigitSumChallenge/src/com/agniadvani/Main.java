package com.agniadvani;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigit(125));
    }

    public static int sumDigit(int n) {
        int sum = 0;
        if (n < 10) {
            return -1;
        }
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        return sum;
    }
}
