package net.salesianos;

import net.salesianos.entities.Customer;
import net.salesianos.entities.Farmer;
import net.salesianos.storage.Restaurant;
import net.salesianos.utils.Utils;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(3);
        Farmer newFarmer = new Farmer(10, "Woozi", restaurant);
        Farmer newFarmer2 = new Farmer(10, "Hoshi", restaurant);
        Farmer newFarmer3 = new Farmer(10,"Seungkwan", restaurant);


        Customer customer = new Customer(15, "Bangchan", restaurant);
        Customer customer2 = new Customer(15, "Felix", restaurant);

        newFarmer.start();
        newFarmer2.start();
        newFarmer3.start();
        customer.start();
        customer2.start();


    }
}