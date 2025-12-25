package collection_framework.MapInterface;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,String> map = new LinkedHashMap<>();

        /* => put() inserts or updates a key–value pair in LinkedHashMap while maintaining order.
        Maintains insertion order (default). Can maintain access order (if enabled).*/
        map.put("karan", "parekh");
        map.put("purn", "gasiya");
        map.put("kirtan", "patadiya");
        map.put("kushal", "soni");
        map.put("krishil", "patadiya");

        /* => putIfAbsent() inserts the key–value pair only if the key is not already mapped (or mapped to null).
        If key absent → inserts value. If key present with non-null value → does nothing.
        If key present with null → inserts value. */
        map.putIfAbsent("aayu","soni");
        System.out.println(map);

        /* => get() : returns the value of the entry in the map which has a specified key. */
        System.out.println("get(\"purn\") : " + map.get("purn"));

        /* => getOrDefault() : returns the value of the entry in the map which has a specified key.
        If the entry does not exist then the value of the second parameter is returned.*/
        System.out.println("getOrDefault(\"kirtan\",\"patadiya\") : " + map.getOrDefault("kirtan","soni"));

        /* => replace() updates the value for a specified key only if the key already exists in the map.
        If key exists → value is replaced. If key does not exist → no change. Does not add new entry. */
        System.out.println(map.replace("karan","soni"));

        /* => remove(Object key) removes the key–value mapping for the specified key if it exists.
        If key exists → entry is removed. If key does not exist → nothing happens. Returns the removed value. */
        System.out.println("remove(\"karan\") : " + map.remove("karan"));

        /* => remove(key, value) removes the entry only if BOTH the key and value match.
        If key exists and value matches → entry removed. If key exists but value doesn’t match → no change.
        If key doesn’t exist → no change. */
        System.out.println("remove(\"kushal\" ,\"soni\") : " + map.remove("kushal" ,"soni"));

        /* => size() : returns the number of entries in a LinkedHashmap.*/
        System.out.println("Size Of LinkedHashMap : " + map.size());
        System.out.println(map);

        /* => isEmpty() checks whether the LinkedHashMap contains zero key–value mappings.
        Returns true → map is empty. Returns false → map has at least one entry. */
        System.out.println("Is Empty : " +  map.isEmpty());

        /* => containsKey() checks whether the map contains a mapping for the specified key.
        Returns true → key exists. Returns false → key does not exist. */
        System.out.println("containsKey(\"purn\") : " + map.containsKey("purn"));

        /* => containsValue() checks whether the map contains at least one mapping with the specified value.
        Returns true → value exists. Returns false → value does not exist. */
        System.out.println("containsValue(\"soni\") : " + map.containsValue("soni"));

        /* => keySet() : returns a set containing all of the keys in the LinkedHashmap. */
        System.out.println("keySet() : " + map.keySet());

        /* => values() : returns a Collection view of all values contained in the LinkedHashMap.
        The returned collection is backed by the map. Changes to the collection reflect in the map and vice versa.
        Values can be duplicate or null. */
        System.out.println("values() : " + map.values());

        /* => entrySet() : returns a Set view of all key–value mappings (Map.Entry<K,V>) present in the LinkedHashMap.
        Each element is a Map.Entry. The returned set is backed by the map. Changes reflect in both the set and the map. */
        System.out.println("entrySet() : " + map.entrySet());

        // forEach :
        map.forEach((k,v)->{
            System.out.println("Key : " + k + " - Value : " + v);
        });

        /* => clear() removes all key–value mappings from the LinkedHashMap.
        Map becomes empty. Insertion/access order list is also cleared. Capacity is not reduced. */
        map.clear();
        System.out.println("After clear() : " + map);
    }
}

/*
=> What is LinkedHashMap in Java? :
    -> LinkedHashMap is a hash table + doubly linked list based implementation of the Map interface.
    -> It extends HashMap and maintains order.
    -> Key Characteristics :
        -> Stores key–value pairs.
        -> Maintains order.
        -> Insertion order (default).
        -> Access order (optional – for LRU cache).
        -> Allows one null key and multiple null values.
        -> Not synchronized.
        -> Slightly slower than HashMap (extra pointers).

    -> Class Hierarchy :
        Map
         └── AbstractMap
                 └── HashMap
                        └── LinkedHashMap

    -> Implements: Map, Cloneable, Serializable

    -> Constructors :
        -> LinkedHashMap()
        -> LinkedHashMap(int initialCapacity)
        -> LinkedHashMap(int initialCapacity, float loadFactor)
        -> LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder)
        -> LinkedHashMap(Map<? extends K, ? extends V> m)
*/
