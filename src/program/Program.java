package program;

import book.Books;
import service.ServiceBooks;
import service.ServiceMenu;

public class Program {

    public static void main(String[] args) {
        ServiceMenu serviceMenu = new ServiceMenu();
        ServiceBooks serviceBooks = new ServiceBooks();
        Books books = new Books(1);
        while (true) {
            int number = serviceMenu.menu();
            if (number != 0) {
                serviceMenu.programExecution(number, serviceBooks, books);
            } else {
                break;
            }
        }
    }
}
