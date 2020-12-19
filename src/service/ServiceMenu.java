package service;

import book.Book;
import book.Books;
import util.Util;

public class ServiceMenu {

    private Util util = new Util();

    public int menu() {
        while (true) {
            System.out.println(
                    "Выберете пункт меню:\n" +
                            "0. выйти\n" +
                            "1. добавить книгу\n" +
                            "2. найти книги по автору\n" +
                            "3. найти книги по издательству\n" +
                            "4. найти книги после года издания" + "\n");
            int choice = util.readIntFromConsole();
            if (choice < 0 || choice > 4) {
                System.out.println("выбран неправильный пункт меню, повторите ввод.");
                continue;
            }
            return choice;
        }
    }

    public void programExecution(int choice, ServiceBooks serviceBooks, Books books) {
        switch (choice) {
            case 1:
                System.out.println("Введите название книги");
                String bookName = util.readStringFromConsole();
                System.out.println("Введите фамилии авторов через 'пробел'");
                String[] strAuthor = util.readStringFromConsole().split(" ");
                System.out.println("Введите издательство");
                String publishingHouses = util.readStringFromConsole();
                System.out.println("Введите год издания");
                int theYearOfPublishing = util.readYearFromConsole();
                System.out.println("Введите кол-во страниц");
                int pagesNumbers = util.readIntFromConsole();
                System.out.println("Введите цену");
                int price = util.readIntFromConsole();
                System.out.println("Введите тип переплета");
                String binding = util.readStringFromConsole();
                serviceBooks.fillingTheArrayWithBooks(new Book(bookName, strAuthor, publishingHouses,
                        theYearOfPublishing, pagesNumbers, price, binding), books);
                break;
            case 2:
                System.out.println("Введите автора");
                String author = util.readStringFromConsole();
                serviceBooks.displayOfBooksByAuthor(author, books);
                break;
            case 3:
                System.out.println("Введите название издательства");
                String strPublishing = util.readStringFromConsole();
                serviceBooks.displayOfBooksByPublishingHouses(strPublishing, books);
                break;
            case 4:
                System.out.println("Введите год издания");
                int year = util.readYearFromConsole();
                serviceBooks.displayOfBooksByYear(year, books);
        }
    }
}
