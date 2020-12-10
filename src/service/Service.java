package service;

import custumer.Customer;
import util.Util;

public class Service {

    public Customer getCustomer() {
        Util util = new Util();
        Customer customer = new Customer("", "", "", "", 0, 0);
        System.out.println("Введите фамилию");
        customer.setSurname(util.readingStringFromTheKeyboard());
        System.out.println("Введите имя");
        customer.setName(util.readingStringFromTheKeyboard());
        System.out.println("Введите отчество");
        customer.setOchestvo(util.readingStringFromTheKeyboard());
        System.out.println("Введите адрес");
        customer.setAddress(util.readingStringFromTheKeyboard());
        System.out.println("Введите номер кредитной карты");
        customer.setNumCreditCard(util.readingNumberFromTheKeyboard());
        System.out.println("введите номер банковского счета");
        customer.setBankAccountNumber(util.readingNumberFromTheKeyboard());
        return customer;
    }
}
