package ua.in.dergachovda.pool;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        int cpus = rt.availableProcessors();

        ExecutorService service = Executors.newFixedThreadPool(cpus);
        service.execute(new SomeTask());
        service.execute(new SomeTask());
        service.execute(new SomeTask());
        service.shutdown();

        ExecutorService service2 = Executors.newFixedThreadPool(cpus);
        Future<Integer> result = service2.submit(new AnotherTask());
        int sum = result.get();
        System.out.println("sum = " + sum);
    }
}

class SomeTask implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + " - " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class AnotherTask implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        return sum;
    }
}
