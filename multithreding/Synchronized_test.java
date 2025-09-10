package class_and_object.multithreding;

public class Synchronized_test extends Thread {

    public Synchronized synchronize;

    public Synchronized_test(Synchronized synchronize) {
        this.synchronize = synchronize;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronize.increment();
        }
    }

    public static void main(String[] args){
        Synchronized s1 = new Synchronized();
        Synchronized_test t1 = new Synchronized_test(s1); //sharing common resource, here we have Synchronized class as a common resource.
        Synchronized_test t2 = new Synchronized_test(s1); //sharing common resource, here we have Synchronized class as a common resource.
        t1.start();
        t2.start();
        try{
        t1.join(); // wait to complete the thread process.
        t2.join(); // wait to complete the thread process.
        }catch (InterruptedException i){
            System.out.println(i);
        }
        System.out.println("Count Value : " + s1.getCount()); // then printing the getCount() method to check the count value.
    }
}
