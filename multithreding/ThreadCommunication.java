package class_and_object.multithreding;


class SharedResource {
    private int data;
    private boolean hasData;

    public synchronized void produce(int value) {
        while (hasData) {
            try {
                System.out.println("\nWAITING FOR CONSUMER TO CONSUME THE VALUE");
                Thread.sleep(1000);
                wait();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        this.data = value;
        hasData = true;
        System.out.println("PRODUCED VALUE : " + value);
        notify();
    }

    public synchronized void consume() {
        while (!hasData) {
            try {
                System.out.println("\nWAITING FOR PRODUCER TO PRODUCE THE VALUE");
                Thread.sleep(1000);
                wait();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("CONSUMED VALUE : " + data);
        hasData = false;
        notify();
    }
}

class Producer implements Runnable {

    private SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            resource.produce(i);
        }
    }
}

class Consumer implements Runnable {

    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            resource.consume();
        }
    }
}


public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();
    }
}

/*
=> What is Thread Communication? :
    -> Thread Communication means coordination between multiple threads so that they can work together by:
        -> Sharing resources
        -> Waiting for specific conditions
        -> Notifying other threads when work is done
    -> Java provides built-in methods for this in the Object class.

    -> Why Thread Communication is Needed? :
        -> Without communication :
            -> Busy waiting (CPU waste)
            -> Race conditions
            -> Inconsistent data
            -> Deadlocks

    -> Real-World Example :
        -> Producer produces data
        -> Consumer waits until data is available
        -> Consumer consumes
        -> Producer waits again

    -> Core Thread Communication Methods :
        -> All thread communication methods belong to java.lang.Object
            | Method                  | Description              |
            | ----------------------- | ------------------------ |
            |  wait()                 | Release lock & wait      |
            |  wait(long ms)          | Wait for given time      |
            |  wait(long ms, int ns)  | Timed wait               |
            |  notify()               | Wake one waiting thread  |
            |  notifyAll()            | Wake all waiting threads |

    -> Why Methods Are in Object Class? :
        -> Every object has a monitor (lock)
        -> Threads communicate via shared object
        -> Communication is based on object-level locks

    -> all methods :
        1) wait : Causes the current thread to release the lock and go into waiting state until notified.
        Key Points :
            -> Releases object lock
            -> Thread goes to WAITING state
            -> Must be called inside synchronized block
            -> Resumes only after notify() / notifyAll()
        2) notify() : Wakes up one arbitrary waiting thread.
        Key Points :
            -> Does NOT release lock immediately
            -> Notified thread runs after lock is released
            -> Selection is JVM-dependent
        3) notifyAll() : Wakes all waiting threads.
        Key Points :
            -> All threads move to BLOCKED state
            -> They compete for lock
            -> Avoids deadlock risk
*/