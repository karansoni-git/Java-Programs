package collection_framework.QueueInterface.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDequeDemo {
    public static void main(String[] args) {
        Deque<Integer> list = new LinkedList<>();

        /* Deque Methods */
        System.out.println("addFirst(12)");
        list.addFirst(12);
        System.out.println("addLast(100)");
        list.addLast(100);
        System.out.println("offerFirst(389)");
        list.offerFirst(389);
        System.out.println("offerLast(200)");
        list.offerLast(200);

        System.out.println("head -> " + list + " <- tail");

        System.out.println("removeFirst() : " + list.removeFirst());
        System.out.println("removeLast() : " + list.removeLast());

        System.out.println("head -> " + list + " <- tail");

        System.out.println("pollFirst() : " + list.pollFirst());
        System.out.println("pollLast() : " + list.pollLast());

        System.out.println("head -> " + list + " <- tail");

        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

        System.out.println("head -> " + list + " <- tail");

        System.out.println("getFirst() : " + list.getFirst()); // throws exception
        System.out.println("getLast() : " + list.getLast()); // throws exception

        System.out.println("peekFirst() : " + list.peekFirst());
        System.out.println("peekLast() : " + list.peekLast());

        System.out.println("head -> " + list + " <- tail");
        System.out.println("push(1000)");
        System.out.println("push(2000)");
        list.push(1000);
        list.push(2000);
        System.out.println("pop() : " + list.pop());
        System.out.println("peek() : " + list.peek()); // Same as peekFirst()

        System.out.println("contains(1000) : " + list.contains(1000));
        System.out.println("size() : " + list.size());
        System.out.println("isEmpty() : " + list.isEmpty());

        System.out.print("forEach : ");
        for (Integer i : list){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("head -> " + list + " <- tail");

        list.clear();
        System.out.println("After clear() : " + list);

    }
}

/*
=> Why LinkedList as Deque? :
    -> LinkedList implements Deque, so it directly supports all Deque operations.
    -> Doubly linked list
    -> Allows null
    -> Maintains insertion order
    -> Efficient add/remove at both ends
*/