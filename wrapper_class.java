public class wrapper_class {

    public static void main(String[] args) {
        Byte b = new Byte((byte) 10);
        System.out.println(b);
        byte c =  12;
        System.out.println(c);
        c = b.byteValue();
        System.out.println(c);
    }
}
