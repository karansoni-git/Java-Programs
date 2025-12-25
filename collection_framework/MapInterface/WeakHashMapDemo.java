package collection_framework.MapInterface;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<Integer,String> map = new WeakHashMap<>();

        /* => put() : inserts or updates a key–value pair in WeakHashMap.
        Keys are weakly referenced. Entry is automatically removed when key is garbage-collected. */
        map.put(20,"karan");
        map.put(18,"purn");
        map.put(17,"kirtan");
        map.put(14,"kushal");
        map.put(9,"krishil");

        /* => putIfAbsent() : inserts the key–value pair only if the key is not already mapped (or mapped to null).
        If key absent → inserts value. If key present with non-null value → no change. If key present with null value → inserts value. */
        map.putIfAbsent(15,"aayu");

        /* => replace() replaces the value for the specified key only if the key already exists in the map.
        If key exists → value replaced. If key does NOT exist → no change. Does not insert new entry. */
        System.out.println("replace(9,\"het\") : " + map.replace(9,"het"));

        /* => get() : returns the value associated with the specified key, or null if:
        Key is not present. Key was garbage-collected. Value itself is null.*/
        System.out.println("get(18) : "  + map.get(18));

        /* => getOrDefault() returns the value associated with the key if present; otherwise, it returns the specified default value.
        Key may be garbage-collected if weakly referenced. Default value is returned only when key is absent or cleared*/
        System.out.println("getOrDefault(200,\"ram\") : " + map.getOrDefault(200,"ram"));

        /* => remove(Object key) removes the entry for the specified key, if it exists in the map.
        If key exists → entry removed, old value returned. If key does not exist → returns null.
        Key is stored as weak reference, so may already be GC-cleared. */
        System.out.println("remove(20) : " + map.remove(20));

        /* => remove(key, value) removes the entry only if both the key and value match.
        Key is weakly referenced. Entry is removed only if present and value matches. Returns true if removal succeeds, false otherwise. */
        System.out.println("remove(9,\"het\") : " + map.remove(9,"het"));

        System.out.println("map : " + map);

        /* => size() : returns the number of entries in a WeakHashmap.*/
        System.out.println("Size Of WeakHashMap : " + map.size());

        /* => isEmpty() checks whether the WeakHashMap contains zero key–value mappings.
        Returns true → map is empty. Returns false → map has at least one entry. */
        System.out.println("Is Empty : " +  map.isEmpty());

        /* => containsKey() checks whether the map contains a mapping for the specified key.
        Returns true → key exists. Returns false → key does not exist. */
        System.out.println("containsKey(18) : " + map.containsKey(18));

        /* => containsValue() checks whether the map contains at least one mapping with the specified value.
        Returns true → value exists. Returns false → value does not exist. */
        System.out.println("containsValue(\"het\") : " + map.containsValue("het"));

        /* => keySet() : returns a set containing all of the keys in the WeakHashmap. */
        System.out.println("keySet() : " + map.keySet());

        /* => values() : returns a Collection view of all values contained in the WeakHashMap.
        The returned collection is backed by the map. Changes to the collection reflect in the map and vice versa.
        Values can be duplicate or null. */
        System.out.println("values() : " + map.values());

        /* => entrySet() : returns a Set view of all key–value mappings (Map.Entry<K,V>) present in the WeakHashMap.
        Each element is a Map.Entry. The returned set is backed by the map. Changes reflect in both the set and the map. */
        System.out.println("entrySet() : " + map.entrySet());

        /* => clear() removes all key–value mappings from the WeakHashMap.
        Map becomes empty. All weakly referenced keys and their values are removed. Capacity remains unchanged .*/
        map.clear();
        System.out.println("map : " + map);


    }
}

/*
=> What is WeakHashMap in Java?
    -> WeakHashMap is a Map implementation in java.util where keys are stored as weak references.
    -> If a key is no longer strongly referenced anywhere else,it becomes eligible for Garbage Collection, and the
       corresponding entry is automatically removed from the map.

     -> Key Characteristics :
        -> Stores key-value pairs like HashMap.
        -> Keys are weakly referenced.
        -> Entries are removed automatically by GC.
        -> Not synchronized.
        -> Allows one null key.
        -> Values are strong references.
        -> Useful for memory-sensitive caching.

    -> Class Hierarchy
            Map
             └── AbstractMap
                      └── WeakHashMap

    -> Implements: Map, Cloneable, Serializable

    -> Internal Data Structure (VERY IMPORTANT)
        -> WeakHashMap internally uses:
            -> Hash table (like HashMap)
            -> WeakReference for keys
            -> ReferenceQueue to track GC-cleared keys
            -> Key → stored as WeakReference<K>
            -> Value → strong reference
            -> When key is GC-ed → reference cleared

    -> How Garbage Collection Works Here
        1. Key has no strong reference outside map
        2. JVM GC collects key object
        3. WeakReference key is cleared
        4. Entry is placed in ReferenceQueue
        5. WeakHashMap detects this and removes entry

    -> Constructors
        -> WeakHashMap()
        -> WeakHashMap(int initialCapacity)
        -> WeakHashMap(int initialCapacity, float loadFactor)
        -> WeakHashMap(Map<? extends K, ? extends V> m)

*/