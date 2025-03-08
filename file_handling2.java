//this is an example of file handing and we are writing data to file.
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_handling2 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a file name:");
        String filename = n.nextLine();
        try (FileWriter w = new FileWriter(filename)) {
            w.write("this text is belong from file_handling2 file");
        } 
        catch (IOException ex) {
            System.out.println("exception occurred:" + ex);
        }
    }
}
