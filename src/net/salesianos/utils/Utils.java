package net.salesianos.utils;

import java.util.Random;

public class Utils {
    private static final String[] vegetables = {"lettuce", "cabbage", "onion", "spinach", "potato", "celery", "asparagus", "radish", "broccoli", "artichoke", "tomato", "cucumber", "eggplant", "carrot", "green bean"};

    private static final int maximumTime = 10;
    public static String generateVegetable(){
        Random random = new Random();
        int nextRandom = random.nextInt(vegetables.length);
        return vegetables[nextRandom];
    }

    public static int randomInterval(){
        Random random = new Random();
        return random.nextInt(maximumTime)*1000;
    }

}
