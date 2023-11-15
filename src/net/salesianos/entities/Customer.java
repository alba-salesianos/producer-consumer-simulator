package net.salesianos.entities;

import net.salesianos.storage.Restaurant;
import net.salesianos.utils.Utils;

public class Customer extends Thread{
    private final int vegetableQuantity;
    private final Restaurant restaurant;
    private final String name;

    public Customer(int vegetableQuantity, String name, Restaurant restaurant) {
        this.vegetableQuantity = vegetableQuantity;
        this.name = name;
        this.restaurant = restaurant;

    }


    @Override
    public void run() {
        for (int i = 0; i < this.vegetableQuantity; i++) {
            try {
                Thread.sleep(Utils.randomInterval());
                restaurant.consumeVegetable(this.name);
                System.out.println("Vegetables in storage: " + restaurant.getStorage());

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
