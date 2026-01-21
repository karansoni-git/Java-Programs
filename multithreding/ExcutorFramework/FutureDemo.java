package class_and_object.multithreding.ExcutorFramework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<?> future1 = executor.submit(() -> {
            System.out.println("hello from runnable interface");
        });
        System.out.println("Returned value from runnable : " + future1.get());

        Future<String> future2 = executor.submit(() -> {
            System.out.println("\nhello from callable interface");
            return "bye bye";
        });
        System.out.println("Returned value from callable : " + future2.get());

        Future<Integer> future3 = executor.submit(() -> {
            System.out.println("\nhello from runnable inter face with returning integer value");
        }, 2026);

        System.out.println("Returned value from runnable with integer return : " + future3.get());

        executor.shutdown();
        System.out.println("\nProgram Ended!");

    }
}

//example of get() method with timed wating.
/*
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> result = executor.submit(() -> {
            System.out.println("TASK JUST STARTED...");
            Thread.sleep(900);
            return "TASK COMPLETED";
        });
        try {
            System.out.println("IS TASK DONE : " + result.isDone());
            System.out.println(result.get(1, TimeUnit.SECONDS));
            System.out.println("IS TASK DONE : " + result.isDone());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } catch (ExecutionException e) {
            System.out.println(e.getMessage());
        } catch (TimeoutException e) {
            System.out.println("TIME IS OVER TASK STILL NOT COMPLETED!!!");
        }
        executor.shutdown();
        System.out.println("PROGRAM COMPLETED");
    }
*/
