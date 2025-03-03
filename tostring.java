/* the toString() method is a built-in method defined in the Object class, which is the parent class of all Java classes.
The toString() method returns a string representation of an object.
By default, it returns: ClassName@HashCode
=> ClassName is the name of the object's class.
=> HashCode is a hexadecimal representation of the object's memory address.*/
public class tostring {

    String name;
    int age, rollno;

    public tostring(String name, int age, int rollno) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }
    @Override
    public String toString() {
        return "Name : " + name + " Age : " + age + " Rollno : " + rollno;
    }

    public static void main(String[] args) {
        tostring k = new tostring("Karan",20,195);
        System.out.println(k);//toString() can be called without specify it's name with class object.
    }
}
