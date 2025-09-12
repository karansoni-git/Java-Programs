package class_and_object.multithreding;

public class yield_method extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " The Value Of i : " + i);
        }
        Thread.yield(); // Hints scheduler to pause current thread and allow others.
    }

    public static void main(String[] args) throws InterruptedException {
        yield_method y1 = new yield_method();
        yield_method y2 = new yield_method();
        y1.start();
        y2.start();
        y1.join();
        y2.join();
        System.out.println("Main method finished");
    }
}
