package class_and_object.multithreding.ExcutorFramework;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierDemo2 {
    public static void main(String[] args) throws InterruptedException {
        int numberOfService = 4;

        ExecutorService executor = Executors.newFixedThreadPool(numberOfService);

        CyclicBarrier barrier = new CyclicBarrier(numberOfService, () -> System.out.println("ALL SYSTEM INITIATED SUCCESSFULLY"));

        executor.submit(() -> new SubSystem("Web Server", 2000, barrier).start());
        executor.submit(() -> new SubSystem("Database", 3000, barrier).start());
        executor.submit(() -> new SubSystem("Cache", 1500, barrier).start());
        executor.submit(() -> new SubSystem("Messaging Service", 4000, barrier).start());

        executor.shutdown();
    }
}

class SubSystem extends Thread {

    private final String SystemName;
    private final long initatingTime;
    private final CyclicBarrier barrier;

    public SubSystem(String SystemName, long initatingTime, CyclicBarrier barrier) {
        super(SystemName);
        this.SystemName = SystemName;
        this.initatingTime = initatingTime;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        System.out.println(SystemName + " INITIALIZATION STARTED");
        try {
            Thread.sleep(initatingTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(SystemName + " INITIALIZED SUCCESSFULLY!");
        try {
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            System.out.println(e.getMessage());
        }
    }
}

