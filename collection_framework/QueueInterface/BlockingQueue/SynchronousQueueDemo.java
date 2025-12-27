package collection_framework.QueueInterface.BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new SynchronousQueue<>();
        Thread producer = new Thread(() -> {
            try {
                int val = 1;
                while (true) {
                    queue.put(val);
                    System.out.println("Entered element " + val + " successfully --> " + queue);
                    val++;
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    int val = queue.take();
                    System.out.println("Value taken from queue " + val + " --> " + queue);
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });
        producer.start();
        consumer.start();
    }
}

/*
=> What is SynchronousQueue? :
    -> SynchronousQueue is a thread-safe BlockingQueue with ZERO capacity.
    -> Meaning:
        -> It does not store elements at all.
        -> Every put() must wait for a corresponding take() and vice-versa.

    -> Why SynchronousQueue Exists?
        -> Most queues store data.
        -> SynchronousQueue is not a storage queue — it is a handoff queue.
        -> Real-world analogy :
            -> Handshake :
                -> Producer gives item directly to consumer
                -> No buffer in between

    -> Key Characteristics (VERY IMPORTANT) :
        -> Zero capacity
        -> Thread-safe
        -> Direct handoff
        -> No element is ever stored
        -> put() blocks until take()
        -> take() blocks until put()
        -> Supports fairness mode
        -> No null elements

    -> ALL METHODS of SynchronousQueue (IN DETAIL) :
        1. Exception-Throwing Methods :
            -> add(E e) : Always throws IllegalStateException , Because queue has no capacity.
            -> remove() : Always throws NoSuchElementException
            -> element() : Always throws NoSuchElementException
        2. Non-Blocking Methods :
            -> offer(E e) : Returns true if consumer waiting ,Returns false otherwise
            -> poll() : Returns element if producer waiting , Returns null otherwise
            -> peek() : Always returns null
        3. Blocking Methods :
            -> put(E e) : Blocks until consumer takes , Throws InterruptedException
            -> take() : Blocks until producer puts
        4. Timed Blocking Methods :
            -> offer(E e, long timeout, TimeUnit unit) : Waits for consumer , Returns false on timeout
            -> poll(long timeout, TimeUnit unit) : Waits for producer , Returns null on timeout
        5. Utility Methods :
            -> size() : return the queue size. Always returns 0
            -> isEmpty() : check whether the queue is empty or not. Always returns true
            -> remainingCapacity() : Always returns 0
            -> contains(Object o) : Always returns false
            -> clear() : Does nothing

    -> SynchronousQueue is a zero-capacity, thread-safe BlockingQueue designed for direct handoff between producer and consumer
    threads, offering high performance and optional fairness but no storage capability.
*/
