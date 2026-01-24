package class_and_object.multithreding.ExcutorFramework;

import java.util.concurrent.*;

public class ScheduledExecutorDemo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        ScheduledFuture<String> future = scheduler.schedule(() -> {
            System.out.println("TASK IS DELAYED BY 3 SECOND");
            return "COMPLETED";
        }, 3, TimeUnit.SECONDS);
        System.out.println(future.get());
        scheduler.shutdown();
        Thread.sleep(800);
        System.out.println("PROGRAM ENDED!!!");
    }
}
