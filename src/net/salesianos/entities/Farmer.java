package net.salesianos.entities;

import java.util.ArrayList;
import java.util.Random;

public class Farmer extends Thread{
    private String[] vegetables = {"lettuce", "cabbage", "onion", "spinach", "potato", "celery", "asparagus", "radish", "broccoli", "artichoke", "tomato", "cucumber", "eggplant", "carrot", "green bean"};
    private int vegetableQuantity;

    public Farmer(int vegetableQuantity) {
        this.vegetableQuantity = vegetableQuantity;
    }

    public String growVegetable(){
        Random random = new Random();
        int nextRandom = random.nextInt(vegetables.length);
        return vegetables[nextRandom];
    }

    @Override
    public void run() {
        super.run();
    }
}
