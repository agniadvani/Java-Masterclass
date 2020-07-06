package com.agniadvani;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = scanner.nextLine();
        System.out.println("Enter your year of birth:");
        if (scanner.hasNextInt()) {
            int dob = scanner.nextInt();
            int age = 2020 - dob;
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + " and your age is " + age + ".");
            } else {
                System.out.println("Invalid Year Of Birth.");
            }
        } else {
            System.out.println("Invalid Year of birth.");
        }
        scanner.close();
    }
}
