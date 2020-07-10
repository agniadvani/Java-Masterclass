package com.agniadvani;

public class Monitor {
    private String model;
    private int width;
    private int length;

    public Monitor(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public void pixelForm(int x, int y, String colour) {
        System.out.println("Adding colour " + colour + " at position x = " + x + " y = " + y);
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getModel() {
        return model;
    }
}
