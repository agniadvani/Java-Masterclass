package com.agniadvani;

public class Main {

    public static void main(String[] args) {
        Printer duplexPrinter = new Printer(100, true);
        Printer noDuplexPrinter = new Printer(100, false);

        duplexPrinter.printPages(50);
        noDuplexPrinter.printPages(102);
        System.out.println(duplexPrinter.getToner());
        System.out.println(noDuplexPrinter.getToner());
        duplexPrinter.fillToner();
        noDuplexPrinter.fillToner();
        duplexPrinter.printPages(3);
        noDuplexPrinter.printPages(3);
        System.out.println(duplexPrinter.getNumPages());
        System.out.println(noDuplexPrinter.getNumPages());
        System.out.println(duplexPrinter.getToner());
        System.out.println(noDuplexPrinter.getToner());
    }
}
