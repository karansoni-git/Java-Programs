package collection_framework.QueueInterface;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();

        /* => add(E e) : Inserts element at rear (tail) of queue. Throws exception if insertion fails.*/
        list.add(38);
        list.add(94);
        list.add(53);
        list.add(26);
        list.add(10);
        System.out.println("head -> " + list + " <- tail");

        /* => offer(E e) : Inserts element at rear. Returns false if insertion fails (no exception). Preferred method for queues. */
        list.offer(71);

        /* => remove() : Removes and returns head element. Throws NoSuchElementException if empty.*/
        System.out.println("remove() : " + list.remove());

        /* => poll() : Removes and returns head. Returns null if empty. */
        System.out.println("offer() : " + list.poll());

        /* => element() : Retrieves head without removing. Throws exception if empty.*/
        System.out.println("element() : " + list.element());

        /* => peek() : Retrieves head without removing. Returns null if empty.*/
        System.out.println("peek() : " + list.peek());

        System.out.println("head -> " + list + " <- tail");

        System.out.println("size() : " + list.size());
        System.out.println("isEmpty() : " + list.isEmpty());

        System.out.println("contains(281) : " + list.contains(281));

        System.out.println("head -> " + list + " <- tail");

        System.out.print("forEach : ");
        for (Integer e: list){
            System.out.print(e + " ");
        }

        System.out.println();

        list.clear();
        System.out.println("After clear() : " + list);


    }
}
/*
=> What is Queue Interface in Java? :
    -> Queue is a linear data structure that follows the FIFO (First In, First Out) principle.
    -> Meaning:
        -> The element added first is removed first
        -> Similar to a real-life queue (ticket counter, line at ATM)

    -> Common implementations :
        -> LinkedList
        -> PriorityQueue
        -> ArrayDeque
        -> ConcurrentLinkedQueue
        -> BlockingQueue (advanced concurrency)

    -> FIFO Working of Queue :
        -> Insert : Add element at rear (tail)
        -> Remove : Remove element from front (head)

    -> Queue Interface Methods :
        Queue provides two sets of methods:
            1. Exception-throwing methods
            2. Special-value methods (return null/false)

            Operation	Throws Exception	Returns Special Value
            Insert	        add(e)	               offer(e)
            Remove	        remove()	           poll()
            Examine	        element()	           peek()

=> Why LinkedList is used as a Queue?
    -> LinkedList is a doubly linked list and implements the Queue interface, so it naturally supports FIFO (First In First Out) operations.

    -> syntax : public class LinkedList<E>
                extends AbstractSequentialList<E>
                implements List<E>, Deque<E>, Queue<E>, Cloneable, Serializable

    -> Implements Queue
    -> Implements Deque (double-ended queue)
    -> Allows duplicate elements
    -> Allows null values
    -> No capacity restriction
    -> Maintains insertion order

    -> Queue Behavior in LinkedList :
        -> Insert : At tail (last)
        -> Remove : From head (first)

    -> Summary Table :
        Operation	            Method
        Insert	                add(), offer()
        Remove              	remove(), poll()
        Peek                	element(), peek()
        Front Insert	        addFirst(), offerFirst()
        Rear Insert	            addLast(), offerLast()
        Front Remove	        removeFirst(), pollFirst()
        Rear Remove	            removeLast(), pollLast()
*/
