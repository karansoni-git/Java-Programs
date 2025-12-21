package collection_framework.MapInterface;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer,String> map = new ConcurrentSkipListMap<>();

        /* => put(K key, V value) : is used to insert or update a key–value pair in a ConcurrentSkipListMap.
        This map is thread-safe, sorted, and non-blocking.*/
        map.put(21,"karan");
        map.put(18,"dhruvil");
        map.put(22,"krish");
        map.put(19,"vedant");
        map.put(17,"tirth");

        /* => putIfAbsent() : inserts a key–value pair only if the key is not already present in the ConcurrentSkipListMap.
        It is atomic, thread-safe, and ideal for concurrent programming.
        */
        map.putIfAbsent(20,"vatsal");

        /* => replace(K key, V value) : is used to update the value of an existing key only if the key is already present in the
        ConcurrentSkipListMap. Replaces the value only if the key exists. Does nothing if the key is absent. */
        System.out.println("replace(20,\"anant\") : " + map.replace(20,"anant"));

        /* => get(Object key) : is used to retrieve the value associated with a given key from a ConcurrentSkipListMap.
        Returns the value mapped to the specified key. Returns null if the key is not present. */
        System.out.println("get(21) : " + map.get(21));

        /* => getOrDefault() : returns the value associated with the given key, or a default value if the key is not present in the
        ConcurrentSkipListMap.*/
        System.out.println("getOrDefault(23,\"anant\") : " + map.getOrDefault(23,"anant"));

        /* => remove(Object key) : is used to delete the mapping for a specified key from a ConcurrentSkipListMap.
        Overloaded Variant : remove(Object key, Object value). */
        System.out.println("remove(20) : " + map.remove(20));
        System.out.println("ConcurrentSkipListMap : " + map);

        /* => containsKey() : checks whether a specified key exists in a ConcurrentSkipListMap.
        Returns true if the key is present. Returns false if the key is absent. */
        System.out.println("containsKey(21) : " + map.containsKey(21));

        /* => containsValue() : checks whether a specified value exists in a ConcurrentSkipListMap.
        Returns true if any key maps to the given value. Returns false if the value is not present.*/
        System.out.println("containsValue(\"shazam\") : " + map.containsValue("shazam"));

        /* => isEmpty() : checks whether the ConcurrentSkipListMap contains no key–value mappings.
        Returns true → map is empty. Returns false → map has at least one entry*/
        System.out.println("isEmpty() : " + map.isEmpty());

        /* => size() : returns the number of key–value mappings present in a ConcurrentSkipListMap.*/
        System.out.println("size() : " + map.size());

                                            /* SortedMap Methods : */

        /* => firstKey() : The firstKey() method returns the lowest (first) key currently present in the ConcurrentSkipListMap,
        according to its natural ordering or provided comparator.*/
        System.out.println("firstKey() : " + map.firstKey());

        /* => lastKey() : is used to retrieve the largest (highest) key currently present in a ConcurrentSkipListMap,
        according to its natural ordering or the custom Comparator.*/
        System.out.println("lastKey() : " + map.lastKey());

        /* => headMap(K toKey) : method is used to get a view of the map whose keys are strictly less than toKey.*/
        System.out.println("headMap(21)" + map.headMap(21));

        /* => tailMap(K fromKey) : is used to get a view of the map whose keys are greater than or equal to fromKey.*/
        System.out.println("tailMap(21) : " + map.tailMap(21));

        /* => subMap() : is used to get a view of the TreeMap whose keys lie within a specified range.*/
        System.out.println("subMap(19,22) : " + map.subMap(19,22));

                                            /* NavigableMap Methods : */

        System.out.println("ConcurrentSkipListMap : " + map);

        /* => lowerKey(K key) : Returns the greatest key strictly less than the given key, or null if there is no such key.*/
        System.out.println("lowerKey(21) : " + map.lowerKey(21));

        /* => lowerEntry(K key) : Returns a key-value mapping associated with the greatest key strictly less than the given key,
        or null if there is no such key.*/
        System.out.println("lowerEntry(21) : " + map.lowerEntry(21));

        /* => higherKey(K key) : Returns the least key strictly greater than the given key, or null if there is no such key.*/
        System.out.println("higherKey(20) : " + map.higherKey(20));

        /* => higherEntry(K key) : Returns a key-value mapping associated with the least key strictly greater than the given
        key, or null if there is no such key.*/
        System.out.println("higherEntry(20) : " + map.higherEntry(20));

        /* => floorKey(K key) : Returns the greatest key less than or equal to the given key, or null if there is no such key.*/
        System.out.println("floorKey(23) : " + map.floorKey(23));

        /* => floorEntry(K key) : Returns a key-value mapping associated with the greatest key less than or equal to the
        given key, or null if there is no such key.*/
        System.out.println("floorEntry(23) : " + map.floorEntry(23));

        /* => ceilingKey(K key) : Returns the least key greater than or equal to the given key, or null if there is no such key.*/
        System.out.println("ceilingKey(16) : " + map.ceilingKey(16));

        /* => ceilingEntry(K key) : Returns a key-value mapping associated with the least key greater than or equal to the
        given key, or null if there is no such key.*/
        System.out.println("ceilingEntry(16) : " + map.ceilingEntry(16));

        /* => firstEntry() : is used to get the entry (key + value) with the smallest key in a ConcurrentSkipListMap. */
        System.out.println("firstEntry() : " + map.firstEntry());

        /* => lastEntry() : is used to get the entry (key + value) with the largest key in a ConcurrentSkipListMap. */
        System.out.println("lastEntry() : " + map.lastEntry());

        /* => pollFirstEntry() : is used to retrieve AND remove the entry (key + value) with the smallest key from a ConcurrentSkipListMap.*/
        System.out.println("pollFirstEntry() : " + map.pollFirstEntry());

        /* => pollLastEntry() : is used to retrieve AND remove the entry (key + value) with the largest key from a ConcurrentSkipListMap.*/
        System.out.println("pollLastEntry() : " + map.pollLastEntry());

        System.out.println("ConcurrentSkipListMap : " + map);

        /* => descendingMap() : is used to get a reverse-order (descending) view of the ConcurrentSkipListMap.*/
        System.out.println("descendingMap() : " + map.descendingMap());

        /* => navigableKeySet() : is used to get a NavigableSet view of all keys in the ConcurrentSkipListMap, sorted according
        to the map’s ordering.*/
        System.out.println("navigableKeySet() : " + map.navigableKeySet());

        /* => descendingKeySet() : is used to get a reverse-order (descending) NavigableSet view of all keys present in a ConcurrentSkipListMap.*/
        System.out.println("descendingKeySet() : " + map.descendingKeySet());


        /* => keySet() : returns a sorted, navigable set view of all keys present in the ConcurrentSkipListMap.*/
        System.out.println("keySet() :" + map.keySet());

        /* => values() : returns a collection view of all values present in the ConcurrentSkipListMap.*/
        System.out.println("values() : " +map.values());

        /* => entrySet() : returns a set view of all key–value mappings in a ConcurrentSkipListMap.*/
        System.out.println("entrySet() : " + map.entrySet());

        /* => clear() : removes all key–value mappings from a ConcurrentSkipListMap, making it completely empty.*/
        map.clear();
        System.out.println("After clear() : " + map);
    }
}

