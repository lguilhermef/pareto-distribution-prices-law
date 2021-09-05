package main.java.org.javaprojects.paretodistributionpriceslaw.utils;

import java.util.Random;

public class Randomizer {

    public static boolean headOrTails () {
        return Math.random() > 0.5;
    }

    public static int getRandomNumberWithinRange(int low, int high) {
        Random randomizer = new Random();
        return randomizer.nextInt(high - low) + low;
    }
}
