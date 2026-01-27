package class_and_object.multithreding;

//public class InterruptMethod extends Thread {
//    @Override
//    public void run() {
//        try {
//            Thread.sleep(1000);
//            System.out.println("hello ");
//        } catch (InterruptedException e) {
//            System.out.println("Thread Interrupted : " + e.getMessage());
//        }
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        InterruptMethod t1 = new InterruptMethod();
//        t1.start();
//        t1.interrupt();
//        System.out.println("isInterrupted() : " + t1.isInterrupted());
//        Thread.sleep(1000);
//        System.out.println("isInterrupted() : " + t1.isInterrupted());
//    }
//}

public class InterruptMethod extends Thread {
    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("RUNNING");
            }
        } catch (Exception e) {
            System.out.println("Thread Interrupted : " + e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        InterruptMethod t1 = new InterruptMethod();
        t1.start();
        Thread.sleep(100);
        t1.interrupt();
    }
}

/*
=> What is interrupt()? :
    -> interrupt() is a method of the Thread class used to interrupt a thread that is in sleeping, waiting, or blocked state.
    -> Purpose:
        -> To request a thread to stop what it’s doing and handle interruption gracefully.
        -> It does NOT forcefully stop a thread.

    -> Key Points :
        -> Non-static method
        -> Called on a Thread object
        -> Does not return anything
        -> Does not directly stop the thread
    -> Thread States & interrupt() :
        | Thread State  | Effect of interrupt()             |
        | ------------- | --------------------------------- |
        | NEW           | No effect                         |
        | RUNNABLE      | Interrupt flag set                |
        | RUNNING       | Interrupt flag set                |
        | WAITING       | InterruptedException              |
        | TIMED_WAITING | InterruptedException              |
        | BLOCKED       | Interrupt flag set (no exception) |
        | TERMINATED    | No effect                         |

*/