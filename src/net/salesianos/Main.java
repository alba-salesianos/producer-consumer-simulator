package net.salesianos;

import net.salesianos.entities.Farmer;
import net.salesianos.utils.Utils;

public class Main {
    public static void main(String[] args) {
        Farmer newFarmer = new Farmer(10);

        newFarmer.start();

    }
}