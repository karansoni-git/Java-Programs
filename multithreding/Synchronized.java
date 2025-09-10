/*
=> synchronized in Java :
-> In multithreading, when multiple threads try to access shared resources (like variables, objects, files, DB),
there is a risk of data inconsistency (race condition).
-> To prevent this, Java provides the synchronized keyword, which ensures only one thread can access a block or method at a time.

=> What is Synchronization ?
-> Synchronization = controlling access to shared resources.
-> Achieved using locks/monitors.
-> Every Java object has a monitor lock (aka intrinsic lock).
-> A thread must acquire this lock before entering a synchronized method/block.

=> Types of Synchronization
1. Synchronized Instance Method
-> Lock is on the current object (this).
-> Only one thread per object can execute a synchronized instance method at a time.

2. Synchronized Static Method
-> Lock is on the class object (Class-level lock).
-> Only one thread can execute synchronized static methods of a class at a time.

3. Synchronized Block :
-> Used when we don’t want to lock the entire method, only critical section.
-> Lock can be placed on:
    1. this (current object)
    2. any custom object
    3. class object (ClassName.class)
 */

package class_and_object.multithreding;

public class Synchronized {
    private int count = 0;

    public void increment() {
        //this is the synchronized block
        synchronized (this){
        count++;
        }
    }

    public int getCount() {
        return count;
    }
}
