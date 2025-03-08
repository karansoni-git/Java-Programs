
public class varArgs_Str_Concate {

    public static void concate(String... args) {
        StringBuilder str = new StringBuilder();
        for (String a : args) {
            str.append(a).append(" ");
        }
        System.out.println(str.toString() );
    }

    public static void main(String[] args) {
        concate("karan","soni","sanjaybhai");
        concate("this","is","an","example");
        concate("karan");
    }
}
