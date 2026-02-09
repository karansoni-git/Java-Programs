package DSA;

public class CountOccurrencesOfString {
    public static void main(String[] args) {
        String str = "abababa";
        String checkStr = "aba";
        System.out.println(isAvailable(str, checkStr));
//        System.out.println(countOccurrences(str,checkStr));
    }

    public static int isAvailable(String str, String checkStr) {

        // base case: remaining string is smaller than check string
        if (str.length() < checkStr.length()) {
            return 0;
        }

        // if lengths are equal, direct compare
        if (str.length() == checkStr.length()) {
            return str.equals(checkStr) ? 1 : 0;
        }

        // check current window
        if (str.substring(0, checkStr.length()).equals(checkStr)) {
            return 1 + isAvailable(str.substring(1), checkStr);
        }

        // move forward
        return isAvailable(str.substring(1), checkStr);
    }

    static int countOccurrences(String str, String pattern) {
        // base case
        if (str.length() < pattern.length()) {
            return 0;
        }

        // check current position
        int count = str.startsWith(pattern) ? 1 : 0;

        // recursive call by moving 1 character forward
        return count + countOccurrences(str.substring(1), pattern);
    }

}
