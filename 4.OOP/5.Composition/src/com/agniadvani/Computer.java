package com.agniadvani;

public class Computer {
    private Monitor monitor;
    private Motherboard motherboard;
    private Case theCase;

    public Computer(Monitor monitor, Motherboard motherboard, Case theCase) {
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.theCase = theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }
}
