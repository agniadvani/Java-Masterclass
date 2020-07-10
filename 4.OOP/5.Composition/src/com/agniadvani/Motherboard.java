package com.agniadvani;

public class Motherboard {
    private String model;
    private int ram;
    private int cores;

    public Motherboard(String model, int ram, int cores) {
        this.model = model;
        this.ram = ram;
        this.cores = cores;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getCores() {
        return cores;
    }

    public void upgradeRam(int numRam) {
        ram += numRam;
    }

    public void upgradeCores(int cores) {
        cores += cores;
    }
}
