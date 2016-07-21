package ua.in.dergachovda.races;

public class CounterSync {

//    Object monitor = new Object();

    private int value;

    public synchronized void increment() {
//        synchronized (this) {
            value++;
//        }
    }

    public synchronized void decrement() {
//        synchronized (this) {
            value--;
//        }
    }

    public int getValue() {
            return value;
    }
}
