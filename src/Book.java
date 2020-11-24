import java.util.Arrays;
import java.util.Scanner;

public class Book {

    private int id;
    private static int ID;
    private String bookName;
    private String[] author;
    private String publishingHouses;
    private int theYearOfPublishing;
    private int pagesNumbers;
    private int price;
    private String binding;

    Book(String bookName, String[] author, String publishingHouses, int theYearOfPublishing, int pagesNumbers,
         int price, String binding) {
        id = ID++;
        this.bookName = bookName;
        this.author = author;
        this.publishingHouses = publishingHouses;
        this.theYearOfPublishing = theYearOfPublishing;
        this.pagesNumbers = pagesNumbers;
        this.price = price;
        this.binding = binding;
    }

    int getId() {
        return id;
    }

    void setBookName(String bookName) {
        this.bookName = bookName;
    }

    String getBookName() {
        return bookName;
    }

    String[] getAuthor() {
        return (String[]) author.clone();
    }

    void setPublishingHouses(String publishingHouses) {
        this.publishingHouses = publishingHouses;
    }

    String getPublishingHouses() {
        return publishingHouses;
    }

    void setTheYearOfPublishing(int theYearOfPublishing) {
        this.theYearOfPublishing = theYearOfPublishing;
    }

    int getTheYearOfPublishing() {
        return theYearOfPublishing;
    }

    void setPagesNumbers(int pagesNumbers) {
        this.pagesNumbers = pagesNumbers;
    }

    int getPagesNumbers() {
        return pagesNumbers;
    }

    void setPrice(int price) {
        this.price = price;
    }

    int getPrice() {
        return price;
    }

    void setBinding(String binding) {
        this.binding = binding;
    }

    String getBinding() {
        return binding;
    }

    public String toString() {
        return "id: " + getId() + "\nНазвание: " + getBookName() + "\nАвтор: " + Arrays.toString(author) +
                "\nИздательсво: " + getPublishingHouses() + "\nГод издатния: " + getTheYearOfPublishing() +
                "\nКол - во страниц " + getPagesNumbers() + "\nЦена: " + getPrice() + "\nПереплет: " + getBinding();
    }

    public void print() {
        System.out.println(toString());
    }

    static Book getBook() {
        Book book = new Book("", null, "", 0, 0, 0,
                "");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги");
        book.bookName = Util.strInput();
        System.out.println("Введите фамилии авторов через 'пробел'");
        String strAuthor = Util.strInput();
        book.author = strAuthor.split(" ");
        System.out.println("Введите издательство");
        book.publishingHouses = Util.strInput();
        System.out.println("Введите год издания");
        book.theYearOfPublishing = Util.numYearInput();
        System.out.println("Введите кол-во страниц");
        book.pagesNumbers = Util.numInput();
        System.out.println("Введите цену");
        book.price = Util.numInput();
        System.out.println("Введите тип переплета");
        book.binding = Util.strInput();
        return book;
    }
}
