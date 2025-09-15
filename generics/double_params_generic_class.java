package class_and_object.genrics;

public class double_params_generic_class<K, V> {
    private K key;
    private V value;

    public double_params_generic_class(K intialKey , V initialValue){
        this.key = intialKey;
        this.value = initialValue;
    }

    public K getKey(){
        return this.key;
    }
    public V getValue(){
        return this.value;
    }

    public static void main(String[] args) {
        double_params_generic_class <Integer , String> s1 = new double_params_generic_class<>(1,"Karan");
        double_params_generic_class <Integer , String> s2 = new double_params_generic_class<>(2,"Krish");
        double_params_generic_class <String , String> s3 = new double_params_generic_class<>("Dhruvil","Gondal");
        System.out.println("s1 key : " + s1.getKey());
        System.out.println("s1 value : " + s1.getValue());
        System.out.println("s2 key : " + s2.getKey());
        System.out.println("s2 value :  " + s2.getValue());
        System.out.println("s3 key : " + s3.getKey());
        System.out.println("s3 value :  " + s3.getValue());
    }
}
