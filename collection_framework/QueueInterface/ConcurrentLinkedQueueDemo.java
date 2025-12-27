package collection_framework.QueueInterface;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueDemo {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        queue.add("cherry");
        queue.add("banana");
        queue.add("guava");
        queue.add("avocado");
        queue.add("pineapple");
        System.out.println(queue);
    }
}

/*
=> What is ConcurrentLinkedQueue? :
    -> ConcurrentLinkedQueue is a thread-safe, non-blocking, unbounded queue based on linked nodes.
    -> Multiple threads can insert and remove elements without locks using CAS (Compare-And-Swap).

    -> Why ConcurrentLinkedQueue Exists? :
        -> Traditional synchronized queues:
            -> Use locks
            -> Cause contention
            -> Reduce scalability
        -> ConcurrentLinkedQueue:
            -> Lock-free
            -> High throughput
            -> Better scalability under heavy concurrency

    -> Key Characteristics :
        -> Thread-safe
        -> Lock-free (non-blocking)
        -> Unbounded
        -> FIFO ordering
        -> Uses CAS(Comapare And Swap) instead of locks
        -> Weakly consistent iterator
        -> No null elements
        -> High performance in multi-threaded systems

    -> Internal Data Structure : Singly Linked List

    -> Lock-Free Algorithm (Michael-Scott Queue)
        ->ConcurrentLinkedQueue is based on the Michael & Scott non-blocking queue algorithm.
        -> Key principles :
            -> No locks
            -> CAS retries on contention
            -> Threads never block
            -> Guarantees system-wide progress
*/