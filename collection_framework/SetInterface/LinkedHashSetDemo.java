package collection_framework.SetInterface;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        /* => add(E e) : is used to insert an element into a LinkedHashSet while preserving insertion order and preventing duplicates.*/
        set.add("Ironman");
        set.add("hulk");
        set.add("Spiderman");
        set.add("Thor");
        set.add("Captain America");
        System.out.println("LinkedHashSet : " + set);

        /* => remove(Object o) : is used to delete a specific element from a LinkedHashSet while preserving the insertion order of remaining elements.*/
        System.out.println("remove(\"hulk\") : " + set.remove("hulk"));
        System.out.println("LinkedHashSet : " + set);

        /* => contains(Object o) : checks whether a specific element exists in a LinkedHashSet.*/
        System.out.println("contains(\"Ironman\") : " + set.contains("Ironman"));

        /* => isEmpty() : checks whether a LinkedHashSet contains no elements.*/
        System.out.println("isEmpty() : " + set.isEmpty());

        /* => size() : returns the number of elements currently present in a LinkedHashSet.*/
        System.out.println("size() : " + set.size());

        System.out.println("hashCode() : " + set.hashCode());

        /* => clear() : is used to remove all elements from a LinkedHashSet, making it empty.
        Deletes all elements from the set. Set size becomes 0. Insertion order information is also cleared. The LinkedHashSet object itself remains usable.*/
        set.clear();
        System.out.println("After clear() : " + set);
    }
}

/*
=> What is LinkedHashSet?
    -> LinkedHashSet is a Set implementation that maintains insertion order while still ensuring unique elements.
    -> syntax : public class LinkedHashSet<E>
        extends HashSet<E>
        implements Set<E>, Cloneable, Serializable

    -> Key Characteristics :
        -> No duplicate elements
        -> Maintains insertion order
        -> Allows at most one null
        -> Slightly slower than HashSet
        -> Not thread-safe

    -> Class Hierarchy
        Collection
            └── Set
                 └── AbstractSet
                          └── HashSet
                                  └── LinkedHashSet

-> Implements: Set, Cloneable, Serializable

    -> Constructors :
        -> LinkedHashSet()
        -> LinkedHashSet(int initialCapacity)
        -> LinkedHashSet(int initialCapacity, float loadFactor)
        -> LinkedHashSet(Collection<? extends E> c)
*/