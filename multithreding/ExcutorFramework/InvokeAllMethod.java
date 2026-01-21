package class_and_object.multithreding.ExcutorFramework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAllMethod {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<String> callable1 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 1 is running...");
            return "task 1 completed";
        };
        Callable<String> callable2 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 2 is running...");
            return "task 2 completed";
        };
        Callable<String> callable3 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 3 is running...");
            return "task 3 completed";
        };

        List<Callable<String>> listOfCallables = Arrays.asList(callable1, callable2, callable3);

        List<Future<String>> futuresList1 = executor.invokeAll(listOfCallables);
        for (Future<String> future : futuresList1) {
            System.out.println(future.get());
        }

//        List<Future<String>> futuresList2 = executor.invokeAll(listOfCallables, 1, TimeUnit.SECONDS);

        executor.shutdown();
        System.out.println("Program Completed");
    }
}
