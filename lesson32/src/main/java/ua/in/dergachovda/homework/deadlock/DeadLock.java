package ua.in.dergachovda.homework.deadlock;

public class DeadLock {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread inc = new Thread(new CounterThreadIncrement(counter));
        Thread dec = new Thread(new CounterThreadDecrement(counter));

        inc.start();
        dec.start();

        inc.join();
        dec.join();

        System.out.println(counter.getValue());
    }
}
