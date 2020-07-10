package com.agniadvani;

public class Case {
    private String model;
    private int height;
    private int length;
    private int width;
    private int power;

    public Case(String model, int height, int length, int width) {
        this.model = model;
        this.height = height;
        this.length = length;
        this.width = width;
        this.power = 0;
    }

    public String getModel() {
        return model;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void powerOn() {
        if (power == 0) {
            System.out.println("Switching the power on");
            power = 1;
        } else {
            System.out.println("Swithching off power");
            power = 0;
        }
    }
}

