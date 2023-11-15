package net.salesianos;

import net.salesianos.entities.Customer;
import net.salesianos.entities.Farmer;
import net.salesianos.storage.Restaurant;
import net.salesianos.utils.Utils;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(5);
        Farmer newFarmer = new Farmer(10, "Yamada", restaurant);
        Farmer newFarmer2 = new Farmer(10, "Inoo", restaurant);
        Farmer newFarmer3 = new Farmer(10, "Hikaru", restaurant);

        Customer customer = new Customer(15, "Bangchan", restaurant);
        Customer customer2 = new Customer(15, "Changbin", restaurant);

        newFarmer.start();
        newFarmer2.start();
        newFarmer3.start();
        customer.start();
        customer2.start();
    }
}