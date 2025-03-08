public class enum_test
{
    public static void main(String[] args) {
        //first way to use enum class attributes.
        //syntax: enum_class_name.attribute_name
        System.out.println(enum_class.MON);

        //second way is with for each loop 
        for(enum_class val : enum_class.values())
        {
            System.out.println(val);
        }
    }
}