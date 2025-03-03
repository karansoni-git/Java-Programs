/*the final keyword is a modifier that can be used with variables, methods, and classes. 
=>When a variable is declared final, its value cannot be changed once it’s initialized.
=>It must be assigned a value either during declaration or in the constructor.
the variable or method has to follow naming convention like single word in uppercase and multiple word separeted bt _ underscore (snake_case) and all in uppercase.*/

public class final_kw{
    public static final String NAME = "Karan";
    public static void main(String[] args) {
        System.out.println(NAME);
    }
} 