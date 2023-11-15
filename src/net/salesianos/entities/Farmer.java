package net.salesianos.entities;

import net.salesianos.storage.Restaurant;
import net.salesianos.utils.Utils;
public class Farmer extends Thread{

    private int vegetableQuantity;
    private Restaurant restaurant;
    private String name;

    public Farmer(int vegetableQuantity, String name, Restaurant restaurant) {
        this.vegetableQuantity = vegetableQuantity;
        this.restaurant = restaurant;
        this.name = name;

    }


    @Override
    public void run() {
        for (int i = 0; i < this.vegetableQuantity; i++) {
            try {
                System.out.println("Cultivando...");
                sleep(Utils.randomInterval());
                restaurant.addVegetable(this.name);
                System.out.println(restaurant.getStorage());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
