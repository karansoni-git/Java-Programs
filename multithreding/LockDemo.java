package class_and_object.multithreding;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " trying to withdraw " + amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdraw");
                        Thread.sleep(2000); // reduce the sleep time to work both thread
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdraw.");
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                        System.out.println(e.getMessage());
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println("Insufficient Balance in Account");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " is failed to lock , try again later!");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        LockDemo obj1 = new LockDemo();
        Thread t1 = new Thread(() -> {
            obj1.withdraw(50);
        });
        Thread t2 = new Thread(() -> {
            obj1.withdraw(50);
        });

        t1.start();
        t2.start();
    }
}
