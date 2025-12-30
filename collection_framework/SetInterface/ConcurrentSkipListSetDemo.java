package collection_framework.SetInterface;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetDemo {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();
        set.add(381);
        set.add(491);
        set.add(1);
        set.add(917);
        set.add(37);
        set.add(10);
        System.out.println("ConcurrentSkipListSet : " + set);

        System.out.println("remove(10) : " + set.remove(10));
        System.out.println("ConcurrentSkipListSet : " + set);

        System.out.println("contains(1) : " + set.contains(1));
        System.out.println("isEmpty() : " + set.isEmpty());
        System.out.println("size() : " + set.size());

        /* SortedSet Methods */
        System.out.println("first() : " + set.first());
        System.out.println("last() : " + set.last());
        System.out.println("headSet(381) : " + set.headSet(381));
        System.out.println("tailSet(381) " + set.tailSet(381));
        System.out.println("subSet(30,400) : " + set.subSet(30,400));

        /* NavigableSet Methods */
        System.out.println("lower(100) : " + set.lower(100));
        System.out.println("higher(300) : " + set.higher(300));
        System.out.println("floor(200) : " + set.floor(200));
        System.out.println("ceiling(400) : " + set.ceiling(400));
        System.out.println("descendingSet() : " + set.descendingSet());
//        System.out.println("pollFirst() : " + set.pollFirst());
//        System.out.println("pollLast() : " + set.pollLast());

        System.out.print("forEach loop : ");
        for (Integer i : set){
            System.out.print(i + " ");
        }
        System.out.println();

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(37);
        set2.add(381);
        System.out.println("HashSet : " + set2);
        set.retainAll(set2);
        System.out.println("ConcurrentSkipListSet : " + set);

        set.clear();
        System.out.println("After clear() : " + set);
    }
}
/*
=> What is ConcurrentSkipListSet? :
    -> ConcurrentSkipListSet is a thread-safe, sorted, navigable Set designed for high-concurrency environments.

    ->syntax : public class ConcurrentSkipListSet<E>
               extends AbstractSet<E>
               implements NavigableSet<E>, Cloneable, Serializable

    -> Key Characteristics :
        -> Thread-safe
        -> Sorted (natural or Comparator)
        -> No duplicate elements
        -> Lock-free / non-blocking
        -> Weakly consistent iterators
        -> No null elements
        -> Scales well under heavy concurrency

    -> Class Hierarchy :
            Collection
                └── Set
                     └── SortedSet
                             └── NavigableSet
                                       └── ConcurrentSkipListSet

    -> What is a Skip List? :
        -> A Skip List is a probabilistic data structure that works like a multi-level linked list.

        -> Level 3:  A ---------> D
        -> Level 2:  A ----> C -> D
        -> Level 1:  A -> B -> C -> D

        -> Higher levels “skip” more nodes
        -> Search time ≈ O(log n)

    -> Constructors :
        -> ConcurrentSkipListSet()
        -> ConcurrentSkipListSet(Comparator<? super E> comparator)
        -> ConcurrentSkipListSet(Collection<? extends E> c)
        -> ConcurrentSkipListSet(SortedSet<E> s)
*/
