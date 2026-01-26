package class_and_object.multithreding;

public class DeamonThread extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        DeamonThread t1 = new DeamonThread();
        t1.setDaemon(true);
        t1.start();
        System.out.println("main thread ended");
    }
}
