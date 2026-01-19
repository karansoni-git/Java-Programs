package class_and_object.multithreding.ExcutorFramework;

import java.util.concurrent.CountDownLatch;

;

public class CountDownLatchDemo2 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);
        for (int i = 1; i <= 3; i++) {
            Thread t = new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " IS RUNNING...");
                latch.countDown();
            });
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            t.start();
        }
        latch.await();
        System.out.println("PROGRAM IS ENDED!!!");
    }
}

