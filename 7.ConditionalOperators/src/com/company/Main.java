package com.company;

public class Main {

    public static void main(String[] args) {
        boolean isAlien = true;
        if (isAlien == true) {
            System.out.println("This is an alien");
        }

        int topScore = 100;
        if (topScore == 100) {
            System.out.println("Top Score is 100");
        }

        int secondScore = 60;
        if (topScore > secondScore && topScore >= 100) {
            System.out.println("Topscore is perfect and greater than second");
        }
        boolean isCar = false;
        boolean wasCar = isCar ? false : true;
        if (wasCar){
            System.out.println("This was a car.");
        }
    }
}
