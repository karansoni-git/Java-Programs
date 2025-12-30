package collection_framework.SetInterface;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();

        /* => add(E e) : inserts an element into a CopyOnWriteArraySet only if it is not already present, using the copy-on-write strategy.*/
        set.add(92);
        set.add(810);
        set.add(371);
        set.add(39);
        set.add(181);
        System.out.println("CopyOnWriteArraySet : " + set); //maintain insertion order

        /* => remove(Object o) : removes a specified element from a CopyOnWriteArraySet if it exists, using the copy-on-write mechanism.*/
        System.out.println("remove(39) : " + set.remove(39));
        System.out.println("CopyOnWriteArraySet : " + set);

        /* => contains(Object o) : checks whether a specified element exists in a CopyOnWriteArraySet.*/
        System.out.println("contains(181) : " + set.contains(181));

        /* => isEmpty() : checks whether a CopyOnWriteArraySet contains no elements.*/
        System.out.println("isEmpty() : " + set.isEmpty());

        /* => size() : returns the number of elements currently present in a CopyOnWriteArraySet.*/
        System.out.println("size() : " + set.size());

        /* => hashCode() : returns the hash code value for the set, following the general contract of the Set interface.
        Computes a hash code based on all elements in the set. Order-independent (important!). Two sets with the same elements will have the same hashCode.*/
        System.out.println("hashCode() : " + set.hashCode());


        /* => clear() : removes all elements from a CopyOnWriteArraySet using the copy-on-write strategy.*/
        set.clear();
        System.out.println("After clear() : " + set);
    }
}
/*
=> What is CopyOnWriteArraySet? :
    -> CopyOnWriteArraySet is a thread-safe Set implementation designed for read-heavy, write-light concurrent scenarios.

    ->syntax : public class CopyOnWriteArraySet<E>
               extends AbstractSet<E>
               implements Set<E>, Serializable

    -> Key Characteristics :
        -> Thread-safe (no external synchronization needed)
        -> No duplicate elements
        -> Maintains insertion order
        -> Snapshot iteration (no ConcurrentModificationException)
        -> No null elements
        -> Writes are expensive; reads are very fast

    -> Class Hierarchy :
            Collection
                └── Set
                     └── AbstractSet
                              └── CopyOnWriteArraySet

    -> CopyOnWriteArraySet is backed by a CopyOnWriteArrayList.
    -> Array is immutable for readers
    -> On every write → new copy of array created

    -> Constructors :
        -> CopyOnWriteArraySet()
        -> CopyOnWriteArraySet(Collection<? extends E> c)
*/
