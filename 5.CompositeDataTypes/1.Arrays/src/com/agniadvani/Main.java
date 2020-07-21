package com.agniadvani;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        int[] myArray7 = new int[6];
        myArray7[5] = 12;
        System.out.println(myArray7[5]);
        int [] myArray5 = {1,2,3,4,5};
        System.out.println(myArray5[2]);
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = i+1;
        }
        printArray(array);
    }
    public static void printArray(int[] array){
        for(int i = 0; i <array.length; i++){
            System.out.println("Element #"+i+" is "+array[i]);
        }
    }
}
