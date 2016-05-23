package com.java.hillel.strategy.array;

public class GetMin implements Strategy {
    @Override
    public int getNumber(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = min < array[i] ? min : array[i];
        }
        return min;
    }
}
