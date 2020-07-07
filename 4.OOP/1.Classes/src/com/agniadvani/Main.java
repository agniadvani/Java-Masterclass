package com.agniadvani;

public class Main {

    public static void main(String[] args) {
	    Car porshe = new Car();
	    Car ford = new Car();
	    porshe.setModel("Carrera");
	    ford.setModel("Freestyle");
        System.out.println(porshe.getModel());
        System.out.println(ford.getModel());
    }
}
