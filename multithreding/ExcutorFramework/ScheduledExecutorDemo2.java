package class_and_object.multithreding.ExcutorFramework;

import java.util.concurrent.*;

public class ScheduledExecutorDemo2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.schedule(() -> {
            System.out.println("TASK IS DELAYED BY 3 SECOND");
        }, 3, TimeUnit.SECONDS);
        scheduler.shutdown();
        scheduler.awaitTermination(3, TimeUnit.SECONDS);
        Thread.sleep(200);
        System.out.println("PROGRAM ENDED!!!");
    }
}
