package class_and_object.multithreding.ExcutorFramework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(() -> "Thread got work");
        executor.shutdown();
        System.out.println("Is work done? : " + future.isDone());
        System.out.println(future.get());
        if (future.isDone()) {
            System.out.println("work is done");
        }
        System.out.println("program completed");
    }
}
