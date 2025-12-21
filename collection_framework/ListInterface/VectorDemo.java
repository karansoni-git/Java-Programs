package collection_framework.ListInterface;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        /* => add(E e) : Adds element at end. | => add(int index, E e) : Inserts at index.
           => addAll(Collection c) : Adds all elements. | => addAll(int index, Collection c) : Inserts collection.
           => addElement(E obj) : Legacy add method. | => insertElementAt(E obj, int index) : Inserts element.
           => setElementAt(E obj, int index) : Replaces element. | => set(int index, E e) : Replaces element. */
        v.add(101);
        v.add(2);
        v.add(1,56);
        v.addElement(12);
        v.insertElementAt(12,2);
        v.setElementAt(20,2);
        v.set(2,200);
        System.out.println(v);

        /* => remove(int index) : Removes element at index | => removeElementAt(int index) : Removes element at index.
           => remove(Object o) : Removes first occurrence | => removeElement(Object obj) : Removes element.
           => removeAll(Collection c) : Removes all matching | => removeAllElements() : Clears vector. */
        System.out.println("Removed Element : " + v.remove(2));
//        list.removeAllElements(); //Removes all elements from from vector
        System.out.println(v);

        /* => get(int index) : returns the element at the specified index in the Vector.
        Uses 0-based indexing. Throws exception for invalid index*/
        System.out.println("Element at index 2 : " + v.get(1));

        /* => elementAt(int index) returns the element at the specified index in the Vector.
        It is an older (legacy) method, present before the Java Collections Framework.*/
        System.out.println("Element at index 3 : " + v.elementAt(3));

        /* => firstElement() : returns the first element (index 0) of the Vector without removing it.
        It is a legacy method, mainly kept for backward compatibility.*/
        System.out.println("First Element : " + v.firstElement());

        /* => lastElement() returns the last element of the Vector without removing it.
        It is a legacy method, mainly kept for backward compatibility. */
        System.out.println("Last Element : " + v.lastElement());

        /* => contains(Object o) : checks whether the specified object exists in the Vector.
        Returns true → if the element is found.Returns false → if the element is NOT found
        Comparison is done using equals(). */
        System.out.println("contains(101) : " + v.contains(101));

        /* => indexOf(Object o) : returns the index of the first occurrence of the specified element in the Vector.
         Returns 0-based index of the element.Returns -1 if element is not found
         Comparison is done using equals().
         => indexOf(Object o, int index) : returns the index of the first occurrence of the specified element starting
         the search from the given index. */
        System.out.println("indexOf(56) : " + v.indexOf(56));
        System.out.println("indexOf(56,2) : " + v.indexOf(56,2));

        /* => lastIndexOf(Object o) : returns the index of the last occurrence of the specified element in the Vector.
        Returns 0-based index of the last match.Returns -1 if element is not found.Uses equals() for comparison
        => lastIndexOf(Object o, int index) returns the index of the last occurrence of the specified element searching
        backward starting from the given index. */
        System.out.println("lastIndexOf() : " + v.lastIndexOf(2));

        /* => size() : returns the number of elements currently stored in the Vector.
        Returns total count of elements. Does NOT traverse the Vector. Thread-safe (synchronized). */
        System.out.println("Size Of Vector : " + v.size());

        /* => capacity() : returns the current capacity of the Vector,
        i.e. how many elements it can store without resizing.
        Returns the length of the internal array. Different from size(). */
        System.out.println("Vector Internal Array Capacity : " + v.capacity());

        /* => isEmpty() : checks whether the Vector has zero elements.
        Returns true → if Vector has no elements.
        Returns false → if Vector has one or more elements. */
        System.out.println("Is Vector Empty : " + v.isEmpty());

        /* => ensureCapacity(int minCapacity) : increases the capacity of the Vector if needed,
        so it can hold at least minCapacity elements without resizing.
        Checks current capacity,If current capacity < minCapacity → increases capacity,If capacity ≥ minCapacity → does nothing. */
        v.ensureCapacity(12);

        /* => trimToSize() : reduces the capacity of the Vector so that it becomes exactly equal to its current size.
        It frees unused memory.
        Shrinks internal array size,Removes unused capacity,Does NOT remove elements. */
        v.trimToSize();

        /* => sort(Comparator<? super E> c) sorts the elements of the Vector according to the order induced by the provided Comparator.
        Introduced in Java 8.
        Sorts in-place (modifies the existing Vector). */
        v.sort((a,b)->a-b);
        System.out.println(v);

        System.out.println();

        /* => clear() : Clears vector. */
        v.clear();

        System.out.println(v);
    }
}


/*
=> What is Vector in Java?
    -> Vector is a legacy, synchronized, resizable array implementation of the List interface.
    It is part of the java.util package and was introduced in JDK 1.0.

    -> ✔ Key Characteristics
        -> Implements dynamic array like ArrayList
        -> Thread-safe (all methods are synchronized)
        -> Maintains insertion order
        -> Allows duplicate elements
        -> Slower than ArrayList due to synchronization
        -> Considered legacy (but not deprecated)

    -> Implements: List, RandomAccess, Cloneable, Serializable
    -> Just like ArrayList, Vector uses an Object[] array internally.

    -> Capacity Growth Logic :
        -> Default behavior: Initial capacity = 10, When full → capacity doubles (×2)

     -> Constructors :
        -> Vector()
        -> Vector(int initialCapacity)
        -> Vector(int initialCapacity, int capacityIncrement)
        -> Vector(Collection<? extends E> c)
*/