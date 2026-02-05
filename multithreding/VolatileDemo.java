package class_and_object.multithreding;

public class VolatileDemo {
    public static void main(String[] args) throws InterruptedException {
        resource r = new resource();
        Thread writer = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            r.setFlagTrue();
        });
        Thread reader = new Thread(() -> {
            try {
                r.isFlagTrue();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        writer.start();
        reader.start();
    }
}

class resource {
    private volatile boolean flag = false;

    public void setFlagTrue() {
        flag = true;
        System.out.println("Writer Thread Set Flag True");
    }

    public void isFlagTrue() throws InterruptedException {
        while (!flag) {
            // do nothing.
        }
        Thread.sleep(1000);
        System.out.println("Flag Is Now True");
    }
}

/*
=> Normal Thread Caching (WITHOUT volatile) :
    -> What actually happens? :
        -> Each CPU core has its own cache (L1/L2).
        -> Threads run on CPU cores, not directly on RAM.
        -> When a thread reads a variable:
            -> Value is copied from Main Memory → CPU Cache
        -> When a thread writes:
            -> It may update only its cache, not main memory immediately

    -> Problem:
        -> Other threads may not see the updated value.

    -> What volatile REALLY DOES :
        -> volatile does NOT lock
        -> volatile does NOT make code atomic
        -> volatile controls visibility and ordering

        -> Two guarantees provided by volatile :
            -> Visibility Guarantee
            -> Memory Ordering (No Reordering)

    -> How Caching Works WITH volatile :
        -> When a thread WRITES to a volatile variable
        -> Internally:
            -> Value is written directly to Main Memory
            -> CPU cache is flushed
            -> Other CPU caches are invalidated
        -> Meaning : “Hey all CPUs, this value has changed — reload it!”

    -> After a volatile write, other threads do NOT keep using their old cached value. On the next read, the CPU loads the new value from main memory into its cache.
    -> Cache is not disabled
    -> Cache is invalidated / refreshed
    -> volatile forces threads to read from and write to main memory, bypassing CPU caches, ensuring visibility and ordering across threads.

    -> Volatile does NOT mean “never cache”. It means “never trust stale cache”.
        -> Each volatile read:
            -> Must see the most recent write
            -> Even if the value ends up cached afterward

    -> What volatile ACTUALLY Guarantees :
        -> volatile gives ONLY two guarantees:
            -> Visibility : Every thread sees the latest value
            -> Ordering (Happens-Before\) : Prevents instruction reordering around the volatile variable
            -> It does NOT guarantee atomicity

    -> A thread may update only its CPU cache without immediately updating main memory. Main memory is updated when the JVM or CPU enforces visibility using
       mechanisms like volatile writes, synchronized blocks, or memory barriers.
    -> Even if main memory is updated, a thread is not required to immediately update or reload its CPU cache unless a visibility guarantee exists (volatile, synchronized, etc.).

-> how actually volatile works : thread has actually a cache memory for accessing value fast. these values are copied from main memory.
    in multithreading when one thread change the value of variable the thread is actually changing the value of the variable which stored in its cache memory.
    the main memory could change or not it depends on cpu. but in other side when second thread use that same variable it still sees the variable which is stored
    in its cache memory which is unchanged.
*/
