package collection_framework.MapInterface;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        Map<Days,String> map = new EnumMap<>(Days.class);
        map.put(Days.SATURDAY,"Leg");
        map.put(Days.WEDNESDAY,"Shoulder");
        map.putIfAbsent(Days.SUNDAY,"Rest");
        map.put(Days.TUESDAY,"Back");
        map.put(Days.THURSDAY,"Bicep");
        map.put(Days.MONDAY,"Chest");
        map.put(Days.FRIDAY,"Tricep");
        System.out.println("EnumMap : " + map);

        System.out.println("replace(Days.MONDAY , \"Chest & Triceps\") : " + map.replace(Days.MONDAY , "Chest & Triceps"));

        System.out.println("get(Days.MONDAY) : " + map.get(Days.MONDAY));
        System.out.println("getOrDefault(Days.SUNDAY,\"Aram\") : " + map.getOrDefault(Days.SUNDAY,"Aram"));
        System.out.println("remove(Days.SUNDAY) : " + map.remove(Days.SUNDAY));
        System.out.println("EnumMap : " + map);

        System.out.println("containsKey(Days.WEDNESDAY) : " + map.containsKey(Days.WEDNESDAY));
        System.out.println("containsValue(\"Bicep\") : " + map.containsValue("Bicep"));
        System.out.println("isEmpty() : " + map.isEmpty());
        System.out.println("size() : "+ map.size());

        System.out.println("keySet() : " + map.keySet());
        System.out.println("values() : " + map.values());
        System.out.println("entrySet() : " + map.entrySet());

        System.out.println(map.get(Days.MONDAY).hashCode());
        System.out.println(map.get(Days.TUESDAY).hashCode());

        map.clear();
        System.out.println("After clear() : " + map);

    }
}

enum Days{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
}


/*
=> EnumMap is a specialized Map implementation for enum keys in java.util.
    -> Keys must be of an enum type
    -> Values can be of any type
    -> Maintains natural order of enum constants (order of declaration)
    -> Very fast and memory-efficient

    -> Key Characteristics :
        -> Only enum keys allowed
        -> Values can be null
        -> Maintains order of enum constants
        -> Not synchronized
        -> Backed by array internally
        -> Extremely fast (O(1) operations)

    -> Class Hierarchy :
            Map
             └── AbstractMap
                      └── EnumMap

    -> Implements: Map, Cloneable, Serializable

    -> Internal Data Structure :
        -> Array-based implementation
        -> Size of internal array = number of enum constants
        -> Enum constants are mapped to ordinal indices
        -> No hashing required → constant-time access

    -> Constructors :
        -> EnumMap(Class<K> keyType)
        -> EnumMap(EnumMap<K, ? extends V> m)
        -> EnumMap(Map<K, ? extends V> m)

    -> How EnumMap Works Internally :
        -> Enum key → key.ordinal() → array index
        -> Put value at values[index]
        -> Keep track of size and presence
        -> Iteration → follow enum declaration order
*/
