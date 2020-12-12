package service;

import custumer.Customer;
import java.util.Comparator;

public class ComparatorClass {

    public static class ByNameComparator implements Comparator<Customer> {
        @Override
        public int compare(Customer left, Customer right) {
            if (left.getSurname() != right.getSurname())
                return left.getSurname().compareTo(right.getSurname());
            if (left.getSurname() != right.getSurname())
                return left.getName().compareTo(right.getName());
            return left.getOchestvo().compareTo(right.getOchestvo());
        }
    }
}
