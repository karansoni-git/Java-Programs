package class_and_object;

public class synchronized_kw extends Thread {

    private int count = 0;

    @Override
    public synchronized void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(getName() + " = ");
            System.out.println(i);
            count++;
        }
    }

    public static void main(String[] args) {
        synchronized_kw s1 = new synchronized_kw();
        synchronized_kw s2 = new synchronized_kw();
        s1.start();
        s2.start();
    }
}
