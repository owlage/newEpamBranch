package service;

import custumer.Customers;
import util.Util;

public class ServiceMenu {

    public int menu() {
        Util util = new Util();
            System.out.println(
                    "Выберете пункт меню:\n" +
                            "0. выйти\n" +
                            "1. добавить покупателя\n" +
                            "2. вывод покупателей в алфавитном порядке\n" +
                            "3. вывод покупателей с кредитной картой в интервале\n");
        while (true) {
            int choice = util.readingNumberFromTheKeyboard();
            if (choice < 0 || choice > 3) {
                System.out.println("выбран неправильный пункт меню, повторите ввод.");
                continue;
            }
            return choice;
        }
    }

    public void programExecution(int choice) {
        Util util = new Util();
        Service service = new Service();
        ServiceCustomers serviceCustomers = new ServiceCustomers();
        switch (choice) {
            case 1:
                serviceCustomers.pushBack(service.getCustomer());
                break;
            case 2:
                serviceCustomers.sortByName();
                serviceCustomers.print();
                break;
            case 3:
                System.out.println("Введи диапазон кредитных карт\n");
                System.out.println("От: ");
                int a = util.readingNumberFromTheKeyboard();
                System.out.println("До: ");
                int b = util.readingNumberFromTheKeyboard();
                serviceCustomers.printIfCardIn(a, b);
        }
    }
}
