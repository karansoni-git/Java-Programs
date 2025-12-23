package collection_framework.MapInterface;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapsDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Apple",1000 );
        map.put("Samsung", 899);
        map.put("Realme", 200);
        map.put("Oppo", 170);
        map.put("Vivo", 120);
        System.out.println("HashMap : " + map);

        // Collections.unmodifiableMap()
        Map<String,Integer> unmodifiableMap = Collections.unmodifiableMap(map);
        System.out.println("unmodifiableMap : " + unmodifiableMap);

        System.out.println(map.remove("Vivo"));
        System.out.println("unmodifiableMap : " + unmodifiableMap);

        // Map.of()
        Map<String,Integer> map2 = Map.of("karan",21,"krish",22,"dhruvil",19,"vedant",20);
        System.out.println("Map.of(" + map2 +")");
//        map2.put("vatsal",23); // throws UnsupportedOperationException.

        // Map.ofEntries()
        Map.Entry<Integer,String> m1 = Map.entry(1,"A");
        Map.Entry<Integer,String> m2 = Map.entry(2,"B");
        Map.Entry<Integer,String> m3 = Map.entry(3,"B");
        Map<Integer,String>  map3 = Map.ofEntries(m1,m2,m3);
        System.out.println("Map.ofEntries(" + map3+ ")");

        Map<String,String>  map4 = Map.ofEntries(Map.entry("kk","Labon ko"), Map.entry("pritam","tum jo aye"));
        System.out.println("Map.ofEntries(" + map4 + ")");


    }
}

/*
=> What are Immutable Maps in Java?
    -> An immutable Map is a Map whose contents cannot be modified after creation.
    -> No put()
    -> No remove()
    -> No clear()
    -> Thread-safe by design
    -> Safe for sharing across threads

    -> Ways to Create Immutable Maps in Java :
        Java provides three main mechanisms :
            -> Map.of() / Map.ofEntries() (Java 9+)
            -> Map.copyOf() (Java 10+)
            -> Collections.unmodifiableMap() (Legacy wrapper)

------------------------------------------------------------------------------------------------------------------------------------------------------------------------

1) What is Collections.unmodifiableMap()? :
    -> Collections.unmodifiableMap(Map<? extends K, ? extends V> m)
    -> It returns a read-only (unmodifiable) view of the given Map.
    -> Important: This is NOT a truly immutable map — it is a wrapper around the original map.

    -> Key Characteristics :
        -> Prevents structural modifications via the returned reference
        -> Backed by the original map
        -> Changes to the original map are reflected in the unmodifiable view
        -> Allows null keys and values if the underlying map allows them
        -> Not thread-safe by itself

    -> Methods Supported vs Blocked :
        -> Allowed (Read-Only)
            get() | containsKey() | containsValue() | size() | isEmpty() | keySet() (returns unmodifiable set) | values() (returns unmodifiable collection)
            entrySet() (entries are immutable)
        -> Blocked (Throws UnsupportedOperationException)
            put() |remove() |clear() |putAll() |replace() | compute() | merge()


2) What is Map.of() in Java? :
    -> Map.of() is a factory method introduced in Java 9 to create immutable (unmodifiable) maps.
    -> Key Characteristics :
        -> Returns a truly immutable Map
        -> No modification allowed after creation
        -> No null keys or null values
        -> Thread-safe by design
        -> Maintains iteration order (unspecified but stable)
        -> Very memory efficient

    -> All Map.of() Overloads
        Empty Map
            -> Map.of()
        1 to 10 Entries
            -> Map.of(k1, v1)
            -> Map.of(k1, v1, k2, v2)
            -> Map.of(k1, v1, k2, v2, k3, v3)
            -> ...
            -> Map.of(k1, v1, ..., k10, v10)
        Note Important : Maximum 10 key-value pairs limitation

    -> How Map.of() Works Internally :
        Step-by-Step
            -> Null check
            -> If any key/value is null → NullPointerException
            -> Duplicate key check
            -> If duplicate key → IllegalArgumentException
            -> Store entries in compact arrays
            -> Open-addressing lookup
            -> Return immutable implementation

    -> All modifying methods throw: UnsupportedOperationException

    -> Blocked methods:
        put() | remove() | clear() | putAll() | replace() | compute() | merge()

    -> Supported Read Methods :
        get() | containsKey() | containsValue() | size() | isEmpty() | keySet() | values() | entrySet() | forEach()


3) What is Map.ofEntries()? :
    -> Map.ofEntries() is a factory method introduced in Java 9 to create immutable (unmodifiable) maps with any number of entries.
    -> syntax : Map<K, V> map = Map.ofEntries(
        Map.entry(k1, v1),
        Map.entry(k2, v2),
        ...
        );

    -> Key Characteristics :
        -> Returns a truly immutable Map
        -> No limit on number of entries
        -> No null keys or null values
        -> Thread-safe by design
        -> More flexible than Map.of()
        -> Very memory-efficient

    -> How Map.ofEntries() Works Internally
        ->Step-by-Step
            1. Accepts varargs of Map.Entry
            2. Null check on:
                Entry itself
                Entry key
                Entry value
            3. Duplicate key detection
                Uses equals()
                Duplicate → IllegalArgumentException
            4. Stores keys and values in compact arrays
            5. Uses open-addressing lookup
            6. Returns immutable MapN instance

    -> All modifying methods throw: UnsupportedOperationException

    -> Blocked methods :
        put() | remove() | clear() | putAll() | replace() | compute() | merge()
    -> Supported Read-Only Methods :
        get() |containsKey() |containsValue() | size() | isEmpty() | keySet() | values() | entrySet() | forEach()
*/
