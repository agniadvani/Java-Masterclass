package com.agniadvani;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(5,1);
        Car car = new Car();
        Coupe audi = new Coupe();
        vehicle.decreaseSpeed(1);
        System.out.println(vehicle.getSpeed());
        vehicle.increaseSpeed(2);
        System.out.println(vehicle.getSpeed());
        vehicle.shiftDown();
        System.out.println(vehicle.getGears());
        System.out.println(car.getGears());
        System.out.println(car.getSpeed());
        System.out.println(car.getHandleSteering());
        car.shiftUp();
        System.out.println(car.getGears());
        car.increaseSpeed(10);
        System.out.println(car.getSpeed());
        System.out.println(audi.getSpeed());
        audi.shiftUp();
        System.out.println(audi.getGears());
        audi.closeSunroof();
        audi.openSunroof();
        audi.openSunroof();
        System.out.println(audi.getSunroofState());
        audi.setHandleSteering("left");
    }
}
