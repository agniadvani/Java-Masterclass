package com.agniadvani;

public class Vehicle {
    private int speed;
    private int gears;

    public Vehicle(int speed, int gears) {
        this.speed = speed;
        this.gears = gears;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGears() {
        return gears;
    }

    public void increaseSpeed(int speedIncrease) {
        speed += speedIncrease;
    }

    public void decreaseSpeed(int speedDecrease) {
        speed -= speedDecrease;
    }

    public void shiftUp() {
        if (gears == 5) {
            System.out.println("Already on maximum gear");
        } else {
             gears += 1;
        }
    }

    public void shiftDown() {
        if (gears == 1) {
            System.out.println("Already on minimum gear");
        } else {
             gears -= 1;
        }
    }
}

