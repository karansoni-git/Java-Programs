package class_and_object.multithreding.ExcutorFramework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAnyMethod {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService excutor = Executors.newFixedThreadPool(3);

        Callable<String> callable1 = () -> {
            System.out.println("CALLABLE 1 IS RUNNING...");
            return "TASK 1 IS COMPLETED";
        };
        Callable<String> callable2 = () -> {
            System.out.println("CALLABLE 2 IS RUNNING...");
            return "TASK 2 IS COMPLETED";
        };
        Callable<String> callable3 = () -> {
            System.out.println("CALLABLE 3 IS RUNNING...");
            return "TASK 3 IS COMPLETED";
        };

        List<Callable<String>> callablesList = Arrays.asList(callable1, callable2, callable3);
        String result = excutor.invokeAny(callablesList);
        System.out.println(result);

        excutor.shutdown();
        System.out.println("PROGRAM COMPLETED");
    }
}
