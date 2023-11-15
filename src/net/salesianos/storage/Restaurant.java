package net.salesianos.storage;

import net.salesianos.utils.Utils;

import java.util.ArrayList;

public class Restaurant {
    private int capacity;
    private ArrayList storage = new ArrayList<>(this.capacity);

    public Restaurant(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void addVegetable(String name) throws InterruptedException {
        while (storage.size() >= this.capacity) {
            wait();
        }
        String vegetable = Utils.generateVegetable();
        System.out.println("The farmer " + name + " has grown: " + vegetable);
        this.storage.add(vegetable);
        notifyAll();

    }

    public synchronized void consumeVegetable(String name) throws InterruptedException {

        while (storage.isEmpty()) {
            wait();
        }

        System.out.println("The customer " + name + " has eaten: " + storage.get(0));
        storage.remove(0);
        notifyAll();
    }

    public ArrayList getStorage() {
        return storage;
    }
}
