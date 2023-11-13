package net.salesianos;

import net.salesianos.entities.Farmer;

public class Main {
    public static void main(String[] args) {
        Farmer newFarmer = new Farmer(10);

        System.out.println(newFarmer.growVegetable());
    }
}