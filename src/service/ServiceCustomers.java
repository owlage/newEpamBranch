package service;

import custumer.Customer;
import custumer.Customers;

import java.util.Arrays;

public class ServiceCustomers {

    Customers customers = new Customers();

    public void pushBack(Customer customer) {
        if (customers.getSize() < customers.getCapacity()) {
            customers.getCustomers()[customers.getSize()] = customer;
            customers.setSize(customers.getSize() + 1);
        } else {
            Customer[] buffer = new Customer[customers.getCapacity() * 2];
            for (int i = 0; i < customers.getSize(); ++i) {
                buffer[i] = customers.getCustomers()[i];
            }
            customers.setCustomers(buffer);
            customers.setCapacity(customers.getCapacity() * 2);
            customers.getCustomers()[customers.getSize()] = customer;
            customers.setSize(customers.getSize() + 1);
        }
    }

    public void print() {
        for (int i = 0; i < customers.getSize(); ++i) {
            System.out.println(customers.getCustomers()[i].toString());
        }
    }
    public void printIfCardIn(int a, int b) {
        for (int i = 0; i < customers.getSize(); ++i) {
            if (customers.getCustomers()[i].getNumCreditCard() >= a &&
                    customers.getCustomers()[i].getNumCreditCard() <= b)
                System.out.println(customers.getCustomers()[i].toString());
        }
    }

    public void sortByName() {
        Arrays.sort(customers.getCustomers(), 0, customers.getSize(), new ComparatorClass.ByNameComparator());
    }
}
