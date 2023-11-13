package net.salesianos.utils;

import java.util.Random;

public class Utils {
    private static String[] vegetables = {"lettuce", "cabbage", "onion", "spinach", "potato", "celery", "asparagus", "radish", "broccoli", "artichoke", "tomato", "cucumber", "eggplant", "carrot", "green bean"};

    public static String generateVegetable(){
        Random random = new Random();
        int nextRandom = random.nextInt(vegetables.length);
        return vegetables[nextRandom];
    }

    public static int randomInterval(){
        Random random = new Random();
        return random.nextInt(10)*1000;
    }

}
