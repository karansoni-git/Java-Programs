package collection_framework.ListInterface;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> arr = new CopyOnWriteArrayList();

        /* => add(E e) : Adds element at end | => add(int index, E element) : Inserts at index
           => addAll(Collection<? extends E> c) : Adds all elements | => addAll(int index, Collection<? extends E> c) : Inserts collection
           => addIfAbsent(E e) : Adds only if element not present | => addAllAbsent(Collection<? extends E> c) : Adds all absent elements. */
        arr.add(11);
        arr.add(1,12);
        arr.add(13);
        arr.add(14);
        arr.add(15);
        arr.addIfAbsent(12);
        arr.addIfAbsent(16);
        System.out.println("Array : " + arr);

        /* => get(int index) : returns the element at the specified index in the list without removing it.
        Part of List interface
        Thread-safe in CopyOnWriteArrayList due to copy-on-write mechanism. */
        System.out.println("get(2) : " + arr.get(2));

        /* => set(int index, E element) : replaces the element at the specified index with the given element and returns the old element.
        Part of List interface. Thread-safe in CopyOnWriteArrayList due to copy-on-write mechanism. */
        System.out.println("set(1,1001) -> removed : " + arr.set(1,1001));
        System.out.println(arr);

        /* => remove(int index) : Removes element at index | => remove(Object o) : Removes first occurrence
            => removeAll(Collection<?> c) : Removes all matching | => removeIf(Predicate<? super E> filter) : Removes elements matching condition
            => clear() : removes all elements | => retainAll(Collection<?> c) : Retains only matching. */
        System.out.println("Removed Element : " + arr.remove(1));
        System.out.println("Array : " + arr);

        /* => size() : returns the number of elements currently present in the CopyOnWriteArrayList.
        Part of List interface. Thread-safe because it reads the current snapshot of the internal array. */
        System.out.println("Size Of CopyOnWriteArrayList : " + arr.size());

        /* => isEmpty() : checks whether the CopyOnWriteArrayList contains zero elements.
        Part of Collection interface. Thread-safe because it uses the current snapshot of the internal array. */
        System.out.println("Is Empty : " + arr.isEmpty());

        /* => contains(Object o) checks whether the list contains the specified element.
        Part of Collection interface. Thread-safe due to copy-on-write. Uses equals() method for comparison. */
        System.out.println("contains(31) : " + arr.contains(31));

        /* => indexOf(Object o) returns the index of the first occurrence of the specified element in the list, or -1 if it is not present.
        Part of List interface. Thread-safe due to copy-on-write. Uses equals() for element comparison. */
        System.out.println("indexOf(14) : " + arr.indexOf(14));

        /* => lastIndexOf(Object o) : returns the index of the last occurrence of the specified element in the list, or -1 if it is not present.
        Part of List interface. Thread-safe due to copy-on-write. Uses equals() for element comparison. */
        System.out.println("lastIndexOf(13) : " + arr.lastIndexOf(13));

        /* => removeIf() : removes all elements of the list that satisfy a given condition (Predicate).
        Introduced in Java 8.
        Works atomically in CopyOnWriteArrayList.
        Thread-safe due to copy-on-write mechanism.
        What it Does :
            Traverses all elements | Evaluates the predicate | Removes elements that match | Creates a new copy of the internal array (copy-on-write)
            Ensures thread safety without locking the entire list. */
        arr.removeIf((a)-> a%2 == 0);
        System.out.println("After removeIf() method Array : " + arr);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(11);
        arr2.add(13);
        System.out.println("Array2 : " + arr2);
        arr.retainAll(arr2);
        System.out.println("Array : " + arr);

        /* => clear() : removes all elements from the list.
        After calling this method, the list becomes empty, but any references to the old elements are cleared for garbage collection.
        Part of Collection interface. Thread-safe due to copy-on-write. */
        arr.clear();
        System.out.println("Array : " + arr);
    }
}

/*
=> What is CopyOnWriteArrayList?
    -> CopyOnWriteArrayList is a thread-safe List implementation in
    java.util.concurrent.

    -> Core Idea :
        -> Write → Copy → Modify → Replace
        -> On every write operation, it creates a new copy of the internal array
        -> Readers always see a stable snapshot
        -> No locking needed for read operations

    -> Key Features :
        -> Thread-safe without synchronizing reads
        -> Fail-safe iterators (no ConcurrentModificationException)
        -> Excellent for read-heavy, write-light scenarios
        -> Maintains insertion order
        -> Allows duplicates and null

    -> Implements:
        -> List, RandomAccess, Cloneable, Serializable

    -> Core Principle (VERY IMPORTANT) :
        -> Add element:
            -> Acquire lock
            -> Copy existing array
            -> Add new element to copy
            -> Replace old array reference
            -> Release lock

        -> Read element:
            ->Read directly from array
            ->No lock, no blocking

        -> Constructors
            -> CopyOnWriteArrayList()
            -> CopyOnWriteArrayList(Collection<? extends E> c)
            -> CopyOnWriteArrayList(E[] toCopyIn)

*/