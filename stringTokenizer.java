/* the StringTokenizer class is part of the java.util package and is used to break a string into tokens. It’s a simple way to split strings, though it's considered somewhat outdated — most modern code uses String.split() or java.util.regex instead. However, it's still useful for some quick-and-dirty tokenization tasks

=>three type of StringTokenizer constructor.
1. StringTokenizer(String str) — uses whitespace as the default delimiter.
2. StringTokenizer(String str, String delim) — uses specified delimiters.
3. StringTokenizer(String str, String delim, boolean returnDelims) — can optionally return delimiters as tokens.
 */
import java.util.StringTokenizer;

public class stringTokenizer{
    public static void main(String[] args) {
        String str = "this is, string and, separated by, comma";
        StringTokenizer t = new StringTokenizer(str,",");

        while (t.hasMoreTokens()) { 
            System.out.println(t.nextToken());
            // System.out.println(t.countTokens());
        }
    }
}