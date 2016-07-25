package ua.in.dergachovda.races;

public class CounterSync {

//    Object monitor = new Object();

    private int value;

    public void increment() {
        synchronized (this) {
            value++;
        }
    }

    public void decrement() {
        synchronized (this) {
            value--;
        }
    }

    public int getValue() {
            return value;
    }
}
