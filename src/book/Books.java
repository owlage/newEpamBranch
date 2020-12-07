package book;

import book.Book;

import java.util.Arrays;

public class Books {
    private Book[] books;
    private int size;
    private int capacity;

    public Books(int capacity) {
        size = 0;
        this.capacity = capacity;
        books = new Book[capacity];
    }

    public Books() {
        this(10);
    }

    public void pushBooks(Book book) {
        if (size < capacity) {
            books[size] = book;
            size++;
        } else {
            Book[] buffer = new Book[capacity * 2];
            for (int i = 0; i < size; i++) {
                buffer[i] = books[i];
            }
            books = buffer;
            capacity = capacity * 2;
            books[size] = book;
            size++;
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            books[i].print();
        }
    }

    public void authorOutput(String str) {
        int length = books.length;
        Book [] arr = Arrays.copyOf(books, length);
        Book[] books1 = Arrays.copyOf(books, books.length);
        for (int i = 0; i < books1.length; i++) {
            for (String str1 : books1[i].getAuthor()) {
                if (str.equalsIgnoreCase(str1)) {
                    books1[i].print();
                }
            }
        }
    }

    public void publishingHousesOutput(String str) {
        Book[] books2 = Arrays.copyOf(books, books.length);
        for (int i = 0; i < books2.length; i++) {
            if (str.equalsIgnoreCase(books2[i].getPublishingHouses())) {
                books2[i].print();
            }
        }
    }

    public void yearOutput(int year) {
        Book[] books3 = Arrays.copyOf(books, books.length);
        for (int i = 0; i < books3.length; i++) {
            if (year <= books3[i].getTheYearOfPublishing()) {
                books3[i].print();
            }
        }
    }
}
