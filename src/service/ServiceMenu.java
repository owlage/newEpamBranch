package service;

import custumer.Customer;
import util.Util;

public class ServiceMenu {

    private Util util = new Util();
    private ServiceCustomers serviceCustomers = new ServiceCustomers();

    public int menu() {
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
        switch (choice) {
            case 1:
                System.out.println("Введите фамилию");
                String surname = util.readingStringFromTheKeyboard();
                System.out.println("Введите имя");
                String name = util.readingStringFromTheKeyboard();
                System.out.println("Введите отчество");
                String ochestvo = util.readingStringFromTheKeyboard();
                System.out.println("Введите адрес");
                String address = util.readingStringFromTheKeyboard();
                System.out.println("Введите номер кредитной карты");
                int numCreditCard = util.readingNumberFromTheKeyboard();
                System.out.println("введите номер банковского счета");
                int bankAccountNumber = util.readingNumberFromTheKeyboard();
                serviceCustomers.pushBack(new Customer(surname, name,ochestvo,address, numCreditCard,
                        bankAccountNumber));
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
