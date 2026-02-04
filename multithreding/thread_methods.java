package class_and_object.multithreding;

public class thread_methods extends Thread {

    public thread_methods(String thread_name) {
        super(thread_name);
    }

    // Defines the code executed by the thread.
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " Time " + Thread.currentThread().getName() + " Thread is Running");
            try {
                Thread.sleep(400); // Makes the thread pause for given milliseconds.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        thread_methods t1 = new thread_methods("t1");
        t1.start(); // Starts a new thread and calls run() method.
        System.out.println("Is Thread Alive : " + t1.isAlive()); // Checks if thread is still running.
        t1.join(); // Waits for a thread to die. here in this case main thread
        t1.setName("t1"); //setName() is used to set Thread name.
        System.out.println("Current Thread : " + t1.getName()); // getName() is used to get Current Thread name.
        System.out.println("Is Thread Alive : " + t1.isAlive()); // Checks if thread is still running.
        System.out.println(Thread.currentThread()); // Returns a reference to currently executing thread.
    }
}
