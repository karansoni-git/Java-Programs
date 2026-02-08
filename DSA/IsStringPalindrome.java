package DSA;

public class IsStringPalindrome {
    public static void main(String[] args) {
        String name = "racecar";
        System.out.println(isPalindrome(name));
//        System.out.println(isPalindrome2(name, 0, name.length() - 1));
//        System.out.println(isPalindrome3("karanarak"));
    }


    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) return true;
        int left = 0;
        int right = str.length() - 1;
//        System.out.println(str.charAt(left));
//        System.out.println(str.charAt(right));
        String substr = str.substring(left + 1, right);
//        System.out.println(substr);
        if (str.charAt(left) == str.charAt(right)) {
            return isPalindrome(substr);
        }
        return false;
    }


    // more optimized than previous one.
    public static boolean isPalindrome2(String str, int left, int right) {
        if (left >= right) return true;

        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        return isPalindrome2(str, left + 1, right - 1);
    }

    public static boolean isPalindrome3(String str) {
        if (str.length() <= 1) {
            return true;
        }

        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        return isPalindrome3(str.substring(1, str.length() - 1));
    }
}

