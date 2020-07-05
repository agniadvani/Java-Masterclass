package com.agniadvani;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int i = 4;
        int finishLoop = 20;
        while (i <= finishLoop) {
            if (isEvenNum(i)) {
                System.out.println(i + " is an even number");
                count++;
                if (count == 5) {
                    System.out.println("Even number count = " + count);
                    break;
                }
            } else {
                System.out.println(i + " is an odd number");
            }
            i++;
        }
    }

    public static boolean isEvenNum(int n) {
        return n % 2 == 0;
    }
}
