package collection_framework.MapInterface;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        /* => put(K key, V value) inserts a key–value pair into the HashMap.
        If the key is new → entry is added . If the key already exists → old value is replaced .
        Allows one null key and multiple null values. */
        map.put(3,"Dhruvil");
        map.put(2,"Krish");
        map.put(7,"Tirth");
        map.put(1,"Karan");
        System.out.println(map);

        /* => put(K key, V value) : inserts a key–value pair into the HashMap.
        If the key is new → entry is added. If the key already exists → old value is replaced.
        Allows one null key and multiple null values. */
        map.put(12,"vedant");

        /* => putIfAbsent() inserts a key–value pair only if the key is not already present in the map or mapped to null.
        Introduced in Java 8. Part of Map interface. Not synchronized (HashMap is not thread-safe). */
        map.putIfAbsent(20,"harshit");

        /* => replace(K key, V value) replaces the value for a key only if the key is already present in the map.
        Introduced in Java 8. Part of Map interface. Does NOT insert a new key. */
        System.out.println(map.replace(7,"vatsal"));

        /* => HashMap replace(K key, V oldValue, V newValue) : This method replaces the value only if: The key is present AND The
        current value is equal to oldValue If either condition fails, no replacement happens.
        Introduced in Java 8 , Part of Map interface*/
        System.out.println(map.replace(12,"tirth"));

        /* => get() : returns the value of the entry in the map which has a specified key. */
        System.out.println("get(20) : " + map.get(20));

        /* => getOrDefault() : returns the value of the entry in the map which has a specified key.
        If the entry does not exist then the value of the second parameter is returned.*/
        System.out.println("getOrDefault(25,\"kirtan\") : " + map.getOrDefault(25,"kirtan"));

        /* => remove() : removes an entry with a specified key from the map.
        If a value is provided then the entry will only be removed if its value matches the specified value.*/
        System.out.println("Removed Element : " + map.remove(20));
        System.out.println("map.remove(25,\"kirtan\") : " + map.remove(25,"kirtan"));
        System.out.println(map);

        /* => containsKey() checks whether the map contains a mapping for the specified key.
        Returns true → key exists. Returns false → key does not exist. */
        System.out.println("containsKey(12) : " + map.containsKey(12));

        /* => containsValue() checks whether the map contains at least one mapping with the specified value.
        Returns true → value exists. Returns false → value does not exist. */
        System.out.println("containsValue(\"Karan\") : " + map.containsValue("Karan"));

        /* => isEmpty() checks whether the HashMap contains zero key–value mappings.
        Returns true → map is empty. Returns false → map has at least one entry. */
        System.out.println("Is Empty : " +  map.isEmpty());

        /* => size() : returns the number of entries in a map.*/
        System.out.println("Size Of HashMap : " + map.size());

        /* => keySet() : returns a set containing all of the keys in the map. */
        System.out.println("keySet() : " + map.keySet());

        /* => values() : returns a Collection view of all values contained in the HashMap.
        The returned collection is backed by the map. Changes to the collection reflect in the map and vice versa.
        Values can be duplicate or null. */
        System.out.println("values() : " + map.values());

        /* => entrySet() : returns a Set view of all key–value mappings (Map.Entry<K,V>) present in the HashMap.
        Each element is a Map.Entry. The returned set is backed by the map. Changes reflect in both the set and the map. */
        System.out.println("entrySet() : " + map.entrySet());

        // forEach :
        map.forEach((k,v)->{
            System.out.println("Key : " + k + " - Value : " + v);
        });

        /* => clear() removes all key–value mappings from the HashMap.
        After calling clear(), the map becomes empty. Capacity does NOT shrink. Load factor remains unchanged. */
        map.clear();
        System.out.println("After clear() : " + map);
    }
}

/*
=>what is HashMap :
    -> HashMap is a non-synchronized, key–value based implementation of the Map interface in java.util.

    -> Key Characteristics :
        -> Stores data as (key, value) pairs
        -> Keys are unique, values can be duplicate
        -> Allows one null key and multiple null values
        -> Not thread-safe
        -> No insertion order guarantee
        -> Very fast lookup (O(1) average)

    -> HashMap Hierarchy:
        Map
         └── AbstractMap
                  └── HashMap

    -> Implements: Map, Cloneable, Serializable

    -> Internal Data Structure :
        -> Java 8+ HashMap uses:
            Array of buckets
            -> Each bucket contains:
                -> Linked List (default)
                -> Red-Black Tree (when collisions are high)
    -> Capacity & Load Factor :
        -> Initial Capacity	16
        -> Load Factor	0.75

    -> Constructors :
        -> HashMap()
        -> HashMap(int initialCapacity)
        -> HashMap(int initialCapacity, float loadFactor)
        -> HashMap(Map<? extends K, ? extends V> m)
*/