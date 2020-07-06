package com.agniadvani;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (true) {
            System.out.println("Enter a number:");
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();

                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            
            } else {
                System.out.println("invalid input.");
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Minimum number is " + min + " and Maximum number is " + max);
        scanner.close();
    }
}
