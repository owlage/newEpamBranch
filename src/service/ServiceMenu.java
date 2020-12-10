package service;

import book.Books;
import util.Util;

public class ServiceMenu {

    Util util = new Util();
    Books books = new Books();
    Service service = new Service();

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

    public void programExecution(int choice){
        switch (choice) {
            case 1:
                books.pushBooks(service.getBook());
                break;
            case 2:
                System.out.println("Введите автора");
                String strAuthor = util.readStringFromConsole();
                books.authorOutput(strAuthor);
                break;
            case 3:
                System.out.println("Введите название издательства");
                String strPublishing = util.readStringFromConsole();
                books.publishingHousesOutput(strPublishing);
                break;
            case 4:
                System.out.println("Введите год издания");
                int year = util.readYearFromConsole();
                books.yearOutput(year);
        }
    }
}
