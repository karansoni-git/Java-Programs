package class_and_object.multithreding.ExcutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorDemo1 {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 10; i++) {
            int finalI = i;
            executor.submit(() -> {
                System.out.println(factorial(finalI));
            });
        }
        executor.shutdown();
        executor.awaitTermination(2000, TimeUnit.MILLISECONDS);
        System.out.println("Total time : " + ((float) (System.currentTimeMillis() - startTime) / 1000) + " seconds");
    }

    public static int factorial(int num) {
        try {
            Thread.sleep(300);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
