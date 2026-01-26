package class_and_object.multithreding.ExcutorFramework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorDemo4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        long startTime = System.currentTimeMillis();
        scheduler.scheduleWithFixedDelay(() -> {
            System.out.println("TASK IS DELAYED BY " + ((float) (System.currentTimeMillis() - startTime) / 1000) + " SECOND");
            System.out.println("taken time : " + ((float) (System.currentTimeMillis() - startTime) / 1000) + "Seconds");
        }, 2, 5, TimeUnit.SECONDS);
        scheduler.awaitTermination(3, TimeUnit.SECONDS);
        scheduler.shutdown();
        System.out.println("PROGRAM IS ENDED");
    }
}
