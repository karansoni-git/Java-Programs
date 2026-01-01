package collection_framework.SetInterface;

import java.util.*;

public class ImmurableSetsDemo {
    public static void main(String[] args) {
        Set<Integer> originalSet = new HashSet<>();
        originalSet.add(13);
        originalSet.add(42);
        originalSet.add(51);
        originalSet.add(8);
        originalSet.add(89);
        System.out.println("originalSet : " + originalSet);

        /* Collections.unmodifiableSet() */
        Set<Integer> set1 = Collections.unmodifiableSet(originalSet);
        System.out.println("Collections.unmodifiableSet(" + set1 + ")");
        originalSet.add(74);
        System.out.println("Collections.unmodifiableSet(" + set1 + ")");
//        set1.add(39); // throws UnsupportedOperationException

        /* Set.of() */
        Set<Integer> set2 = Set.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Set.of(" + set2 + ")");
//        set2.add(28); // throws UnsupportedOperationException

        /* Set.copyOf() */
        Set<Integer> set3 = Set.copyOf(originalSet);
        System.out.println("Set.copyOf(" + set3 + ")");
        originalSet.add(1001); //does not reflect the changes in set3
        System.out.println("Set.copyOf(" + set3 + ")");
    }
}

/*
=> What Are Immutable Sets?
    -> An immutable Set is a Set whose contents cannot be modified after creation.
    -> No add, remove, clear
    -> No structural changes
    -> Safe to share across threads
    -> Predictable behavior

    -> Ways to Create Immutable Sets in Java
        -> Java provides three main ways:
        -> Set.of() (Java 9+)
        -> Collections.unmodifiableSet()
        -> Third-party libraries (Guava, etc.)

----------------------------------------------------------------------------------------------------------------------------------------------------------------------
1) What is Collections.unmodifiableSet()? :
    -> Collections.unmodifiableSet(Set<? extends T> s)

    -> It returns a read-only (unmodifiable) view of the given Set.

    -> Very Important :
        -> This does NOT create an immutable set.
        -> It creates a wrapper around the original set.

    -> Key Characteristics :
        -> Prevents modification via the returned reference
        -> Backed by the original set
        -> Changes to the original set are reflected
        -> Not thread-safe by itself
        -> Allows nulls if the underlying set allows them

    -> Allowed (Read-Only) :
        size() | isEmpty() | contains() | iterator() | toArray() | containsAll() | forEach()

    -> Blocked (Throws UnsupportedOperationException)
        add() | remove() | clear() | addAll() | removeAll() | retainAll()

2) What is Set.of()? :
    -> Set.of() is a factory method introduced in Java 9 to create immutable (unmodifiable) sets.
    -> Key Characteristics :
        -> Truly immutable (not a wrapper)
        -> Thread-safe
        -> No duplicate elements
        -> No null elements
        -> Very memory-efficient
        -> Faster than HashSet for small sets

    -> How Set.of() Works Internally :
        -> Accepts elements as varargs
        -> Checks for null
        -> Checks for duplicate elements using equals()
        -> Stores elements in a fixed-size array
        -> Uses open addressing for lookup
        -> Returns immutable set instance

    -> Method Overloads (LIMIT IS IMPORTANT) :
        -> Set.of()
        -> Set.of(e1)
        -> Set.of(e1, e2)
        -> ...
        -> Set.of(e1, e2, ..., e10)

        Maximum 10 elements
        For more → use Set.ofEntries() (not available)
        Use Set.copyOf(Collection)

    -> All modifying methods throw : UnsupportedOperationException
    -> Blocked methods :
        add() | remove() | clear() | addAll() | retainAll() | removeAll()
    -> Supported Read-Only Methods :
        size() | isEmpty() | contains() | iterator() | forEach() | toArray()

3) What is Set.copyOf()? :
    -> Set.copyOf() is a factory method introduced in Java 10 to create a truly immutable Set from an existing collection.
    -> Key Characteristics :
        -> Creates a truly immutable set
        -> Not backed by the original collection
        -> Thread-safe
        -> No null elements
        -> No duplicates
        -> No size limit
        -> Preserves iteration order of source set (if source is a Set)

    -> How Set.copyOf() Works Internally :
        -> Accepts any Collection
        -> If collection is already immutable → returns it directly (optimization)
        -> Iterates over elements
        -> Checks for:
            -> Null elements → NullPointerException
            -> Duplicates → IllegalArgumentException
        -> Copies elements into compact array
        -> Returns immutable set instance

    -> All modifying operations throw : UnsupportedOperationException
        -> Blocked methods :
            add() | remove() | clear() | addAll() | retainAll() | removeAll()
        -> Supported Read-Only Methods :
            size() | isEmpty() | contains() | iterator() | forEach() | toArray()
*/
