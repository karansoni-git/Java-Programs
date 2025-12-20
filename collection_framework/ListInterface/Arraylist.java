/*
=> ArrayList is a resizable array implementation of the List interface in Java.
It is present in the package: import java.util.ArrayList;
=> Why ArrayList?
    -> Dynamic size (grows/shrinks automatically)
    -> Fast access (O(1) time for get)
    -> Maintains insertion order
    -> Can store duplicate values
    -> Allows null values
    -> Provides many built-in methods for data manipulation

=> Internal Working (Important for Interviews)
    -> Internally uses a dynamic array (Object[] elementData)
    -> Default capacity = 10
    -> When full → grows by formula:
    -> newCapacity = oldCapacity + (oldCapacity >> 1)
    -> Means 1.5x growth
    -> All elements are shifted during insert/remove (slow for large lists)
*/

package collection_framework.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // intial capacity = 10

        System.out.println("Size Before Adding Elements : " + list.size());

        /*  => add(E element) : Adds element at the end.
            => add(int index, E element) : Adds element at specific index.
            => addAll(Collection<? extends E> c) : Adds all elements of another collection.
            => addAll(int index, Collection<? extends E> c) : Adds all elements starting from given index. */
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(14);


        /* => size() : method returns the number of elements currently present in the ArrayList.
           -> Returns an int representing the list size
           -> It tells how many elements are stored, not the capacity. */
        System.out.println("Size After Adding Elements : "+list.size());

        /* => get(int index) : Returns the element present at a specific index in the ArrayList. */
        System.out.println("First Element - list(0) : " + list.get(0));
        System.out.println("Third Element - list(2) : " + list.get(2));

        /* => set(int index, E element) : this method is used to replace an element at a specific index in an ArrayList.
        set() returns the previous (old) element that was stored at the given index. */
        list.set(2,30);

        //we can print all ArrayList elements by just printing ArrayList variable name.
        System.out.println(list);

        /* => remove(int index) : Removes the element at a specific index.
                -> Removes element at given index -> Shifts remaining elements left -> Returns the removed element
           => remove(Object o) : Removes the first occurrence of a given element.
                ->Searches the list ->Removes only the first match
                ->Returns: ->true → if element was removed ->false → if element not found
           =>removeAll() (Bonus Info) : Removes all matching elements.  */
        list.remove(2);
        System.out.println(list);

        /* => indexOf() : method returns the index of the first occurrence of a given element in the ArrayList. return -1 if not found */
        System.out.println("index of 14 : " + list.indexOf(14));

        /* => lastIndexOf() :  returns the index of the last occurrence of an element in the ArrayList. return -1 if element not found */
        System.out.println("index of 14 from end : " + list.lastIndexOf(14));

        /* => contains() : method checks whether a given element is present in the ArrayList. return in true or false. */
        System.out.println("contain(12) : " + list.contains(12));
        System.out.println("contain(25) : " + list.contains(25));


        //looping through all elements in ArrayList using for loop:
        System.out.println("for loop : ");
        for (int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

        //looping through all elements in ArrayList using forEach loop:
        System.out.println("\nforEach loop : ");
        for (int x : list){
            System.out.print(x + " ");
        }
        System.out.println();

        /* =>  isEmpty() : method checks whether the ArrayList contains zero elements. */
        System.out.println("isEmpty() : " + list.isEmpty());

        /* => clear() : Removes all elements from the ArrayList. */
        list.clear();
        System.out.println(list);

        System.out.println("isEmpty() : " + list.isEmpty());
    }
}


/*
=> Internal Working of ArrayList
-> Initial Capacity (default):
    -> new ArrayList<>();  // capacity = 10
-> How ArrayList stores data?
    ->Internally uses a Object[] array.
    ->When array becomes full and you insert a new item → it grows by 1.5x (50% expansion).
-> Resize logic (Java 8):
    -> newCapacity = oldCapacity + (oldCapacity >> 1)
-> Example:
    -> Old = 10 → New = 15
    -> Old = 15 → New = 22

-> Constructors
    | Constructor               | Description                   |
    | ------------------------- | ----------------------------- |
    | `ArrayList()`             | default capacity = 10         |
    | `ArrayList(int capacity)` | custom initial capacity       |
    | `ArrayList(Collection c)` | copies elements of collection |

 */