package class_and_object.multithreding;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

    private final Lock lock = new ReentrantLock();

    /* this is a deadlock situation where outer method is dependent on inner method while inner method is dependent on outer method
    but here Reentrant lock is smart enough to identify the deadlock situation and behalf of this situation it will solve automatically.
    the lock count is maintained by lock object. here two lock is acquired and unlocked
    deadlock prevention done automatically.
     */

    public void outerMethod() {
        lock.lock(); // work same as synchronized keyword. wait infinite time to acquire thr lock
        try {
            System.out.println("Outer Method");
            innerMethod();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod() {
        lock.lock();
        try {
            System.out.println("Inner Method");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLockDemo obj1 = new ReentrantLockDemo();
        obj1.outerMethod();
    }
}
