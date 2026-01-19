package class_and_object.multithreding.ExcutorFramework;

import java.util.concurrent.*;

public class CountDownLatchDemo1 {
    public static void main(String[] args) throws InterruptedException {
        int size = 3;
        ExecutorService excutor = Executors.newFixedThreadPool(size);
        CountDownLatch latch = new CountDownLatch(size);
        excutor.submit(new workClass(latch));
        excutor.submit(new workClass(latch));
        excutor.submit(new workClass(latch));

        latch.await();

        excutor.shutdown();

        System.out.println("PROGRAM IS ENDED");

//        for (int i = 1; i <= 3; i++) {
//            excutor.submit(() -> {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println(Thread.currentThread().getName() + " TAKING TASK");
//                latch.countDown();
//            });
//        }


//        for (int i = 1; i <= 3; i++) {
//            excutor.submit(new workClass(latch));
//        }

    }
}

class workClass implements Runnable {

    private CountDownLatch count;

    public workClass(CountDownLatch count) {
        this.count = count;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " TAKING TASK");
        count.countDown();
    }
}
