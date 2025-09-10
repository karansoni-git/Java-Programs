/*
=> Thread Priority in Java
-> In Java, every thread has a priority that helps the Thread Scheduler decide which thread to execute first when multiple threads are waiting for CPU time.
-> Note: Priority does not guarantee execution order; it only influences it. The actual behavior depends on the JVM implementation and the OS thread scheduler.
-> Threads can be assigned a priority between 1 (MIN_PRIORITY) and 10 (MAX_PRIORITY).
-> Default = 5 (NORM_PRIORITY).
-> Higher priority increases chances of getting CPU but does not guarantee.

|        Constant       | Value |      Meaning     |
|-----------------------|-------|------------------|
| Thread.MIN_PRIORITY   |   1   | Lowest priority  |
| Thread.NORM_PRIORITY  |   5   | Default priority |
| Thread.MAX_PRIORITY   |   10  | Highest priority |

=> Default Priority
-> When a thread is created, it inherits the priority of the thread that created it.
-> By default, threads have priority = Thread.NORM_PRIORITY (5).

 */

package class_and_object.multithreding;

public class priority extends Thread {

    public priority(String thread_name) {
        super(thread_name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000000; i++) {
            // nothing
        }
        for (int j = 0; j < 5; j++) {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        priority t1 = new priority("t1");
        priority t2 = new priority("t2");
        priority t3 = new priority("t3");

        // setPriority() method is used to set a priority to specific thread .1
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        // getPriority() is used see the priority if thread.
        System.out.println("Priority Of t1 : " + t1.getPriority());
        System.out.println("Priority Of t2 : " + t2.getPriority());
        System.out.println("Priority Of t3 : " + t3.getPriority());

        t1.start();
        t2.start();
        t3.start();

    }
}
