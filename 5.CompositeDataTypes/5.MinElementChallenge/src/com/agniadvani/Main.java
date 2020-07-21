package com.agniadvani;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = readIntegers(5);
        int minVal = findMin(myArray);
        System.out.println("Minimum Value Entered is " + minVal);
    }

    public static int[] readIntegers(int count) {
        int[] values = new int[count];
        System.out.println("Enter " + count + " numbers:");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int findMin(int[] array) {
        int leastNum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < leastNum) {
                leastNum = array[i];
            }
        }
        return leastNum;
    }
}










