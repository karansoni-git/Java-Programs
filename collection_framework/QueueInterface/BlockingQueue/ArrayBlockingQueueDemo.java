package collection_framework.QueueInterface.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);
        Thread producer = new Thread(() -> {
            try {
                int val = 1;
                while (true) {
                    queue.put(val);
                    System.out.println("Entered element " + val + " successfully --> " + queue);
                    Thread.sleep(500);
                    val++;
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(800);
                    System.out.print(queue + " ");
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
=> What is BlockingQueue?
    -> BlockingQueue is a thread-safe Queue designed for concurrent programming, where:
    -> If the queue is empty, consumer threads WAIT
    -> If the queue is full, producer threads WAIT
    -> This waiting happens automatically, without writing wait() / notify().

    -> Why BlockingQueue is Needed?
        -> In multi-threaded applications, we often face:
        -> Producer generating data
        -> Consumer consuming data
        -> Need safe communication between them

    -> Problems without BlockingQueue
        -> Race conditions
        -> Manual synchronization
        -> Deadlocks
        -> Busy waiting

    -> BlockingQueue solves:
        -> Thread safety
        -> Automatic blocking
        -> No manual locks needed
        -> Clean Producer–Consumer implementation


    ->BlockingQueue Hierarchy :

                                             Iterable
                                                ↓
                                             Collection
                                                ↓
                                             Queue
                                                ↓
                                    BlockingQueue (interface)
                                                ↓
--------------------------------------------------------------------------------------------------------
        |                    |                    |                  |             |                   |
ArrayBlockingQueue  LinkedBlockingQueue  PriorityBlockingQueue  DelayQueue  SynchronousQueue  LinkedTransferQueue



    -> Core Behavior of BlockingQueue :
        | Situation   | Behavior       |
        | ----------- | -------------- |
        | Queue empty | Consumer waits |
        | Queue full  | Producer waits |

    -> BlockingQueue Method Categories :
        -> BlockingQueue has 4 TYPES of methods :

            1. Exception-Throwing Methods :
                | Operation | Method      |
                | --------- | ----------- |
                | Insert    |  add(e)     |
                | Remove    |  remove()   |
                | Examine   |  element()  |
                Throws exception if operation fails.

            2. Non-Blocking (Special Value) :
                | Operation | Method     |
                | --------- | ---------- |
                | Insert    |  offer(e)  |
                | Remove    |  poll()    |
                | Examine   |  peek()    |
                Returns false or null.

            3. Blocking Methods (IMPORTANT) :
                | Operation | Method   |
                | --------- | -------- |
                | Insert    |  put(e)  |
                | Remove    |  take()  |
                Thread waits until operation possible.

            4. Timed Blocking Methods :
                | Operation | Method                 |
                | --------- | ---------------------- |
                | Insert    |  offer(e, time, unit)  |
                | Remove    |  poll(time, unit)      |
                Waits for specified time.
*/

/*
=> What is ArrayBlockingQueue? :
    -> ArrayBlockingQueue is a bounded, thread-safe, FIFO queue implementation of the BlockingQueue interface.

    -> Why ArrayBlockingQueue Exists? :
        -> In multithreaded applications, we often need:
        -> Multiple producers
        -> Multiple consumers
        -> Controlled memory usage
        -> Automatic thread coordination

    -> Without it :
        -> Manual synchronization
        -> wait()/notify() complexity
        -> Race conditions
        -> Deadlocks

    -> With ArrayBlockingQueue :
        -> Thread-safe
        -> Fixed capacity
        -> Automatic blocking
        -> No busy waiting

    -> Key Characteristics :
        -> Fixed size (bounded).
        -> FIFO order.
        -> Thread-safe.
        -> Uses array internally.
        -> Uses ReentrantLock.
        -> Supports fairness policy.
        -> Does NOT allow null.
        -> High performance.
        -> single lock producers and consumers block each other.
        -> uses a single lock for enqueue and dequeue operations.
        -> more threads creates problem because continuously blocking the queue. very short time for queue to become idle.

    -> Visualization :
        Capacity = 5

        Index:   0   1   2   3   4
        Array:  [10][20][30][ ][ ]
                  ↑          ↑
              takeIndex   putIndex

        putIndex → where producer inserts.
        takeIndex → where consumer removes.
        Circular movement using modulo arithmetic.

    -> Constructors of ArrayBlockingQueue :
        -> ArrayBlockingQueue(int capacity)
        -> ArrayBlockingQueue(int capacity, boolean fair)
        -> ArrayBlockingQueue(int capacity, boolean fair,Collection<? extends E> c)
            -> Fairness :
                -> fair = true → Threads served in FIFO order
                -> fair = false → Higher throughput (default)

    1. Exception-Throwing Methods :
        -> add(E e) : Inserts element , Throws exception if queue is full.
        -> remove() : Removes head , Throws exception if empty
        -> element() : Returns head , Throws exception if empty
    2. Non-Blocking (Special Value) Methods :
        -> offer(E e) : Inserts element , Returns false if queue is full
        -> poll() : Removes head , Returns null if empty
        -> peek() : Returns head , Returns null if empty
    3. Blocking Methods (CORE FEATURE) :
        -> put(E e) : Inserts element , Blocks if queue is full , Acquires lock , Waits on notFull , Signals notEmpty
        -> take() : Removes element , Blocks if queue is empty , Acquires lock , Waits on notEmpty , Signals notFull
    4. Timed Blocking Methods :
        -> offer(E e, long timeout, TimeUnit unit) : Waits for space , Returns false if timeout expires
        -> poll(long timeout, TimeUnit unit) : Waits for element , Returns null if timeout expires
    5. Bulk & Utility Methods :
    -> size() : Returns number of elements , ⏱ O(1)
    -> remainingCapacity() : Returns available slots
    -> clear() : Removes all elements , Signals waiting producers
    -> contains(Object o) : check for element
    -> drainTo(Collection<? super E> c) : Transfers all elements , Efficient bulk removal

    -> ArrayBlockingQueue is a high-performance, bounded, thread-safe FIFO queue that uses a circular array and explicit locking with conditions to efficiently
    coordinate producers and consumers in concurrent systems.
*/