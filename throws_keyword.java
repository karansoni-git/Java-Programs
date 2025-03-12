
import java.io.IOException;

public class throws_keyword {

    public static void fun() throws IOException {
        throw new IOException("exception occurs");
    }

    public static void main(String[] args) {
        try {
            fun();
        } catch (IOException e) {
            System.out.println("error is : " + e.getMessage());
        }
    }
}
