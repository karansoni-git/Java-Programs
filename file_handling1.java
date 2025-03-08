/*this is an example of fileReader class on file handling where we read data from file
and print all data in console.
*/
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class file_handling1 {

    public static void main(String[] args) {
        Scanner n =new Scanner(System.in);
        System.out.print("Enter file name:");
        String file = n.nextLine();
        int ch;
        try(FileReader r = new FileReader(file)){
            do{
               ch = r.read();
               System.out.print((char)ch); 
            }while(ch != -1);
        }catch(FileNotFoundException ex){
            System.out.println(file + " not found");
        }catch(IOException ex)
        {
            System.out.println("error found");
        }
    }
}
