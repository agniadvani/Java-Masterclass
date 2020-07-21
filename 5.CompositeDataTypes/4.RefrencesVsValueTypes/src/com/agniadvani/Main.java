package com.agniadvani;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myInt = 4;
        int anotherInt = myInt;
        System.out.println(myInt);
        System.out.println(anotherInt);
        myInt++;
        System.out.println(myInt);
        System.out.println(anotherInt);
        int[] myArray = new int[5];
        int[] anotherArray = myArray;
        System.out.println("myArray = " + Arrays.toString(myArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
        anotherArray[1] = 1;
        System.out.println("myArray after change = " + Arrays.toString(myArray));
        System.out.println("anotherArray after change = " + Arrays.toString(anotherArray));
        anotherArray = new int[]{1, 2, 3, 4, 5};
        modifyArray(myArray);
        System.out.println("myArray after change = " + Arrays.toString(myArray));
        System.out.println("anotherArray after change = " + Arrays.toString(anotherArray));
    }

    public static void modifyArray(int[] array) {
        array[2] = 2;
    }
}
