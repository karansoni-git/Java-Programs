package collection_framework.QueueInterface;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // smallest element among all will be considered as the most priority element. here 2 will be considered as most priority element.
        pq.add(94);
        pq.add(31);
        pq.add(56);
        pq.add(12);
        pq.add(71);
        pq.offer(2);
        System.out.println("PriorityQueue : " + pq);

        System.out.println("remove() : " + pq.remove());
        System.out.println("poll() :" + pq.poll());

        System.out.println("PriorityQueue : " + pq);

        System.out.println("element() : " + pq.element());
        System.out.println("peek() : " + pq.peek());
        System.out.println("size() : " + pq.size());
        System.out.println("isEmpty() : " + pq.isEmpty());
        System.out.println("contains(31) : " + pq.contains(31));
        System.out.println("hashCode() : " + pq.hashCode());

        pq.clear();
        System.out.println("After clear() : " + pq);

        // when we remove the elements from priorityQueue that time we can actually see the real priority of the element
//        while (!pq.isEmpty()){
//            System.out.print(pq.poll() + " ");
//        }
        System.out.println();
    }
}

/*
=> What is PriorityQueue? :
    -> PriorityQueue is a Queue implementation where elements are ordered by priority, not FIFO.
    -> Key idea: Highest priority element is removed first, not the one added first.

    -> Important Characteristics :
        -> Not FIFO
        -> Orders elements based on :
            -> Natural ordering (Comparable)
            -> Custom Comparator
        -> Does NOT allow null
        -> Allows duplicate elements
        -> Not thread-safe
        -> Head element = smallest (by default)
        -> Only the head element is guaranteed to be sorted, not the entire queue.

    -> Internal Working of PriorityQueue :
        -> Data Structure Used: Binary Heap
        -> Default: Min Heap
        -> Implemented using Resizable Array

    -> Constructors :
        -> PriorityQueue()
        -> PriorityQueue(int initialCapacity)
        -> PriorityQueue(int initialCapacity, Comparator<? super E> comparator)
        -> PriorityQueue(Collection<? extends E> c)
        -> PriorityQueue(PriorityQueue<? extends E> c)
        -> PriorityQueue(SortedSet<? extends E> c)

*/
