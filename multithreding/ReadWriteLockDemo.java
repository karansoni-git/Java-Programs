package class_and_object.multithreding;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockDemo {
    private int count = 0;

    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    public void increaseCount() {
        writeLock.lock();
        try {
            count++;
            Thread.sleep(100); // pause the writing thread so that reading thread can read the count value
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            writeLock.unlock();
        }
    }

    public int getCount() {
        readLock.lock();
        try {
            return count;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            readLock.unlock();
        }
        return 0;
    }

    public static void main(String[] args) throws InterruptedException {
        ReadWriteLockDemo obj1 = new ReadWriteLockDemo();
        Runnable writing = () -> {
            for (int i = 1; i <= 10; i++) {
                obj1.increaseCount();
                System.out.println(Thread.currentThread().getName() + " INCREMENTED THE COUNT");
            }
        };

        Runnable reading = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " READ " + obj1.getCount());
            }
        };

        Thread t1 = new Thread(writing);
        Thread t2 = new Thread(reading);
        Thread t3 = new Thread(reading);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("COMPLETED");
    }
}


/*
=> What is ReadWriteLock? :
    -> ReadWriteLock is a synchronization mechanism that allows:
        -> Multiple threads to read simultaneously
        -> Only one thread to write at a time
        -> No read when write is happening
    -> It improves performance in scenarios where:
        Reads are frequent
        Writes are rare

    -> Why ReadWriteLock? (Problem with synchronized) :
        -> With synchronized
            Only one thread (read OR write) can access at a time
            Even multiple readers block each other

        -> With ReadWriteLock
            Multiple readers allowed
            Writers get exclusive access
        -> Huge performance gain in read-heavy systems.
*/