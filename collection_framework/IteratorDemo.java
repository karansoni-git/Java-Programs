package collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("karan");
        list.add("vedant");
        list.add("tirth");
        list.add("dhruvil");
        list.add("anant");
        System.out.println(list);

        //forEach loop internally uses a Iterator for iterating.
        for (String elem : list) {
            System.out.print(elem + " ");
        }

        //Iterator is interface
        System.out.println("\nIterator");
        // Get the iterator
        Iterator<String> iterator = list.iterator(); // here iterator() is method which return object of Iterator interface
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}

/*
=> What is Iterator? :
    -> Iterator is an interface used to traverse (iterate) elements of a collection one by one.
    -> It provides a standard way to access elements without exposing the internal structure of the collection.
    Why Iterator is Needed?

    -> Before Iterator :
        -> Traversal logic was collection-specific
        -> No uniform way to loop through collections
    -> Iterator solves :
        -> Uniform traversal
        -> Safe element removal
        -> Encapsulation of internal structure

    -> Where Iterator is Used? :
        -> All Java Collections :
            -> List
            -> Set
            -> Queue
            -> Deque
            -> Except: Map (uses keySet(), values(), entrySet())

    -> Collection extends Iterable
    -> Iterable.iterator() returns Iterator

    -> Key Characteristics :
        -> Works with all collections
        -> Forward-only traversal
        -> One-directional
        -> Supports element removal
        -> Not index-based
        -> Can detect concurrent modification

    -> Internal Working (Conceptual) :
        -> Collection returns an iterator object
        -> Iterator maintains:
            -> Current position
            -> Expected modification count (expectedModCount)
        -> Compares with collection’s modCount
        -> If mismatch → ConcurrentModificationException

    -> Methods of Iterator Interface (ALL METHODS) :
        -> Iterator has 3 main methods.
            -> boolean hasNext() : Checks if more elements are available. Returns true if next element exists , Does NOT move cursor
            -> E next() : Returns the next element and moves cursor. Returns element , Moves pointer forward , Throws NoSuchElementException if no element
            -> void remove() (Optional Operation) : Removes last element returned by next().
                Rules : Can be called only once per next() , Calling before next() → IllegalStateException , Calling twice → IllegalStateException

*/
