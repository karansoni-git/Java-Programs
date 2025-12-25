package collection_framework.MapInterface;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        NavigableMap<String,Integer> map = new TreeMap<>();
        map.put("ironman",32);
        map.put("hulk",38);
        map.put("thor",26);
        map.put("antman",30);
        map.put("spiderman",20);
        map.putIfAbsent("loki",29);
        System.out.println("TreeMap : " + map);

        System.out.println("replace(\"loki\",33) : " + map.replace("loki",33));

        System.out.println("get(\"ironman\") : " + map.get("ironman"));
        System.out.println("getOrDefault(\"howkeye\",38) : " + map.getOrDefault("howkeye",38));

        System.out.println("remove(\"antman\") : " + map.remove("antman"));

        System.out.println("containsKey(\"thor\") : " + map.containsKey("thor"));
        System.out.println("containsValue(35) : " + map.containsValue(35));
        System.out.println("Is Empty : " + map.isEmpty());
        System.out.println("Size Of TreeMap : " + map.size());
        System.out.println("TreeMap : " + map);

        /* SortedMap Methods : */
        /* => firstKey() : is used to retrieve the smallest (lowest) key currently present in a TreeMap,
        according to its natural ordering or the custom Comparator.*/
        System.out.println("firstKey() : " + map.firstKey());

        /* => lastKey() : is used to retrieve the largest (highest) key currently present in a TreeMap,
        according to its natural ordering or the custom Comparator.*/
        System.out.println("lastKey() : " + map.lastKey());

        /* => headMap(K toKey) : method is used to get a view of the map whose keys are strictly less than toKey.*/
        System.out.println("headMap(\"ironman\") : " + map.headMap("ironman"));

        /* => tailMap(K fromKey) : is used to get a view of the map whose keys are greater than or equal to fromKey.*/
        System.out.println("tailMap(\"ironman\") : " + map.tailMap("ironman"));

        /* => subMap() : is used to get a view of the TreeMap whose keys lie within a specified range.*/
        System.out.println("subMap(\"antman\",\"spiderman(exclude)\") : " + map.subMap("antman","spiderman"));

        /* NavigableMap Methods : */
        System.out.println(map);

        /* => lowerKey(K key) : Returns the greatest key strictly less than the given key, or null if there is no such key.*/
        System.out.println("lowerKey(\"spiderman\") : " + map.lowerKey("spiderman"));

        /* => lowerEntry(K key) : Returns a key-value mapping associated with the greatest key strictly less than the given key,
        or null if there is no such key.*/
        System.out.println("lowerEntry(\"spiderman\") : " + map.lowerEntry("spiderman"));

        /* => higherKey(K key) : Returns the least key strictly greater than the given key, or null if there is no such key.*/
        System.out.println("higherKey(\"loki\") : " + map.higherKey("loki"));

        /* => The higherEntry(K key) : Returns a key-value mapping associated with the least key strictly greater than the given
        key, or null if there is no such key.*/
        System.out.println("higherEntry(\"loki\") : " + map.higherEntry("loki"));

        /* => floorKey(K key) : Returns the greatest key less than or equal to the given key, or null if there is no such key.*/
        System.out.println("floorKey(\"loki\") : " + map.floorKey("loki"));

        /* => The floorEntry(K key) : Returns a key-value mapping associated with the greatest key less than or equal to the
        given key, or null if there is no such key.*/
        System.out.println("floorEntry(\"loki\") : " + map.floorEntry("loki"));

        /* => ceilingKey(K key) : Returns the least key greater than or equal to the given key, or null if there is no such key.*/
        System.out.println("ceilingKey(\"hulk\") : " + map.ceilingKey("hulk"));

        /* => ceilingEntry(K key) : Returns a key-value mapping associated with the least key greater than or equal to the
        given key, or null if there is no such key.*/
        System.out.println("ceilingEntry(\"hulk\") : " + map.ceilingEntry("hulk"));

        /* => firstEntry() : is used to get the entry (key + value) with the smallest key in a TreeMap. */
        System.out.println("firstEntry() : " + map.firstEntry());

        /* => lastEntry() : is used to get the entry (key + value) with the largest key in a TreeMap. */
        System.out.println("lastEntry() : " + map.lastEntry());

        /* => pollFirstEntry() : is used to retrieve AND remove the entry (key + value) with the smallest key from a TreeMap.*/
//        System.out.println("pollFirstEntry() : " + map.pollFirstEntry());

        /* => pollLastEntry() : is used to retrieve AND remove the entry (key + value) with the largest key from a TreeMap.*/
//        System.out.println("pollLastEntry() : " +map.pollLastEntry());

        System.out.println("TreeMap : " + map);

        /* => descendingMap() : is used to get a reverse-order (descending) view of the TreeMap.*/
        System.out.println("descendingMap() : " + map.descendingMap());

        /* => navigableKeySet() : is used to get a NavigableSet view of all keys in the TreeMap, sorted according
        to the map’s ordering.*/
        System.out.println("navigableKeySet() : " + map.navigableKeySet());

        /* => descendingKeySet() : is used to get a reverse-order (descending) NavigableSet view of all keys present in a TreeMap.*/
        System.out.println("descendingKeySet() : " + map.descendingKeySet());

        /* => keySet() : is used to get a Set view of all keys present in the TreeMap, sorted in ascending order.*/
        System.out.println("keySet() : " + map.keySet());

        /* => values() : is used to get a Collection view of all values present in the TreeMap.*/
        System.out.println("values() : " + map.values());

        /* => entrySet() : is used to get a Set view of all key-value mappings (Map.Entry objects) present in the TreeMap.*/
        System.out.println("entrySet() : " + map.entrySet());

        System.out.println("TreeMap : " + map);
    }

}
/*
=>  what is SortedMap? :
    -> SortedMap is an interface that extends map interface and guarantees that the entries are sorted based on the keys, either in
    their natural ordering or by a specified comparator.

=> TreeMap is a sorted Map implementation in java.util that stores key–value pairs in sorted order.
    -> Key Characteristics :
        -> Stores data in sorted order of keys.
        -> Sorting is natural ordering or via Comparator.
        -> Not synchronized.
        -> Does not allow null keys (Java 8+).
        -> Allows multiple null values.
        -> Based on Red-Black Tree.
        -> Guarantees log(n) time complexity.

    -> Class Hierarchy :
            Map
             └── SortedMap (interface)
                     └── NavigableMap (interface)
                               └── TreeMap

    -> Implements: NavigableMap, Cloneable, Serializable

    -> Internal Data Structure (MOST IMPORTANT) :
        -> TreeMap uses a Red-Black Tree.
        -> A Red-Black Tree is a self-balancing binary search tree with:
        -> Each node colored RED or BLACK.
        -> Root is always BLACK.
        -> No two consecutive RED nodes.
        -> Every path from root to leaf has same number of BLACK nodes.
        -> Ensures tree height ≈ log(n).

    -> Constructors :
        -> TreeMap()
        -> TreeMap(Comparator<? super K> comparator)
        -> TreeMap(Map<? extends K, ? extends V> m)
        -> TreeMap(SortedMap<K, ? extends V> m)

*/
