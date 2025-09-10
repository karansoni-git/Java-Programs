package class_and_object.multithreding;

public class runnable_interface implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread Name : " + Thread.currentThread().getName());
        System.out.println("Thread Is Running...");
    }

    public static void main(String[] args) {
        runnable_interface r1 = new runnable_interface();
        Thread t1 = new Thread(r1);
        t1.start();
        System.out.println("Thread Name : " + Thread.currentThread().getName());
        System.out.println("Main Thread Is Running...");
    }
}
