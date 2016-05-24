package com.java.hillel.strategy.array;

public class GetNumber {

    private Strategy strategy;

    public GetNumber(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getNumber(int[] array) {
        return strategy.getNumber(array);
    }

}
