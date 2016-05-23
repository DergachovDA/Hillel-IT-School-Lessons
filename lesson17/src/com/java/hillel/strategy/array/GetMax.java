package com.java.hillel.strategy.array;

public class GetMax implements Strategy {
    @Override
    public int getNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = max > array[i] ? max : array[i];
        }
        return max;
    }
}
