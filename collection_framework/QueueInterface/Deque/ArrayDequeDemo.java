package collection_framework.QueueInterface.Deque;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        System.out.println("addFirst(10)");
        arrayDeque.addFirst(10);
        System.out.println("addLast(100)");
        arrayDeque.addLast(100);
        System.out.println("offerFirst(20) : " + arrayDeque.offerFirst(20));
        System.out.println("offerLast(200) : " + arrayDeque.offerLast(200));
        System.out.println("add(300) : " + arrayDeque.add(300)); //same as addLast()
        System.out.println("offer(400) : " + arrayDeque.offer(400)); // same as offerLast()
        System.out.println("ArrayDeque : " + arrayDeque);


        System.out.println("getFirst() : " + arrayDeque.getFirst());
        System.out.println("getLast() : " + arrayDeque.getLast());
        System.out.println("peekFirst() : " + arrayDeque.peekFirst());
        System.out.println("peekLast() : " + arrayDeque.peekLast());
        System.out.println("element() : " + arrayDeque.element()); //same as getFirst()
        System.out.println("peek() : " + arrayDeque.peek()); //same as peekFirst()
        System.out.println("ArrayDeque : " + arrayDeque);

        System.out.println("removeFirst() : " + arrayDeque.removeFirst());
        System.out.println("removeLast(): " + arrayDeque.removeLast());
        System.out.println("pollFirst() : " + arrayDeque.pollFirst());
        System.out.println("pollLast() : " + arrayDeque.pollLast());
//        arrayDeque.remove(); // same as removeFirst()
//        arrayDeque.poll(); // same as pollFirst()
        System.out.println("ArrayDeque : " + arrayDeque);

        ArrayDeque<Integer> ad = new ArrayDeque<>();
        /* Stack Methods (LIFO Support) */
        ad.push(12);
        ad.push(84);
        ad.push(91);
        ad.push(51);
        ad.push(42);
        System.out.println("ArrayDeque : " + ad);
        System.out.println("pop() : " + ad.pop());
        System.out.println("removeFirstOccurrence(20) : " + ad.removeFirstOccurrence(12));
        System.out.println("removeLastOccurrence(51) : " + ad.removeLastOccurrence(51));
        ad.push(82);
        ad.push(101);
        ad.push(949);
        System.out.println("size() : " + ad.size());
        System.out.println("isEmpty() : " + ad.isEmpty());
        System.out.println("contains(83) : " + ad.contains(83));

        System.out.print("forEach : ");
        for (Integer i : ad){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("hashCode() : " + ad.hashCode());

        System.out.println("ArrayDeque : " + ad);

        ad.clear();
        System.out.println("After clear() : " + ad);

    }
}
/*
=> What is Deque? :

    -> Deque = Double Ended Queue

    -> You can :
        -> Insert elements at both ends
        -> Remove elements from both ends

    -> It can behave as:
        -> Queue (FIFO)
        -> Stack (LIFO)

=> What is ArrayDeque?
    -> ArrayDeque is a resizable-array implementation of the Deque interface.

    -> syntax : public class ArrayDeque<E>
                extends AbstractCollection<E>
                implements Deque<E>, Cloneable, Serializable

    -> Key Characteristics :
        -> Faster than LinkedList
        -> Uses circular array
        -> No null elements allowed
        -> Not thread-safe
        -> Maintains insertion order
        -> No capacity limit (auto grows)

    -> Internal Working of ArrayDeque :
        -> Data Structure Used :
            -> Circular Resizable Array

    -> Internal Fields (Simplified)
        Object[] elements;
        int head; // index of first element
        int tail; // index after last element

    -> Circular Structure :
        Index:    0   1   2   3   4   5   6
        Array:   [ ][ ][C][D][E][ ][ ]
                     ↑           ↑
                    head        tail

        -> head moves left when adding at front
        -> tail moves right when adding at rear
        -> Uses modulo arithmetic for wrapping

    -> Resizing (Grow Operation) :
    -> When array becomes full:
        -> Capacity is doubled
        -> Elements are copied in correct order
        -> head = 0, tail = size
*/
