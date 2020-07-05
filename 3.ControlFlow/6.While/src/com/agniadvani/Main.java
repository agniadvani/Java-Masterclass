package com.agniadvani;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        while (count != 6) {
            System.out.println("Count = " + count);
            count++;
        }
        count = 6;
        do {
            System.out.println("count value was " + count);
            count++;
            if (count > 100) {
                break;
            }
        } while (count != 6);
    }
}
