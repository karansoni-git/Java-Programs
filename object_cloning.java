
public class object_cloning implements Cloneable {

    public String name;
    public int age;

    public object_cloning(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        try {
            object_cloning o1 = new object_cloning("karan", 20);
            object_cloning o2 = (object_cloning) o1.clone();
            System.out.println(o1.getName());
            System.out.println(o2.getName());
            System.out.println("is equals : "+o1.equals(o2));
            o2.setName("jay");
            System.out.println(o1.getName());
            System.out.println(o2.getName());
            System.out.println(o1.getName().equals(o2.getName()));
        } catch (CloneNotSupportedException e) {
            System.out.println("error is : " + e.getMessage());
        }

    }
}
