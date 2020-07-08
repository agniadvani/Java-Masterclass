package com.agniadvani;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 10);
        Dog dog = new Dog("Pluto", 8, 25, 2, 4, 1, 20, "Fur");
        animal.eat();
        System.out.println("************");
        dog.eat();
        System.out.println(dog.getName());
        dog.walk();
        dog.run();
        System.out.println("************");
        Fish fish = new Fish("Goldy",2,1,2,2,2);
        fish.swim(5);
    }
}
