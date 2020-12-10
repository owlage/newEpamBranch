package service;

import book.Book;
import util.Util;

import java.util.Scanner;

public class Service {

    public Book getBook() {
        Util util = new Util();
        Book book = new Book("", null, "", 0, 0, 0,
                "");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги");
        book.setBookName(util.readStringFromConsole());
        System.out.println("Введите фамилии авторов через 'пробел'");
        String strAuthor = util.readStringFromConsole();
        book.setAuthor(strAuthor.split(" "));
        System.out.println("Введите издательство");
        book.setPublishingHouses(util.readStringFromConsole());
        System.out.println("Введите год издания");
        book.setTheYearOfPublishing(util.readYearFromConsole());
        System.out.println("Введите кол-во страниц");
        book.setPagesNumbers(util.readIntFromConsole());
        System.out.println("Введите цену");
        book.setPrice(util.readIntFromConsole());
        System.out.println("Введите тип переплета");
        book.setBinding(util.readStringFromConsole());
        return book;
    }
}
