package net.salesianos.entities;

import net.salesianos.utils.Utils;
public class Farmer extends Thread{

    private int vegetableQuantity;

    public Farmer(int vegetableQuantity) {
        this.vegetableQuantity = vegetableQuantity;
    }


    @Override
    public void run() {
        for (int i = 0; i < this.vegetableQuantity; i++) {
            try {
                System.out.println("Cultivando...");
                sleep(Utils.randomInterval());
                System.out.println(Utils.generateVegetable());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
