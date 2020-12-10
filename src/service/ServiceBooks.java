package service;

import book.Book;
import book.Books;

public class ServiceBooks {

    Books books = new Books(1);

    public void fillingTheArrayWithBooks(Book book) {
        if (books.getSize() < books.getCapacity()) {
            books.getBooks()[books.getSize()] = book;
            books.setSize(books.getSize() + 1);
        } else {
            Book[] buffer = new Book[books.getCapacity() * 2];
            for (int i = 0; i < books.getSize(); i++) {
                buffer[i] = books.getBooks()[i];
            }
            books.setBooks(buffer);
            books.setCapacity(books.getCapacity() * 2);
            books.getBooks()[books.getSize()] = book;
            books.setSize(books.getSize() + 1);
        }
    }

    public void print() {
        for (int i = 0; i < books.getSize(); i++) {
            books.getBooks()[i].print();
        }
    }

    public void displayOfBooksByAuthor(String str) {
        Book[] books1 = new Book[books.getBooks().length];
        System.arraycopy(books.getBooks(),0,books1,0,books.getBooks().length);
        for (int i = 0; i < books1.length; i++) {
            for (String str1 : books1[i].getAuthor()) {
                if (str.equalsIgnoreCase(str1)) {
                    books1[i].print();
                }
            }
        }
    }

    public void displayOfBooksByPublishingHouses(String str) {
        Book[] books2 = new Book[books.getBooks().length];
        System.arraycopy(books.getBooks(),0,books2,0,books.getBooks().length);
        for (int i = 0; i < books2.length; i++) {
            if (str.equalsIgnoreCase(books2[i].getPublishingHouses())) {
                books2[i].print();
            }
        }
    }

    public void displayOfBooksByYear(int year) {
        Book[] books3 = new Book[books.getBooks().length];
        System.arraycopy(books.getBooks(),0,books3,0,books.getBooks().length);
        for (int i = 0; i < books3.length; i++) {
            if (year <= books3[i].getTheYearOfPublishing()) {
                books3[i].print();
            }
        }
    }
}
