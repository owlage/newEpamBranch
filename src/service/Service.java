package service;

import book.Book;
import program.Util;

import java.util.Scanner;

public class Service {

    public static Book getBook() {
        Util util = new Util();
        Book book = new Book("", null, "", 0, 0, 0,
                "");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги");
        book.setBookName(util.strInput());
        System.out.println("Введите фамилии авторов через 'пробел'");
        String strAuthor = util.strInput();
        book.setAuthor(strAuthor.split(" "));
        System.out.println("Введите издательство");
        book.setPublishingHouses(util.strInput());
        System.out.println("Введите год издания");
        book.setTheYearOfPublishing(util.numYearInput());
        System.out.println("Введите кол-во страниц");
        book.setPagesNumbers(util.numInput());
        System.out.println("Введите цену");
        book.setPrice(util.numInput());
        System.out.println("Введите тип переплета");
        book.setBinding(util.strInput());
        return book;
    }
}
