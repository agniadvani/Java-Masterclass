package com.agniadvani;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int[] baseArray = new int[10];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        readArray();
        printArray(baseArray);
        resizeArray();
        baseArray[10] = 11;
        baseArray[11]= 12;
        printArray(baseArray);
    }

    public static void readArray() {
        System.out.println("Enter " + baseArray.length + " numbers:");
        for (int i = 0; i < baseArray.length; i++) {
            baseArray[i] = scanner.nextInt();
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void resizeArray() {
        int[] original = baseArray;
        baseArray = new int[12];
        for (int i = 0; i < original.length; i++) {
            baseArray[i] = original[i];
        }
    }
}