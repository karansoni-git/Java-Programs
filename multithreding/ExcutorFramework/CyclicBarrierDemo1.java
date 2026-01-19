package class_and_object.multithreding.ExcutorFramework;

import java.util.concurrent.*;

public class CyclicBarrierDemo1 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        CyclicBarrier barrier = new CyclicBarrier(3);

        executor.submit(new task(barrier));
        executor.submit(new task(barrier));
        executor.submit(new task(barrier));

        executor.shutdown();
        System.out.println("PROGRAM ENDED");
    }
}

class task implements Runnable {

    private final CyclicBarrier barrier;

    public task(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " STARTED WORK");
        try {
            Thread.sleep(1000);
            barrier.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }
}
