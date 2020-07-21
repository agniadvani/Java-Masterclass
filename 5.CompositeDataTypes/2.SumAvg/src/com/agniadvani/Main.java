package com.agniadvani;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] values = getInteger(5);
        printValues(values);
        System.out.println("Sum of integers = " + sum(values));
        System.out.println("Average of integers = " + average(values));
    }

    public static int[] getInteger(int number) {
        int[] values = new int[number];
        System.out.println("Enter " + number + " integers.\r");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element #" + i + " is " + array[i]);
        }
    }

    public static double sum(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    public static double average(int[] values) {
        double total = sum(values);
        return total / values.length;
    }
}
