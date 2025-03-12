
public class stringbuffer {

    public static void main(String[] args) {
        // StringBuffer() — Creates an empty buffer with default capacity (16 characters).
        // StringBuffer sb1 = new StringBuffer();

        //StringBuffer(String str) — Initializes with a given string.
        StringBuffer sb2 = new StringBuffer("karan");

        //StringBuffer(int capacity) — Sets a custom buffer size.
        // StringBuffer sb3 = new StringBuffer(20);
        System.out.println("first string : " + sb2);

        sb2.append("soni");//append(String str) — Adds text to the end.
        System.out.println("append(): " + sb2);

        //insert(int offset, String str) — Inserts text at a given index
        sb2.insert(5, "*");
        System.out.println("insert(): " + sb2);

        //replace(int start, int end, String str) — Replaces a portion of the string.
        sb2.replace(6, sb2.length(), "parekh");
        System.out.println("replace(): " + sb2);

        //delete(int start, int end) — Removes a substring.
        sb2.delete(5, sb2.length());
        System.out.println("delete(): " + sb2);

        //reverse() — Reverses the string.
        sb2.reverse();
        System.out.println("reverse(): " + sb2);
        sb2.reverse();

        //length() — Returns the number of characters.
        sb2.length();
        System.out.println("length(): " + sb2);

        //capacity() — Returns the current buffer capacity.
        System.out.println("capacity(): " + sb2.capacity()); // 16 (default) + stringsize = total capacity.

        //ensureCapacity(int minCapacity) — Ensures buffer has at least the given capacity.
        sb2.ensureCapacity(50);
        System.out.println("ensureCapacity(): " + sb2.capacity());

        //setLength(int newLength) — Changes the buffer length
        sb2.setLength(55);
        System.out.println("setLength(): " + sb2.capacity());

        //toString() — Converts StringBuffer to String.
        System.out.println("toString(): " + sb2.toString());

        //substring(int start, int end(not include)) — Returns a portion of the string as a new String.
        System.out.println("substring(): " + sb2.substring(1, 4));

        //charAt(int index) — Gets a character at a specific index.
        System.out.println("charAt(): " + sb2.charAt(0));
    }
}
