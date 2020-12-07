package service;

import custumer.Customer;
import program.Util;

import java.util.Comparator;

public class Service {

    public Customer getCustomer() {
        Util util = new Util();
        Customer customer = new Customer("", "", "", "", 0, 0);
        System.out.println("Введите фамилию");
        customer.setSurname(util.strInput());
        System.out.println("Введите имя");
        customer.setName(util.strInput());
        System.out.println("Введите отчество");
        customer.setOchestvo(util.strInput());
        System.out.println("Введите адрес");
        customer.setAddress(util.addressInput());
        System.out.println("Введите номер кредитной карты, 16 цифр");
        customer.setNumCreditCard(util.number());
        System.out.println("введите номер банковского счета, 16 цифр");
        customer.setBankAccountNumber(util.number());
        return customer;
    }
}
