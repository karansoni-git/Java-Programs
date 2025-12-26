package collection_framework.QueueInterface.BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDemo {
    public static void main(String[] args) {
        //binary heap as array data structure is used.
        BlockingQueue<Integer> queue = new PriorityBlockingQueue<>(5); //default initialCapacity is 11.
        Thread producer = new Thread(() -> {
            try {
                while (true) {
                    int x = (int) (Math.random() * 100);
                    queue.put(x);
                    System.out.println("Entered element " + x + " successfully --> " + queue);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(2000);
                    int val = queue.take();
                    System.out.println("Value taken from queue " + val + " --> " + queue);
                    System.out.println();
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

//        producer.start();
//        consumer.start();

        BlockingQueue<String> queue1 = new PriorityBlockingQueue<>();
        queue1.offer("karan");
        queue1.offer("aman");
        queue1.offer("dhruvil");
        queue1.offer("rahul");
        queue1.offer("ghanshyam");
        System.out.println(queue1);
        for (String elem : queue1) {
            System.out.print(elem + " "); //iteration is not sorted
            System.out.println(queue1.poll()); // when we are removing element from queue we can see the element priority.
        }
    }
}

/*
=> What is PriorityBlockingQueue? :
    -> PriorityBlockingQueue is a thread-safe, priority-based, unbounded implementation of the BlockingQueue interface.
    -> Key idea :
        -> Elements are not processed in FIFO order.
        -> They are processed based on priority.

    -> Why PriorityBlockingQueue is Needed? :
        -> In concurrent systems, sometimes order of insertion is not important, but importance (priority) is.
            -> Real-world problems:
                -> Task schedulers
                -> Job queues
                -> Event handling systems
                -> Priority-based thread execution
            -> Normal BlockingQueue:
                -> FIFO only
            -> PriorityBlockingQueue:
                -> Highest-priority task processed first
                -> Thread-safe
                -> Automatic blocking on empty queue

    -> Key Characteristics :
        -> Thread-safe
        -> Priority-based ordering
        -> Unbounded (very important)
        -> Uses binary heap internally
        -> Does NOT allow null
        -> take() blocks if empty
        -> put() NEVER blocks
        -> Ordering based on: Comparable or Comparator

    -> Data Structure Used : Binary Heap (Min-Heap by default)

    -> Blocking Behavior (VERY IMPORTANT) :
        | Operation | Behavior                |
        | --------- | ----------------------- |
        |  put()    |  NEVER blocks           |
        |  offer()  |  NEVER blocks           |
        |  take()   |  Blocks if empty        |
        |  poll()   |  Returns null if empty  |
        -> Because the queue is unbounded, it never becomes “full”.

    -> Constructors of PriorityBlockingQueue :
        -> PriorityBlockingQueue()
        -> PriorityBlockingQueue(int initialCapacity)
        -> PriorityBlockingQueue(int initialCapacity,Comparator<? super E> comparator)
        -> PriorityBlockingQueue(Collection<? extends E> c)

    -> ALL METHODS of PriorityBlockingQueue (IN DETAIL) :
        1. Exception-Throwing Methods :
            -> add(E e) : Inserts element , Throws exception if element is null
            -> remove() : Removes head , Throws exception if empty
            -> element() : Retrieves head , Throws exception if empty
        2. Non-Blocking Methods :
            -> offer(E e) : Inserts element , Always returns true
            -> poll() : Removes head , Returns null if empty
            -> peek() : Retrieves head , Returns null if empty
        3. Blocking Methods :
            -> put(E e) : Inserts element , NEVER blocks , Only checks for null.
            -> take() : Removes head , BLOCKS if queue is empty , Thread waits on notEmpty , Wakes when element arrives
        4. Timed Blocking Methods :
            -> offer(E e, long timeout, TimeUnit unit) : Behaves like offer(e) , Timeout ignored (queue unbounded)
            -> poll(long timeout, TimeUnit unit) : Waits for element , Returns null on timeout
        5. Utility & Bulk Methods :
            -> size() : return the size
            -> contains() : check for element availability
            -> clear() : removes all elements
            -> drainTo(Collection<? super E> c) : Bulk removal , Efficient transfer
 */
