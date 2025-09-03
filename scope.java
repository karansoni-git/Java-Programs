public class scope {
    String myVar = "Global";

    void method1(){
        System.out.println("Global : " + myVar);
        String myVar = "Local";
        System.out.println("local : " + myVar);
    }

    void method2(){
        myVar = "New Global";
        System.out.println("Updated Global : " + myVar);
    }

    void method3(){
        String myVar = "Local Variable";
        System.out.println("Local Variable : " + myVar);
        System.out.println("Global Variable : " + this.myVar);
    }

    public static void main(String[] args) {
        scope s1 = new scope();
        s1.method1();
        s1.method2();
        s1.method3();
    }
}
