package class_and_object.multithreding;

public class Thread_lifecycle extends Thread{

    public Thread_lifecycle(String threadName){
        super(threadName);
    }

    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread_lifecycle t1 = new Thread_lifecycle("thread 1");
        System.out.println(t1.getState());

        t1.start();
        System.out.println(t1.getState());

        Thread.sleep(100);
        System.out.println(t1.getState());

        t1.join();
        System.out.println(t1.getState());
    }
}

