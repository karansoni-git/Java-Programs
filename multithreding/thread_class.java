/*
=> Thread Class in Java
-> In Java, multithreading allows concurrent execution of two or more parts of a program for maximum utilization of CPU.
-> The Thread class (in java.lang package) is used to create and manage threads.

=> What is a Thread?
-> A thread is the smallest unit of a process that can run independently.
-> Each Java program has at least one thread (the main thread).
-> Additional threads can be created using the Thread class or implementing the Runnable interface.

=> Important Constructors of Thread Class
-> Thread(String name)
-> Thread()
-> Thread(Runnable target)
-> Thread(Runnable target, String name)

=> Important Methods of Thread Class
| Method                            | Description                                               |
| --------------------------------- | --------------------------------------------------------- |
| `start()`                         | Starts a new thread and calls `run()` method.             |
| `run()`                           | Defines the code executed by the thread.                  |
| `sleep(ms)`                       | Makes the thread pause for given milliseconds.            |
| `join()`                          | Waits for a thread to die.                                |
| `yield()`                         | Hints scheduler to pause current thread and allow others. |
| `isAlive()`                       | Checks if thread is still running.                        |
| `getName()` / `setName()`         | Get or set thread name.                                   |
| `getPriority()` / `setPriority()` | Get or set thread priority (1–10).                        |
| `currentThread()`                 | Returns a reference to currently executing thread.        |
| `interrupt()`                     | Interrupts the thread (useful for stopping).              |

*/


package class_and_object.multithreding;

public class thread_class extends Thread {

    //thread class constructor help to give your specific name of thread
    public thread_class(String thread_name) {
        super(thread_name); // calling the thread class constructor and providing the new name of the thread
    }

    // we have to wri
    @Override
    public void run() {
        System.out.println("First Thread is running");
        // Thread.currentThread().getName() : this returns the name of the thread
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        thread_class t1 = new thread_class("t1");
        t1.start(); // start thread, calls run() internally
        System.out.println(Thread.currentThread().getName());
        System.out.println("Main Thread");
    }
}
