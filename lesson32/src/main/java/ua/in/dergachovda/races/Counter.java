package ua.in.dergachovda.races;

public class Counter {
    private int value;

    public void increment() {
            value++;
    }

    public synchronized void decrement() {
            value--;
    }

    public int getValue() {
            return value;
    }
}
