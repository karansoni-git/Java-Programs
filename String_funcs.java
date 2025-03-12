/*these all are String function which is consisted inside string class in java. 
the String class provides a rich set of methods for manipulating and working with strings.
*/
public class String_funcs {

    public static void main(String[] args) {
        String s = "karan soni";
        System.out.println("charAt(int index): " + s.charAt(1));
        System.out.println("contains(CharSequence s): " + s.contains("k"));
        System.out.println("length(): " + s.length());
        System.out.println("isEmpty(): " + s.isEmpty());
        System.out.println("startsWith(String prefix): " + s.startsWith("ka"));
        System.out.println("endsWith(String suffix): " + s.endsWith("ni"));
        System.out.println("equals(Object another): " + s.equals("karan"));
        System.out.println("equalsIgnoreCase(String another): "
                + s.equalsIgnoreCase("KARAN SONI"));
        System.out.println("indexOf(String str): " + s.indexOf("r"));
        System.out.println("lastIndexOf(String str): " + s.lastIndexOf("n"));
        System.out.println("toUppercase(): " + s.toUpperCase());
        System.out.println("toLowerCase(): " + s.toLowerCase());
        String[] s_arr = s.split(" ");
        System.out.println("spilt(): ");
        for (String val : s_arr) {
            System.out.println(val);
        }
        System.out.println("replace(char oldChar, char newChar): " + s.replace("n", "N"));
        System.out.println("replace(CharSequence target, CharSequence replacement): " + s.replace("soni", "parekh"));
        System.out.println("substring(int beginIndex): " + s.substring(6));
        System.out.println("substring(int beginIndex, int endIndex(not included)): "
                + s.substring(6, 9));
        System.out.println("trim(): " + s.trim());
        System.out.println("concat(String str): " + s.concat(" sanjaybhai"));
    }
}
