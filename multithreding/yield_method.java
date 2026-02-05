package class_and_object.multithreding;

public class yield_method extends Thread {

    public yield_method(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " The Value Of i : " + i);
            Thread.yield(); // Hints scheduler to pause current thread and allow others.
        }
    }

    public static void main(String[] args) throws InterruptedException {
        yield_method y1 = new yield_method("Thread 1");
        yield_method y2 = new yield_method("Thread 2");
        y1.start();
        y2.start();
    }
}

/*
=> What is yield() in Java? :
    -> yield() is a static method of the Thread class used in multithreading.
    -> Purpose:
        -> It tells the currently running thread: “I am willing to pause execution and give other threads of the same priority a chance to execute.”
    -> Key Points :
        -> Static method → called using Thread.yield()
        -> No return value
        -> No checked exception
        -> A hint to the Thread Scheduler (not a command)

    -> How yield() Works Internally :
        When a thread calls yield():
            -> The running thread moves from Running → Runnable state
            -> The Thread Scheduler decides:
                -> Run another same-priority thread
                -> OR continue the same thread again
            -> Execution may resume immediately
            -> No guarantee that another thread will run.
*/