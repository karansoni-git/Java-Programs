/* an inner class is a class defined inside another class. It’s used to logically group classes together, increase encapsulation, and make code more readable and maintainable
=>Types of Inner Classes in Java:
1. Nested Non-Static (Regular) Inner Class
2. Static Nested Class
3. Local Inner Class
4. Anonymous Inner Class */
public class inner_class {

    public void fun() {
        System.out.println("this function is belongs to main class");
    }

    public class sample {

        public int age;
        public String name;

        public sample(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void accessfun() {
            fun();
        }
    }

    public static void main(String[] args) {
        inner_class i1 = new inner_class();
        inner_class.sample s1 = i1.new sample("karan", 20);
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
        System.out.println(s1.getClass());//return its outer class name with its inner class name.
        s1.accessfun();//accessing main class function in inner class function and call ot through the object of inner class.
    }
}