/*
=> What is ConcurrentSkipListMap?
    -> ConcurrentSkipListMap is a thread-safe, sorted Map implementation in java.util.concurrent.

    -> Key Characteristics :
        -> Thread-safe
        -> Maintains sorted order of keys
        -> Based on Skip List data structure
        -> Non-blocking (lock-free) for most operations
        -> No null keys or null values
        -> Iterators are weakly consistent
        -> Comparable to TreeMap but concurrent

    -> Class Hierarchy :
            Map
             └── ConcurrentMap
                      └── ConcurrentNavigableMap
                                   └── ConcurrentSkipListMap

    -> Implements: ConcurrentNavigableMap, Serializable.

    -> Internal Data Structure – Skip List
        -> What is a Skip List? :
            -> A Skip List is a probabilistic, layered linked list that allows:
            -> Fast search
            -> Fast insertion
            -> Fast deletion
        -> Skip List Structure
            -> Level 3:  HEAD ──▶  10 ──▶  30
            -> Level 2:  HEAD ──▶  10 ──▶  20 ──▶ 30
            -> Level 1:  HEAD ──▶  5 ──▶ 10 ──▶ 20 ──▶ 30
            -> Higher levels “skip” elements
            -> Lower levels contain all elements

    -> Concurrency Model
        -> Lock-Free Algorithm
        -> Uses CAS (Compare-And-Swap)
        -> No global locking
        -> Multiple threads can operate concurrently
        -> Visibility:
            -> Uses volatile fields
            -> Memory consistency guaranteed
*/
