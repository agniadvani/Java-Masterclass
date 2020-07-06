package com.agniadvani;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        while (counter <= 10) {
            System.out.println("Enter number " + counter + ":");
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                counter++;
                sum += num;
            } else {
                System.out.println("Enter a valid number");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("The sum = " + sum);
    }
}
