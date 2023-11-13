package net.salesianos.storage;

import net.salesianos.utils.Utils;

import java.util.ArrayList;

public class Restaurant {
    private int capacity;
    private ArrayList storage = new ArrayList<>();

    public Restaurant(int capacity) {
        this.capacity = capacity;
    }

    public void addVegetable(){
        this.storage.add(Utils.generateVegetable());
    }

    public void consumeVegetable(String vegetable){
        if(storage.contains(vegetable)){
            storage.remove(vegetable);
        }
    }
}
