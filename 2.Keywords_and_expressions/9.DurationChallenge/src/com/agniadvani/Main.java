package com.agniadvani;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDuration(43805));
        System.out.println(getDuration(125,8));
        System.out.println(getDuration(600,2));
    }

    public static String getDuration(int min, int sec) {
        if ((min < 0) || (sec < 0 || sec > 59)) {
            return "Input invalid";
        }
        int hours = (int) min / 60;
        min = min - (hours * 60);
        //adding zeros in the tenth place if unit < 10
        String hourString = hours + "h";
        if (hours < 10) {
            hourString = "0" + hourString;
        }
        String minString = min + "h";
        if (min < 10) {
            minString = "0" + minString;
        }
        String secString = sec + "h";
        if (sec < 10) {
            secString = "0" + secString;
        }
        return hourString + " " + minString + " " + secString;
    }

    public static String getDuration(int sec) {
        if (sec < 0) {
            return "Input invalid";
        }
        int min = (int) sec / 60;
        sec = sec - (min * 60);
        return getDuration(min, sec);
    }
}
