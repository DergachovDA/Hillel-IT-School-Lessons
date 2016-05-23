package com.java.hillel.strategy.array;

import java.util.Random;

public class GetRandom implements Strategy {
    @Override
    public int getNumber(int[] array) {
        Random random = new Random();
        return array[random.nextInt(array.length)];
    }
}
