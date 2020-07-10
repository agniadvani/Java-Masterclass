package com.agniadvani;

public class Coupe extends Car {
    private String sunroof;

    public Coupe() {
        this.sunroof = "close";
    }

    public String getSunroofState() {
        return sunroof;
    }

    public void openSunroof() {
        if (sunroof.equals("open")) {
            System.out.println("sunroof already open.");
        } else {
            System.out.println("opening sunroof");
            sunroof = "open";
        }
    }

    public void closeSunroof() {
        if (sunroof.equals("close")) {
            System.out.println("sunroof already closed.");
        } else {
            System.out.println("closing sunroof");
            sunroof = "close";
        }
    }
}
