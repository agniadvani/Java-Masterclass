package com.agniadvani;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] values = getIntegers(5);
        printArray(values);
        int[] sortedArray = sortArray(values);
        System.out.println("");
        System.out.println("Sorted Array:");
        printArray(sortedArray);
    }

    public static int[] getIntegers(int number) {
        int[] values = new int[number];
        System.out.println("Enter " + number + " integers:");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element #" + i + " is " + array[i]);
        }
    }

    public static int[] sortArray(int[] array) {
        boolean flag = true;
        while (flag) {
            flag = false;
            int temp = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }
}
