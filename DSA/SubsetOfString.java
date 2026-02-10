package DSA;

public class SubsetOfString {
    public static void main(String[] args) {
        subsetOfString("abc", 0, "");
    }


    public static void subsetOfString(String str, int i, String curr) {
        if (i == str.length()) {
            System.out.println(curr);
            return;
        }
        subsetOfString(str, i + 1, curr + str.charAt(i));
        subsetOfString(str, i + 1, curr);
    }
}
