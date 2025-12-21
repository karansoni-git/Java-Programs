package collection_framework.ListInterface;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        /*------------------------------------------ Stack Specific Methods ---------------------------------------------*/
        /* => push(E item) : Pushes an element onto the stack (adds to top).*/
        stack.push(93);
        stack.push(101);
        stack.push(82);
        stack.push(282);
        stack.push(128);
        stack.push(923);
        stack.push(82);
        stack.push(18);
        System.out.println("Bottom-> " + stack + " <-Top");

        /* => pop() : Removes and returns the element at the top. Throws EmptyStackException if empty.*/
        System.out.println("pop() -> Removed Element From Top Is : " + stack.pop());

        /* => peek() : Returns the element at the top without removing it. Throws EmptyStackException if empty.*/
        System.out.println("peek() : " + stack.peek());

        /* => empty() : Returns true if the stack is empty. */
        System.out.println("Is Stack Empty : " + stack.empty());

        /* => search(Object o) : searches for an element in the stack and returns its 1-based position from the top of the stack.
        What it Does : Searches element from top to bottom , Returns position starting from 1 , Returns -1 if element is not found.
        Returns position, not index. */

        /*----------------------------------- Inherited Methods from Vector ---------------------------------------------  */
        /* => add(E e) : adds an element at the end of the stack.
           => add(int index, E e) : inserts an element at the specified index in the stack. This method breaks stack (LIFO) discipline and
           is not recommended for pure stack operations. */
        stack.add(123);
        stack.add(2,56);

        /* => get(int index) : returns the element at the specified index in the stack without removing it.
        This method allows random access, so it breaks pure stack (LIFO) behavior. */
        System.out.println("get(3) : " + stack.get(3));

        /* => elementAt(int index) : returns the element at the specified index without removing it.
        It is an older (legacy) method from Vector.*/
        System.out.println("elementAt(5) : " + stack.elementAt(5));

        /* => firstElement() : returns the first (bottom-most) element of the stack without removing it.
        This method breaks stack (LIFO) abstraction and comes from Vector.*/
        System.out.println("First Element : " + stack.firstElement());

        /* => lastElement() : returns the last element of the stack (i.e. the top element) without removing it.
        This method comes from Vector.*/
        System.out.println("Last Element : " + stack.lastElement());

        /* => contains(Object o) : checks whether the specified element is present in the stack.
        This method is not stack-specific and comes from Vector.*/
        System.out.println("contains(56) : " + stack.contains(56));

        /* => indexOf(Object o) : returns the index of the first occurrence of the specified element in the stack.
        This method is not stack-specific and comes from Vector.*/
        System.out.println("indexOf(282) : " + stack.indexOf(282));

        /* => lastIndexOf(Object o) : returns the index of the last occurrence of the specified element in the stack.
        This method is not stack-specific and comes from Vector.*/
        System.out.println("lastIndexOf(82) : " + stack.lastIndexOf(82));

        /* => size() : returns the number of elements currently present in the stack.*/
        System.out.println("Size Of Stack : " + stack.size());

        /* => capacity() : returns the current capacity of the stack, i.e. how many elements it can hold before resizing.*/
        System.out.println("Stack capacity : " + stack.capacity());

        /* => isEmpty() : checks whether the stack contains zero elements.*/
        System.out.println("Is Empty : " + stack.isEmpty());

        System.out.println("Bottom-> " + stack + " <-Top");

        /* => clear() : removes all elements from the stack. After calling this method, the stack becomes empty, but its capacity remains unchanged.*/
        stack.clear();
        System.out.println("After clear() method : " + stack);
    }
}

/*
=> What is Stack in Java?
    -> Stack is a legacy class in Java (java.util) that represents a last-in-first-out (LIFO) data structure.
    -> Every operation affects the top of the stack.
    -> Extends the Vector class, so it inherits all Vector methods.

    -> Key Features :
        -> Stores elements in dynamic array (via Vector)
        -> Thread-safe (synchronized methods inherited from Vector)
        -> Supports push, pop, peek operations
        -> Maintains insertion order
        -> Allows duplicate elements

    -> Internal Working :
        -> Internally, Stack uses a dynamic array (Object[] elementData) from Vector.
        -> size tracks the number of elements.
        -> Operations happen at the end of the array (top of the stack).
        -> push → add element at end
        -> pop → remove element from end
        -> peek → read element at end

    ->Constructors :
        -> Stack()	Default empty stack
        -> Stack(Collection<? extends E> c)	Create stack from another collection
*/