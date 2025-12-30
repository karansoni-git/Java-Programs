package collection_framework.SetInterface;

import java.util.EnumSet;

public class EnumSetDemo {
    public static void main(String[] args) {
        EnumSet<Days> set = EnumSet.of(Days.MONDAY,Days.TUESDAY,Days.WEDNESDAY,Days.THURSDAY,Days.FRIDAY,Days.SATURDAY);
        System.out.println(set);
        System.out.println("remove(Days.MONDAY) : " + set.remove(Days.MONDAY));
        System.out.println(set);
        System.out.println("contains(Days.MONDAY) : " + set.contains(Days.MONDAY));
        System.out.println("isEmpty() : " + set.isEmpty());
        System.out.println("size() : " + set.size());

        for (Days d : set){
            System.out.println(d);
        }
        set.clear();
        System.out.println(set);

    }
}

enum Days {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

/*
=> What is EnumSet?

    -> EnumSet is a high-performance Set implementation specifically for enum types.

    -> syntax : public abstract class EnumSet<E extends Enum<E>>
                extends AbstractSet<E>
                implements Cloneable, Serializable

    -> Key Characteristics :
        -> Stores only enum constants
        -> No duplicates
        -> Extremely fast and memory-efficient
        -> Maintains natural order of enum declaration
        -> No null elements
        -> Not thread-safe

    -> Class Hierarchy :
            Collection
                └── Set
                     └── AbstractSet
                              └── EnumSet
*/