package ua.in.dergachovda.threads.thread;

public class ThreadExample {

    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        myThread.start();
//        myThread.join(); // остановка текущего потока до выполнения myThread

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}