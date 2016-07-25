package ua.in.dergachovda.homework;

public class CounterThreadDecrement implements Runnable{

    private Counter counter;

    CounterThreadDecrement(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.decrement();
        }
    }
}
