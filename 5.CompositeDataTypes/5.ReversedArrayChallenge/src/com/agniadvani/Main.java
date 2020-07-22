package com.agniadvani;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{63, 35, 47, 89, 5743, 328736};
        int[] reversedArray = reverseArray(array);
        System.out.println("array = " + Arrays.toString(array));
        System.out.println("Reversed array = " + Arrays.toString(reversedArray));
    }

    public static int[] reverseArray(int[] array) {
        int[] reversedArray = Arrays.copyOf(array, array.length);
        for (int n = 1; n <= array.length - 1; n++) {
            for (int i = 0; i < reversedArray.length - (n); i++) {
                int temp = reversedArray[i];
                reversedArray[i] = reversedArray[i + 1];
                reversedArray[i + 1] = temp;
            }
        }
        return reversedArray;
    }
}