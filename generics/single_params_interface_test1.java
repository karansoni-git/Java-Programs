package class_and_object.genrics;

public class single_params_interface_test1 implements single_params_generic_interface<String>{

    private String val;

    @Override
    public String getVal() {
        return this.val;
    }

    @Override
    public void setVal(String newVal) {
        this.val = newVal;
    }

    public static void main(String[] args) {
        single_params_interface_test1 t1 = new single_params_interface_test1();
        t1.setVal("Karan Soni");
        System.out.println(t1.getVal());
    }
}
