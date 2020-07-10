package com.agniadvani;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer(new Monitor(1920,1080),new Motherboard("Intel 810ghz",
                16,8), new Case("coolermaster",12,8,8));

        computer.getTheCase().powerOn();
        computer.getTheCase().powerOn();
        computer.getMonitor().pixelForm(24,43,"Green");

    }
}
