package collection_framework.MapInterface;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();

        /* => put(K key, V value) : is used to insert or update a key–value pair in a ConcurrentHashMap in a thread-safe manner.*/
        /* putIfAbsent(K key, V value) : is used to insert a key–value pair only if the key is not already present in the ConcurrentHashMap.
        It is thread-safe and atomic, making it very useful in concurrent programming.*/
        map.put("mobile",20);
        map.put("laptop",91);
        map.put("tablet",101);
        map.put("smartwatch",341);
        map.put("earbuds",919);
        System.out.println("ConcurrentHashMap : " + map);

        /* => replace(K key, V value) : is used to replace the value for a key only if the key is already present in the ConcurrentHashMap.
        It is thread-safe and atomic.*/
        System.out.println("replace(\"earbuds\",1000) : " + map.replace("earbuds",1000));

        /* => get(Object key) : is used to retrieve the value associated with a given key from a ConcurrentHashMap in a
        thread-safe and non-blocking way.*/
        System.out.println("get(\"mobile\") : " + map.get("mobile"));

        /* => getOrDefault() : is used to return the value associated with a key, or a default value if the key is not present
        in the ConcurrentHashMap.*/
        System.out.println("getOrDefault(\"adapter\",150) : " + map.getOrDefault("adapter",150));

        /* => remove(Object key) : is used to delete the mapping for a given key from a ConcurrentHashMap in a thread-safe and atomic way.
        Removes the key–value pair for the specified key. Returns the previous value associated with the key.
        Returns null if the key was not present. */
        System.out.println("remove(\"earbuds\") : " + map.remove("earbuds"));

        /* => containsKey(Object key) : is used to check whether a given key is present in a ConcurrentHashMap in a thread-safe and non-blocking manner.*/
        System.out.println("containsKey(\"mobile\") : " + map.containsKey("mobile"));

        /* => containsValue(Object value) : is used to check whether a given value exists in a ConcurrentHashMap.*/
        System.out.println("containsValue(1000) : " + map.containsValue(1000));

        /* => isEmpty() : is used to check whether the ConcurrentHashMap contains no key–value mappings.
        Result is a momentary snapshot (may change immediately due to concurrency). */
        System.out.println("isEmpty() : " + map.isEmpty());

        /* => size() : returns the number of key–value mappings present in a ConcurrentHashMap.*/
        System.out.println("size() : " + map.size());

        /* => mappingCount() : returns the total number of key–value mappings in a ConcurrentHashMap as a long, and is the preferred
        way to get the size in concurrent environments.*/
        System.out.println("mappingCount() : " + map.mappingCount());

        /* => keySet() : returns a set view of all keys present in the ConcurrentHashMap.
        Returns a live view of the keys. Backed by the original map (changes reflect both ways).
        Thread-safe and weakly consistent. */
        System.out.println("keySet() : " + map.keySet());

        /* => values() : returns a collection view of all values contained in the ConcurrentHashMap.
        Returns a live, thread-safe view of the map’s values. Backed by the original map → changes in the collection reflect in the map. */
        System.out.println("values() : " + map.values());

        /* => entrySet() : returns a set view of all key–value mappings in the ConcurrentHashMap.
        Returns a live, thread-safe set view of the map’s entries. Backed by the map → changes in the set reflect in the map. */
        System.out.println("entrySet() : " + map.entrySet());

        System.out.println("ConcurrentHashMap : " + map);

        /* => reduce(long p, BiFunction f) : Reduces entries | reduceKeys(long p, BiFunction f) : Reduce keys
           => reduceValues(long p, BiFunction f) : Reduce values | => reduceEntries(long p, BiFunction f) : Reduce entries. */

        /* clear() : is used to remove all key–value mappings from a ConcurrentHashMap in a thread-safe manner.
        Removes all entries from the map. After execution, the map becomes empty. Thread-safe, but not a single atomic operation.
        Does not block the entire map for a long time. */
        map.clear();
        System.out.println("After clear() : " + map);

    }
}

/*
=> What is ConcurrentHashMap?
    -> ConcurrentHashMap is a thread-safe, high-performance Map implementation from the java.util.concurrent package,
    designed for concurrent access without locking the entire map.
    -> this is a thread-safe version of HashMap.

    -> Key Characteristics :
        -> Thread-safe.
        -> High concurrency.
        -> No null key and no null value.
        -> Better performance than Hashtable.
        -> Iterators are weakly consistent.
        -> Introduced in Java 5.

    -> Class Hierarchy :
                Map
                 └── ConcurrentMap
                           └── ConcurrentHashMap

    -> Implements: ConcurrentMap, Serializable

    -> Internal Working :
        Java 7 vs Java 8+
        -> Java 7 Internal Structure
            -> Segmented Locking
            -> ConcurrentHashMap
                -> ├── Segment[0]
                -> ├── Segment[1]
                -> ├── Segment[2]
                -> Map divided into multiple segments
                -> Each segment = independent HashMap + lock
                -> Default concurrency level = 16
            -> Effect:
                -> Multiple threads can write to different segments
                -> Each segment still locks fully

        -> Java 8+ Internal Structure
            -> Segments removed
            -> Uses CAS + synchronized blocks
            -> Node<K,V>[] table
            -> Similar to HashMap
            -> Uses bin-level locking
            -> Buckets can become:
            -> Linked List
            -> Red-Black Tree (if collisions increase)

    -> Constructors
    -> ConcurrentHashMap()
    -> ConcurrentHashMap(int initialCapacity)
    -> ConcurrentHashMap(int initialCapacity, float loadFactor)
    -> ConcurrentHashMap(int initialCapacity, float loadFactor, int concurrencyLevel)
    -> ConcurrentHashMap(Map<? extends K, ? extends V> m)
*/
