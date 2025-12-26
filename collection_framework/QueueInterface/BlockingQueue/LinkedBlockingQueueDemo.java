package collection_framework.QueueInterface.BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class LinkedBlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);
        Thread producer = new Thread(() -> {
            try {
                int val = 1;
                while (true) {
                    queue.put(val);
                    System.out.println("Entered element " + val + " successfully --> " + queue);
                    Thread.sleep(100);
                    val++;
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        Thread consumer1 = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(2000);
                    System.out.print(queue + " ");
                    int val = queue.take();
                    System.out.println("Consumer 1 take value from queue : " + val + " --> " + queue);
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });
        Thread consumer2 = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(2000);
                    System.out.print(queue + " ");
                    int val = queue.take();
                    System.out.println("Consumer 2 take value from queue : " + val + " --> " + queue);
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });
        producer.start();
        consumer1.start();
        consumer2.start();
    }
}
/*
=> What is LinkedBlockingQueue? :
    -> LinkedBlockingQueue is a thread-safe, optionally bounded, FIFO implementation of the BlockingQueue interface, backed by a linked list.

    -> Why LinkedBlockingQueue is Needed? :
        -> In concurrent systems, we need:
        -> Multiple producers & consumers
        -> Safe data exchange
        -> High throughput
        -> Optional capacity control

    -> Problems without it:
        -> Manual synchronization
        -> wait()/notify() complexity
        -> Race conditions
        -> Poor scalability

    -> LinkedBlockingQueue provides :
        -> Automatic blocking
        -> High concurrency
        -> FIFO ordering
        -> Optional bounding

    -> Key Characteristics :
        -> Thread-safe
        -> FIFO order
        -> Uses linked list internally
        -> Optional capacity (bounded / unbounded)
        -> Uses two locks (high concurrency)
        -> No null elements
        -> Better throughput than ArrayBlockingQueue

    -> Data Structure Used : Singly Linked List

    -> Visualization :
        head → [10] → [20] → [30] → null
                               ↑
                              tail

    -> Constructors :
        -> LinkedBlockingQueue()              // capacity = Integer.MAX_VALUE
        -> LinkedBlockingQueue(int capacity)  // bounded
        -> LinkedBlockingQueue(Collection<? extends E> c)

    -> Locking & Thread Safety :
              Lock	            Purpose
            putLock	        For producer operations
            takeLock	    For consumer operations

        -> Producers and consumers can work in parallel
        -> Better concurrency than ArrayBlockingQueue

    -> ALL METHODS of LinkedBlockingQueue (IN DETAIL)
        1. Exception-Throwing Methods :
            -> add(E e) : Inserts element , Throws IllegalStateException if full
            -> remove() :Removes head , Throws NoSuchElementException if empty
            -> element() : Retrieves head , Throws exception if empty
        2. Non-Blocking (Special Value) Methods :
            -> offer(E e) :Inserts element , Returns false if full.
            -> poll() : Removes head , Returns null if empty.
            -> peek() : Retrieves head , Returns null if empty.
        3. Blocking Methods (CORE FEATURE) :
            -> put(E e) : Inserts element , Blocks if queue is full , Acquires putLock , Waits on notFull , Signals notEmpty
            -> take() : Removes element , Blocks if queue is empty , Acquires takeLock , Waits on notEmpty , Signals notFull
        4. Timed Blocking Methods :
            -> offer(E e, long timeout, TimeUnit unit) : Waits for space , Returns false on timeout
            -> poll(long timeout, TimeUnit unit) : Waits for element , Returns null on timeout
        5. Utility & Bulk Methods :
            -> size() : Uses AtomicInteger count
            -> remainingCapacity() : Returns capacity - count.get()
            -> contains(Object o) : check for element availability
            -> clear() : Removes all elements , Signals waiting threads
            -> drainTo(Collection<? super E> c) : Bulk removal , Efficient transfer
*/
