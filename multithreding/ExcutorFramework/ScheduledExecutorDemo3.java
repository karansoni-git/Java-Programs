package class_and_object.multithreding.ExcutorFramework;

import java.util.concurrent.*;

public class ScheduledExecutorDemo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("EVERY TASK IS DELAYED BY 3 SECOND");
        }, 1, 1, TimeUnit.SECONDS);

        scheduler.schedule(() -> {
            System.out.println("SHUTDOWN PROCESS INITIATING...");
            scheduler.shutdown();
        }, 3, TimeUnit.SECONDS);

        scheduler.awaitTermination(4, TimeUnit.SECONDS);
        System.out.println("PROGRAM COMPLETED");

    }
}
