package com.agniadvani;

public class Car extends Vehicle {
    private String handleSteering;

    public Car() {
        super(0, 0);
        this.handleSteering = "straight";
    }

    public void setHandleSteering(String leftOrRightOrStraight) {
        if (leftOrRight.toLowerCase().equals("left")) {
            this.handleSteering = "Steering left";
            System.out.println("Steering left");
        } else if (leftOrRight.toLowerCase().equals("right")) {
            this.handleSteering = "Steering right";
            System.out.println("Steering right");
        } else if (leftOrRight.toLowerCase().equals("straight")) {
            this.handleSteering = "Steering straight";
            System.out.println("cruising straight");
        } else {
            this.handleSteering = "Invalid input. Please enter left or right";
        }
    }

    public String getHandleSteering() {
        return handleSteering;
    }
}
