package class_and_object.multithreding;

public class ThreadCreationMethods extends Thread implements Runnable {

    @Override
    public void run() {
        System.out.println("hello from Runnable interface implementation and extending Thread class");
    }

    public static void main(String[] args) {
        ThreadCreationMethods obj1 = new ThreadCreationMethods(); // creating object of class which implements Runnable interface
        Thread t1 = new Thread(obj1); // giving a object of that class which implements the Runnable interface.
        t1.start(); // starting the thread

        // creates on the fly implementation class and its object. can replace with lambda expression.
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello From Runnable anonymous inner class");
            }
        }; // this is a anonymous inner class
        Thread t2 = new Thread(r1); // proving the Runnable interface object to the Thread constructor.
        t2.start(); // starting the thread.

        // lambda expression anonymous function
        Runnable r2 = () -> {
            System.out.println("hello from runnable interface lambda expression.");
        }; // this is implementation of run() method of Runnable interface.
        Thread t3 = new Thread(r2); // giving a Runnable interface object to the thread constructor.
        t3.start(); // starting the thread.

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello from Runnable inside Thread Constructor");
            }
        }); // proving on the fly implementation of Runnable interface as anonymous inner class.
        t4.start(); // starting the thread.

        Thread t5 = new Thread(() -> {
            System.out.println("hello from lambda expression in thread constructor");
        }); // giving a Runnable interface as lambda expression in thread constructor.
        t5.start(); // starting the thread.

        obj1.start(); // object of class which extending the Thread class.

    }
}
