package collection_framework.QueueInterface.BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<delayedTask> delayedQueue = new DelayQueue<>();
        delayedQueue.put(new delayedTask("task1",2,TimeUnit.SECONDS));
        delayedQueue.put(new delayedTask("task2",3,TimeUnit.SECONDS));
        delayedQueue.put(new delayedTask("task3",1,TimeUnit.SECONDS));

        while (!delayedQueue.isEmpty()){
            delayedTask task = delayedQueue.take();
            System.out.println(task.getTaskName() + " is Executed at " + System.currentTimeMillis());
        }
    }
}

class delayedTask implements Delayed {

    private final String taskName;
    private final long startTime;

    public delayedTask(String taskName,long delay , TimeUnit unit){
        this.taskName = taskName; // taskName
        this.startTime = System.currentTimeMillis() + unit.toMillis(delay); // total time that will take by this task
    }
    @Override
    public long getDelay(TimeUnit unit) {
        long remaining = startTime - System.currentTimeMillis();
        return unit.convert(remaining , TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if(this.startTime < ((delayedTask) o).startTime){
            return -1;
        }
        if(this.startTime > ((delayedTask) o).startTime){
            return 1;
        }
        return 0;
    }

    public String getTaskName(){
        return taskName;
    }
}

/*
=> What is DelayQueue? :
    -> DelayQueue is a thread-safe, unbounded, time-based BlockingQueue where An element can be taken only after its delay has expired.
    -> Key Concept (VERY IMPORTANT) :
        -> DelayQueue stores elements that implement the Delayed interface
        -> Elements become available only after a specified delay time
        -> It is NOT FIFO
        -> It is NOT priority by value
        -> It is priority by remaining delay time

    -> Why DelayQueue Exists? :
        -> Some tasks should not execute immediately, but after a certain time.
        ->Real-world use cases:
            ->Task scheduling
            ->Session timeout handling
            ->Cache expiration
            ->Retry mechanisms
            ->Delayed job execution
            ->Token expiration systems

    -> Key Characteristics :
        -> Thread-safe
        -> Unbounded queue
        -> Time-based ordering
        -> Uses priority ordering internally
        -> Elements must implement Delayed
        -> take() blocks until delay expires
        -> put() never blocks
        -> No null elements

    -> Data Structure Used :
        -> Priority Queue (Min-Heap)
        -> Ordered by remaining delay time

    -> Ordering Rule :
        -> Element with smallest remaining delay is at the head.
        -> If delay > 0 → element NOT available
        -> If delay ≤ 0 → element can be taken

    -> Blocking Behavior (VERY IMPORTANT) :
        | Operation | Behavior                          |
        | --------- | --------------------------------- |
        | put(e)    | Never blocks                      |
        | offer(e)  | Never blocks                      |
        | take()    | Blocks until delay expires        |
        | poll()    | Returns null if delay not expired |

    -> How take() Works Internally :
        1. Check head element
        2. If queue empty → wait
        3. If delay > 0 → wait for delay time
        4. If delay ≤ 0 → remove and return element

    -> ALL METHODS OF DelayQueue (IN DETAIL) :
        1. Exception-Throwing Methods  :
            -> add(E e) : Inserts element , Throws exception if element is null , Internally calls offer()
            -> remove() : Removes head if available , Throws NoSuchElementException if none available
            -> element() :Returns head if available , Throws NoSuchElementException if none available
        2. Non-Blocking Methods :
            -> offer(E e) : Inserts element , Never blocks
            -> poll() : Returns head only if delay expired , Returns null otherwise
            -> peek() : Returns head element (even if delay not expired) , Does NOT remove it
        3. Blocking Methods :
            -> put(E e) : Inserts element , NEVER blocks , DelayQueue is unbounded
            -> take() : Blocks until delay expires , Returns element when ready , Core method of DelayQueue
        4. Timed Blocking Methods :
            -> offer(E e, long timeout, TimeUnit unit) : Same as offer(e) , Timeout ignored
            -> poll(long timeout, TimeUnit unit) : Waits up to timeout , Returns element if delay expires , Returns null otherwise
        5. Utility Methods :
            -> size() : Number of elements (including delayed ones)
            -> isEmpty() : True if no elements
            -> clear() : Removes all elements
            -> contains(Object o) : check element availability.
*/