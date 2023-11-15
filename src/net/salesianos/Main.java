package net.salesianos;

import net.salesianos.entities.Customer;
import net.salesianos.entities.Farmer;
import net.salesianos.storage.Restaurant;
import net.salesianos.utils.Utils;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(5);
        Farmer newFarmer = new Farmer(10, "Yamada", restaurant);
        Customer customer = new Customer(10, "Bangchan", restaurant);


        newFarmer.start();

        customer.start();



    }
}