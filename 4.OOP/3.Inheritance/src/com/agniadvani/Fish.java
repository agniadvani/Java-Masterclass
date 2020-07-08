package com.agniadvani;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void rest() {
    }

    public void moveMuscles() {
        System.out.println("Fish.moveMuscles() called");
    }

    public void moveBack() {
        System.out.println("Fish.moveBack() called");
    }

    public void swim(int speed) {
        System.out.println("Fish.swim() called");
        moveMuscles();
        moveBack();
        super.move(speed);
    }
}
