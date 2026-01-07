package Java_8_features;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletableFutureDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //by default deamon thread.
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("COMPLETABLE FUTURE");
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "COMPLETED";
        });
        System.out.println(completableFuture.get());
        System.out.println("PROGRAM COMPLETED");
    }
}

