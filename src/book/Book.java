package book;

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

    public Book(String bookName, String[] author, String publishingHouses, int theYearOfPublishing, int pagesNumbers,
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

    public int getId() {
        return id;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }

    public String[] getAuthor() {
        return author;
    }

    public void setPublishingHouses(String publishingHouses) {
        this.publishingHouses = publishingHouses;
    }

    public String getPublishingHouses() {
        return publishingHouses;
    }

    public void setTheYearOfPublishing(int theYearOfPublishing) {
        this.theYearOfPublishing = theYearOfPublishing;
    }

    public int getTheYearOfPublishing() {
        return theYearOfPublishing;
    }

    public void setPagesNumbers(int pagesNumbers) {
        this.pagesNumbers = pagesNumbers;
    }

    public int getPagesNumbers() {
        return pagesNumbers;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getBinding() {
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
}
