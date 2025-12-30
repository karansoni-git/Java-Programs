package collection_framework.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        /* => add(E e) : is used to insert an element into a HashSet.It ensures no duplicate elements are stored.
        Adds the specified element to the set if it is not already present. Uses hashing to store elements. Allows one null element. Order of elements is not guaranteed. */
        set.add("Karan");
        set.add("Aman");
        set.add(null);
        set.add("Dhruvil");
        set.add("Vedant");
        System.out.println("HashSet : " + set);

        /* => remove(Object o) : is used to delete a specific element from a HashSet.
        Removes the specified element if it exists. Uses hashing to locate the element. Maintains no order. Allows removal of null (if present). */
        System.out.println("remove(\"Aman\") : " + set.remove("Aman"));

        System.out.println("HashSet : " + set);

        /* => contains(Object o) : is used to check whether a specific element exists in a HashSet.*/
        System.out.println("contains(\"Vedant\") : " + set.contains("Vedant"));

        /* => isEmpty() : is used to check whether a HashSet contains any elements.*/
        System.out.println("isEmpty() : " + set.isEmpty());

        /* => size() : returns the number of elements currently present in a HashSet.*/
        System.out.println("size() : " + set.size());

        for (String elem : set) {
            System.out.println(elem);
        }

        System.out.println(set.hashCode());

        /* => clear() : is used to remove all elements from a HashSet, making it empty.
        Deletes all elements from the set. Set size becomes 0. The HashSet object itself is not destroyed. Allows reuse of the same set. */
        set.clear();
        System.out.println("After clear() : " + set);
    }
}

/*
=> What is HashSet?
    -> HashSet is a Set implementation backed by a HashMap, used to store unique elements with no guaranteed order.

    -> syntax : public class HashSet<E>
        extends AbstractSet<E>
        implements Set<E>, Cloneable, Serializable

    -> Key Characteristics :
        -> No duplicate elements
        -> Allows at most one null
        -> Unordered (no insertion or sorted order)
        -> Not thread-safe
        -> O(1) average time complexity

    -> Class Hierarchy :
        Collection
            └── Set
                 └── AbstractSet
                          └── HashSet

    -> Constructors :
        -> HashSet()
        -> HashSet(int initialCapacity)
        -> HashSet(int initialCapacity, float loadFactor)
        -> HashSet(Collection<? extends E> c)
*/
