package ua.in.dergachovda.races;

public class SynchronizedCounter {
    private Counter counter;

    public SynchronizedCounter(Counter counter) {
        this.counter = counter;
    }

    public synchronized void increment() {
        counter.increment();
    }

    public synchronized void decrement() {
        counter.decrement();
    }

    public int getValue() {
        return counter.getValue();
    }
}
