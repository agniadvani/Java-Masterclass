package com.agniadvani;

public class Printer {
    private int toner = 100;
    private boolean duplex = true;
    private int numPages;

    public Printer(int toner, boolean isDuplex) {
        if (toner > 0 && toner <= 100) {
            this.toner = toner;
        }
        if (!isDuplex) {
            this.duplex = isDuplex;
        }
    }

    public void fillToner() {
        this.toner = 100;
    }

    public int getToner() {
        return toner;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int getNumPages() {
        return numPages;
    }

    public void printPages(int pages) {
        if (toner <= 0) {
            System.out.println("Please fill toner");
            return;
        }
        int completedPages = 0;
        if (duplex) {
            System.out.println("This is a duplex printer, printing on both sides of a paper");
            for (int i = 0; i < pages; i++) {
                this.numPages++;
                toner -= 2;
                if (toner <= 0) {
                    System.out.println("Could print " + completedPages + " pages due to empty toner, please fill up the toner.");
                    break;
                }
                completedPages++;
            }
        } else {
            System.out.println("This is not a duplex printer");
            for (int i = 0; i < pages; i++) {
                this.numPages++;
                toner--;
                if (toner <= 0) {
                    System.out.println("Could print " + completedPages + " pages due to empty toner, please fill up the toner.");
                    break;
                }
                completedPages++;
            }
        }
    }
}

