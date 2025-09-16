package class_and_object.genrics;

public class single_params_interface_test2<T> implements single_params_generic_interface<T> {

    private T val;

    @Override
    public T getVal() {
        return val;
    }

    @Override
    public void setVal(T newVal) {
        this.val = newVal;
    }

    public static void main(String[] args) {
        single_params_interface_test2<String> t1 = new single_params_interface_test2<>();
        t1.setVal("Karan Soni");
        System.out.println(t1.getVal());
    }
}
