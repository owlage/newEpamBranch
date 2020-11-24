import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Books books = new Books(1);
        while (true) {
            System.out.println(
                    "Выберете пункт меню:\n" +
                            "0. выйти\n" +
                            "1. добавить книгу\n" +
                            "2. найти книги по автору\n" +
                            "3. найти книги по издательству\n" +
                            "4. найти книги после года издания" + "\n");
            int choice = Util.numInput();
            if (choice < 1 || choice > 4) {
                System.out.println("выбран неправильный пункт меню, повторите ввод.");
                continue;
            }
            switch (choice) {
                case 1:
                    books.pushBooks(Book.getBook());
                    break;
                case 2:
                    System.out.println("Введите автора");
                    String strAuthor = Util.strInput();
                    books.authorOutput(strAuthor);
                    break;
                case 3:
                    System.out.println("Введите название издательства");
                    String strPublishing = Util.strInput();
                    books.publishingHousesOutput(strPublishing);
                    break;
                case 4:
                    System.out.println("Введите год издания");
                    int year = Util.numYearInput();
                    books.yearOutput(year);
            }
        }
    }
}
