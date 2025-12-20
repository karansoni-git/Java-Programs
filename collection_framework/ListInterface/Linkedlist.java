package collection_framework.ListInterface;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        /* => add(E element) : add element at end of list
           => add(int index, E e) : Inserts at given index.
           => addAll(Collection c) : Adds all elements at end.
           => addAll(int index, Collection c) : Adds collection at given index.
           => addFirst(E e) : Adds element at beginning.
           => addLast(E e) : Adds element at end (same as add()). */
        list.add("Karan");
        list.add("Krish");
        list.add(1,"Dhruvil");
        list.addFirst("Tirth");
        list.addLast("Vedant");

        System.out.println("List : " + list);

        /* => get(int index) : Returns element of given index.
           => getFirst() : Returns first element.
           => getLast() : Returns last element. */
        System.out.println("First Element : " + list.getFirst());
        System.out.println("Element At Index 3 : " + list.get(3));
        System.out.println("Last Element : " + list.getLast());

        /* => set(int index, E e) : Replaces element at index and return the replaced element*/
        System.out.println("Replaced Element : " + list.set(0,"Vatsal"));
        System.out.println("List After Replacing : " + list);

        /* => remove() : Removes first element. | => remove(int index) : Removes element at index.
           => remove(Object o) : Removes first occurrence of object. | => removeFirst() : Removes first element.
           => removeLast() : Removes last element. | => removeFirstOccurrence(Object o) : Removes first match.
           => removeLastOccurrence(Object o) : Removes last match. */
        System.out.println("Removed Element : " + list.remove()); // remove first element and return that element
//        System.out.println("First Removed Element : " + list.removeFirst()); // remove first element and return.
//        System.out.println("Last Removed Element : " + list.removeLast()); // remove last element and return.
//        System.out.println("Is Krish Removed : " + list.remove("Krish")); // return true if element removed from list else false.
        System.out.println("List After Removing Element : " + list);

        /* => contains(Object o) : checks whether a given element exists in the LinkedList. returns true if element available in list*/
        System.out.println("Is List Contains Krish : " + list.contains("Krish"));

        /* => indexOf(Object o) : returns the index of the first occurrence of the given element in the LinkedList.
           Returns index (0-based) if element is found
           Returns -1 if element is NOT found. */
        System.out.println("Index Of Dhruuvil In List : " + list.indexOf("Dhruvil"));

        /* => lastIndexOf(Object o) : returns the index of the last (final) occurrence of the given element in the LinkedList.
           Returns index (0-based) if element is found
           Returns -1 if element is NOT found. */
        System.out.println("Index Of Krish In List(Start From End): " + list.lastIndexOf("Krish"));

        /* => size():  returns the number of elements currently stored in the LinkedList. */
        System.out.println("Size Of List : " + list.size());

        /* => isEmpty() : checks whether the LinkedList has zero elements.
          true → if the LinkedList has 0 elements
          false → if the LinkedList has 1 or more elements. */
        System.out.println("Is List Empty : " + list.isEmpty());

        /* => peek() : returns the first element (head) of the LinkedList without removing it.Returns null if the list is empty. */
        System.out.println("peek() : " + list.peek());

        /* => poll() : retrieves and removes the first element (head) of the LinkedList.Returns null if the list is empty. */
        System.out.println("poll() : " + list.poll());

        /* => offer(E e) : inserts the element at the end (tail) of the LinkedList.
        It behaves like: addLast(e) , Same as add(e) , But returns a boolean (true/false). */
        System.out.println("offer() : " + list.offer("KARAN"));

        /* => element() : retrieves the first element (head) of the LinkedList without removing it.Throws NoSuchElementException if the list is empty.
        It behaves like: getFirst() , Similar to peek(). */

        /* => offerFirst(E e) : inserts the element at the beginning (head) of the LinkedList.returns true always*/
        System.out.println("offerFirst() : " + list.offerFirst("Tirth"));

        /* => offerLast(E e) : inserts the element at the end (tail) of the LinkedList.returns true always
        It behaves like: addLast(e), Same as offer(e), Same as add(e) (for LinkedList) */
        System.out.println("offerLast() : " + list.offerLast("Anant"));

        /* => peekFirst() : returns the first element (head) of the LinkedList without removing it. It is equivalent to: peek(), Safe version of getFirst().
        return null if the list is empty. */
        System.out.println("peekFirst() : " + list.peekFirst());

        /* => peekLast() : returns the last element (tail) of the LinkedList without removing it.It is the safe version of getLast().returns null if the list is empty. */
        System.out.println("peekLast() : " + list.peekLast());

        /* => pollFirst() : retrieves and removes the first element (head) of the LinkedList.It is the safe version of:removeFirst().return null if the list is empty. */
        System.out.println("pollFirst() : " + list.pollFirst());

        /* => pollLast() : removes and returns the last element of the LinkedList.If the list is empty, it returns null (does NOT throw an exception).*/
        System.out.println("pollLast() : " + list.pollLast());

        /* => push() : Same as addFirst (stack behavior). */
        list.push("RAM");

        /* => pop() : Same as removeFirst (stack behavior). */
        list.pop();

        System.out.println(list);

        /* => clear() : removes all elements from the LinkedList. List becomes empty. Size becomes 0. All node references are removed. */
        list.clear();
        System.out.println("List After Clearing : " + list);

    }
}


/*
=> What is LinkedList in Java?
    -> LinkedList is a doubly linked list implementation of the List and Deque interfaces.
    -> It is part of the java.util package.
    -> ✔ Key Features
        ->Stores elements in nodes, not in arrays.
        ->Each node contains:
        ->data + next pointer + previous pointer
        ->Fast insertion/deletion anywhere.
        ->Maintains insertion order.
        ->Allows duplicates.
    ->Implements:
    ->List, Deque, Queue, Cloneable, Serializable.
*/