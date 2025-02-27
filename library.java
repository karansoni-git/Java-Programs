//first program of class and object.
public class library {

    String author, title;
    int isbn;
    static int totalbooks;
    boolean isavailable;

    /*this is static code block it's intialize only one time when first object is created and used among all objects of class.
    if we create this type of code block => { ... } it's called normal code block and run each time when an object is created*/
    static {
        totalbooks = 0;
    }

    //parameterized constructor.
    library(String author, String title, int isbn) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        isavailable = true;
        totalbooks++;
    }

    public void borrowbook(String title) {
        if (isavailable == true) {
            System.out.println("successfully borrowed a book");
            isavailable = false;
            totalbooks--;
        } else {
            System.out.println("book is not available currently,pick any other book!");
        }
    }

    public void returnbook(String title) {
        if (isavailable) {
            System.out.println("already in library.");
        } else {
            System.out.println("thank for reading this book,hope you enjoyed");
            totalbooks++;
        }
    }

    public static void gettotalbooks() {
        System.out.println("books available in library:" + totalbooks);
    }

    public static void main(String[] args) {
        library b1 = new library("mk john", "harry potter", 1933);
        library b2 = new library("apj abdul kalam", "successfull life", 8261);
        gettotalbooks();
        b1.borrowbook("harry potter");
        b2.borrowbook("successfull life");
        gettotalbooks();
        b1.returnbook("harry potter");
        gettotalbooks();
    }
}
