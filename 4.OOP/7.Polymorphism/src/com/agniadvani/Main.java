package com.agniadvani;

class Car {
    private int cylinders;
    private String name;
    private boolean engine = true;
    private int wheels = 4;
    private int speed = 0;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public String message() {
        return "No message.";
    }

    public void accelerate() {
        speed += 5;
    }

    public void brake() {
        speed = 0;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
}

class Coupe extends Car {
    public Coupe() {
        super(4, "Audi Q7");
    }

    @Override
    public String message() {
        return "This is audi Q7, a coupe.";
    }
}

class Suv extends Car {
    public Suv() {
        super(3, "Land Rover Recovery");
    }

    @Override
    public String message() {
        return "This is Land Rover Recovery, an Suv";
    }
}

class Luxury extends Car {
    public Luxury() {
        super(4, "Rolls Royce Phantom");
    }
}

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Car car = randomCar();
            System.out.println("Car # " + i + " " + car.getName() + "\n" + car.message() + "\n");
        }
    }

    public static Car randomCar() {
        int randNum = (int) (Math.random() * 3) + 1;
        System.out.println("Random number was " + randNum);
        switch (randNum) {
            case 1:
                return new Coupe();
            case 2:
                return new Suv();
            case 3:
                return new Luxury();
        }
        return null;
    }
}
