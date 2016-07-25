package ua.in.dergachovda.homework;

public class Counter {
    Object m1 = new Object();
    Object m2 = new Object();

    private int value;

    public void increment() {
        int value;
        synchronized (m1) {
            value = this.value;
            synchronized (m2) {
                this.value = value + 1;
            }
        }
    }

    public void decrement() {
        int value;
        synchronized (m2) {
            value = this.value;
            synchronized (m1) {
                this.value = value - 1;
            }
        }
    }

    public int getValue() {
            return value;
    }
}
