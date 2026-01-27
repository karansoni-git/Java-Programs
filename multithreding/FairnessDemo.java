package class_and_object.multithreding;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessDemo {

    private final Lock lock = new ReentrantLock(true);

    public void work() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquired lock");
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(Thread.currentThread().getName() + " release the lock");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        FairnessDemo obj1 = new FairnessDemo();

        Thread t1 = new Thread(() -> {
            obj1.work();
        });

        Thread t2 = new Thread(() -> {
            obj1.work();
        });
        Thread t3 = new Thread(() -> {
            obj1.work();
        });

        t1.start();
        t2.start();
        t3.start();

    }
}

/*
=> What is a ReentrantLock? :
    -> ReentrantLock is a lock from java.util.concurrent.locks that:
        -> Allows explicit locking and unlocking
        -> Is reentrant (the same thread can lock it multiple times)
        -> Offers more features than synchronized, including fairness

    -> What does “fairness” mean? :
        -> Fairness controls which thread gets the lock next when multiple threads are waiting.
        -> Fair lock : threads acquire the lock in the order they requested it (FIFO)
        -> Unfair lock : threads may cut in line, even if others are waiting

    -> How to create a fair vs unfair ReentrantLock
        Unfair lock (default) :
            ReentrantLock lock = new ReentrantLock();
        Fair lock :
            ReentrantLock lock = new ReentrantLock(true);
        The boolean parameter :
            true → fair
            false → unfair (default)

    -> How fairness works internally
        -> A fair ReentrantLock :
            -> Maintains a queue of waiting threads
            -> Gives the lock to the longest-waiting thread
            -> Prevents thread starvation

        -> An unfair ReentrantLock :
            -> Allows a thread to grab the lock immediately if it’s free
            -> Even if other threads are waiting
            -> Improves performance but may starve some threads

    -> Fairness vs synchronized :
        -> synchronized does not guarantee fairness
        -> JVM may use optimizations that behave like an unfair lock
        -> ReentrantLock gives explicit control over fairness

    -> Important notes and pitfalls :
        -> Fair locks are not strictly fair (timing and scheduling can still affect order)
        -> Fair locks slow down high-throughput systems
        -> Fairness applies only when multiple threads are waiting
        -> Reentrancy still applies (current owner can re-lock immediately)

    -> When should you use a fair lock? :
        -> Use a fair ReentrantLock when :
            -> You must avoid starvation
            -> Task order matters (e.g., scheduling, queues)
            -> Predictability is more important than performance

        -> Use an unfair lock when :
            -> High throughput is critical
            -> Short-lived tasks
            -> Starvation is unlikely or acceptable

    -> A fair ReentrantLock grants access to threads in FIFO order, preventing starvation at the cost of performance, while the default unfair lock improves throughput but may starve threads.
*/