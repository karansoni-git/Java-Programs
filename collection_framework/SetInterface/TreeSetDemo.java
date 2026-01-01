package collection_framework.SetInterface;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(39);
        set.add(12);
        set.add(46);
        set.add(95);
        set.add(153);
        System.out.println("TreeSet : " + set);

        System.out.println("remove(95) : " + set.remove(95));
        System.out.println("TreeSet : " + set);

        System.out.println("contains(39) : " + set.contains(39));
        System.out.println("isEmpty() : " + set.isEmpty());
        System.out.println("size() : " + set.size());

        System.out.println("TreeSet : " + set);
        /* SortedSet Methods */
        System.out.println("first() : " + set.first());
        System.out.println("last() : " + set.last());
        System.out.println("last() " + set.getFirst());
        System.out.println("getLast() : " + set.getLast());
        System.out.println("headSet(46) : " + set.headSet(46));
        System.out.println("tailSet(46) : " + set.tailSet(46));
        System.out.println("subSet(20,50) : " + set.subSet(20,50));



        System.out.println("TreeSet : " + set);
        /* NavigableSet Methods */
        System.out.println("lower(46) : " + set.lower(46));
        System.out.println("floor(46) : " + set.floor(46));
        System.out.println("higher(46) : " + set.higher(46));
        System.out.println("ceiling(46) : " + set.ceiling(46));
        System.out.println("descendingSet() : " + set.descendingSet());
        System.out.println("pollFirst() : " + set.pollFirst());
        System.out.println("pollLast() : " + set.pollLast());

        System.out.println("TreeSet : " + set);

        set.clear();
        System.out.println("After clear() : " + set);
    }
}

/*
=> What is TreeSet?
    -> TreeSet is a sorted Set implementation that stores unique elements in ascending order (natural order or custom comparator).

    -> syntax : public class TreeSet<E>
        extends AbstractSet<E>
        implements NavigableSet<E>, Cloneable, Serializable

    -> Key Characteristics :
        -> Sorted order
        -> No duplicate elements
        -> Does NOT allow null elements
        -> O(log n) performance
        -> Not thread-safe

    -> Data Structure Used → Red-Black Tree :
        -> Self-balancing Binary Search Tree
        -> Ensures height ≈ log(n)
        -> Guarantees O(log n) operations

    -> Constructors :
        -> TreeSet()
        -> TreeSet(Comparator<? super E> comparator)
        -> TreeSet(Collection<? extends E> c)
        -> TreeSet(SortedSet<E> s)

*/
