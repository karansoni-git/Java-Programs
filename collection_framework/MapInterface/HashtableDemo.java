package collection_framework.MapInterface;

import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<String,String> table = new Hashtable<>();

        /* => put(K key, V value) :	Inserts key-value pair (no nulls allowed).
           => putIfAbsent(K key, V value) :	Inserts only if key absent.
           => putAll(Map<? extends K, ? extends V> m) :	Copies all mappings.*/
        table.put("karan","gondal");
        table.put("kushal","mumbai");
        table.put("kirtan","rajkot");
        table.put("purn","anand");
        table.put("aayu","junagadh");
        table.putIfAbsent("krishil","pune");

        System.out.println("Hashtable : " + table);

        /* => replace(K key, V value) : method is used to replace the value of an existing key in a Hashtable. */
        System.out.println("replace(\"aayu\",\"anjar\") : " + table.replace("aayu","anjar"));
        System.out.println("replace(\"aayu\",\"anjar\",\"rapar\") : " + table.replace("aayu","anjar","rapar"));

        /* => get(Object key) : method is used to retrieve the value associated with a specified key in a Hashtable.*/
        System.out.println("get(\"karan\") : " + table.get("karan"));

        /* => getOrDefault() : method is used to return the value mapped to a key, and if the key is not present,
        it returns a default value instead of null.*/
        System.out.println("getOrDefault(\"sanjay\",\"gondal\") : " + table.getOrDefault("sanjay","gondal"));

        /* => remove(Object key) : method is used to delete a key–value pair from a Hashtable based on the specified key.*/
        System.out.println("remove(\"aayu\") : " + table.remove("aayu"));

        /* => remove(Object key, Object value) : method is used to remove an entry only if BOTH the key and value match.*/
        System.out.println("remove(\"karan\",\"gondal\") : " + table.remove("karan","gondal"));

        System.out.println("Hashtable : " + table);

        /* => size() : returns the number of entries in a Hashtable.*/
        System.out.println("Size Of Hashtable : " + table.size());

        /* => isEmpty() checks whether the Hashtable contains zero key–value mappings.
        Returns true → map is empty. Returns false → map has at least one entry. */
        System.out.println("Is Empty : " + table.isEmpty());

        /* => containsKey() checks whether the Hashtable contains a mapping for the specified key.
        Returns true → key exists. Returns false → key does not exist. */
        System.out.println("containsKey(\"purn\") : " + table.containsKey("purn"));

        /* => containsValue() checks whether the Hashtable contains at least one mapping with the specified value.
        Returns true → value exists. Returns false → value does not exist. */
        System.out.println("containsValue(\"mumbai\") : " +table.containsValue("mumbai"));

        /* => keySet() : returns a set containing all of the keys in the Hashtable. */
        System.out.println("keySet() : " + table.keySet());

        /* => values() : returns a Collection view of all values contained in the Hashtable.
        The returned collection is backed by the map. Changes to the collection reflect in the map and vice versa.
        Values can be duplicate or null. */
        System.out.println("values() : " + table.values());

        /* => entrySet() : returns a Set view of all key–value mappings (Map.Entry<K,V>) present in the Hashtable.
        Each element is a Map.Entry. The returned set is backed by the map. Changes reflect in both the set and the map. */
        System.out.println("entrySet() : " + table.entrySet());
        
        /* => clear() : method is used to remove ALL key–value mappings from a Hashtable.*/
        table.clear();
        System.out.println("After clear() : " + table);
    }
}

/*
=> What is Hashtable in Java?
    ->Hashtable is a legacy, synchronized, key–value based implementation of the Map interface in java.util.

    -> Key Characteristics :
        -> Stores key–value pairs
        -> Thread-safe (every public method is synchronized)
        -> No null key and no null value allowed
        -> Maintains no insertion order
        -> Slower than HashMap due to synchronization
        -> Introduced in JDK 1.0

    -> Class Hierarchy :
            Map
             └── Dictionary (abstract - legacy)
                      └── Hashtable

    -> Implements: Map, Cloneable, Serializable

    -> Internal Data Structure
        Hashtable internally uses:
            -> Array of buckets
            -> Each bucket contains a linked list of entries

    -> Constructors :
        -> Hashtable()
        -> Hashtable(int initialCapacity)
        -> Hashtable(int initialCapacity, float loadFactor)
        -> Hashtable(Map<? extends K, ? extends V> t)

    -> Defaults:
            Property	            Value
            Initial Capacity	      11
            Load Factor	             0.75
*/