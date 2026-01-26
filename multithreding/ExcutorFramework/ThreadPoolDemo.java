package class_and_object.multithreding.ExcutorFramework;

public class ThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            threads[i] = new Thread(() -> {
                try {
                    System.out.println(factorial(finalI));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            threads[i].start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println("Total time : " + ((float) (System.currentTimeMillis() - startTime) / 1000) + " seconds");
    }

    public static int factorial(int num) throws InterruptedException {
        Thread.sleep(500);
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
