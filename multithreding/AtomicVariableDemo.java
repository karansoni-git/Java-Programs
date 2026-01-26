package class_and_object.multithreding;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariableDemo {

    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }

    public void getCount() {
        System.out.println(count.get());
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicVariableDemo obj1 = new AtomicVariableDemo();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                obj1.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                obj1.increment();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        obj1.getCount();
    }
}
