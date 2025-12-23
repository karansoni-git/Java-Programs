package collection_framework.MapInterface;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        IdentityHashMap<Integer,String> map = new IdentityHashMap<>();
        map.put(10,"Apple");
        map.put(20,"Orange");
        map.put(30,"Apple");
        map.put(40,"Grapes");
        map.put(50,"Avocado");
        System.out.println(map);

        System.out.println("get(40) : " + map.get(40));


        /* => size() : returns the number of entries in a IdentityHashMap.*/
        System.out.println("Size Of IdentityHashMap : " + map.size());

        /* => isEmpty() checks whether the IdentityHashMap contains zero key–value mappings.
        Returns true → map is empty. Returns false → map has at least one entry. */
        System.out.println("Is Empty : " +  map.isEmpty());

        /* => containsKey() checks whether the map contains a mapping for the specified key.
        Returns true → key exists. Returns false → key does not exist. */
        System.out.println("containsKey(60) : " + map.containsKey(60));

        /* => containsValue() : checks whether the map contains at least one mapping with the specified value.
        Returns true → value exists. Returns false → value does not exist. */
        System.out.println("containsValue(\"Orange\") : " + map.containsValue("Orange"));


        /* => keySet() : returns a set containing all of the keys in the IdentityHashmap. */
        System.out.println("keySet() : " + map.keySet());

        /* => values() : returns a Collection view of all values contained in the IdentityHashmap.
        The returned collection is backed by the map. Changes to the collection reflect in the map and vice versa.
        Values can be duplicate or null. */
        System.out.println("values() : " + map.values());

        /* => entrySet() : returns a Set view of all key–value mappings (Map.Entry<K,V>) present in the IdentityHashmap.
        Each element is a Map.Entry. The returned set is backed by the map. Changes reflect in both the set and the map. */
        System.out.println("entrySet() : " + map.entrySet());

        System.out.println("hasCode(10) : " + map.get(10).hashCode());
        System.out.println("hasCode(20) : " + map.get(20).hashCode());
        System.out.println("hasCode(30) : " + map.get(30).hashCode());
        System.out.println("hasCode(40) : " + map.get(40).hashCode());
        System.out.println("hasCode(50) : " + map.get(50).hashCode());

        System.out.println(map.get(10) == map.get(30));

        System.out.println("remove(10) : " + map.remove(10));
        System.out.println(map);

        map.clear();
        System.out.println("After clear() : " + map);
    }
}

/*
=> What is IdentityHashMap?
    -> IdentityHashMap is a special Map implementation in java.util that compares keys (and values) using reference
    equality (==) instead of equals()).

    -> Key Characteristics :
        -> Keys and values are compared using reference equality (==)
        -> Not synchronized
        -> Null keys and null values are allowed
        -> Maintains no predictable order
        -> Faster than HashMap for reference-based equality checks
        -> Useful for canonical mapping or object identity tracking

    -> Class Hierarchy
            Map
             └── AbstractMap
                      └── IdentityHashMap

    -> Implements: Map, Serializable

    -> Internal Data Structure (VERY IMPORTANT) :
        -> Not a hash table in the standard sense
        -> Uses open-addressing array instead of chaining

    -> Constructors :
        -> IdentityHashMap()
        -> IdentityHashMap(int expectedMaxSize)
        -> IdentityHashMap(Map<? extends K, ? extends V> m)

        -> expectedMaxSize helps pre-size internal array
        -> Default load factor = 2/3
        -> Resizes array when threshold exceeded

*/
