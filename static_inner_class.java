/* a static inner class (also known as a static nested class) is a class defined inside another class using the static keyword. It behaves like a regular class but is logically nested within the outer class. */
public class static_inner_class {

    public void getdetail() {
        System.out.println("this is function in main class");
    }

    private static class sample {

        public String name;
        public int age;

        private sample(String name, int age) {
            this.age = age;
            this.name = name;
        }

        private String getName() {
            return name;
        }

        private void setName(String name) {
            this.name = name;
        }

        private int getAge() {
            return age;
        }

        private void setAge(int age) {
            this.age = age;
        }

        // public void accessgetdetail() {
        // //here we can not access a non static variables and methods into static class
        //     getdetail();
        // }
    }

    public static void main(String[] args) {
        sample s1 = new sample("karna", 20);
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
        static_inner_class e1 = new static_inner_class();
        // e1.accessgetdetail(); //can't access private class data.
    }
}
