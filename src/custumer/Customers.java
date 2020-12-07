package custumer;/*
создается новый массив, большего размера (в этом примере – в 2 раза большего);
в новый массив копируется содержимое старого массива;
происходит добавление элемента в новый массив обычным образом.
 */

import java.util.Arrays;
import java.util.Comparator;

public class Customers {
    private Customer[] customers;
    private int capacity;
    private int size;

    public Customers(int capacity_) {
        size = 0;
        capacity = capacity_;
        customers = new Customer[capacity];
    }

    public Customers() {
        this(10);
    }

    public void pushBack(Customer customer) {
        if (size < capacity) {
            customers[size] = customer;
            size++;
        } else {
            Customer[] buffer = new Customer[capacity * 2];
            for (int i = 0; i < size; ++i) {
                buffer[i] = customers[i];
            }
            customers = buffer;
            capacity = capacity * 2;
            customers[size] = customer;
            size++;
        }
    }

    public void print() {
        for (int i = 0; i < size; ++i) {
            customers[i].print();
        }
    }
    public void print_if_card_in(long a, long b) {
        for (int i = 0; i < size; ++i) {
            if (customers[i].getNumCreditCard() >= a && customers[i].getNumCreditCard() <= b)
                customers[i].print();
        }
    }

    public void sortByName() {
        Arrays.sort(customers, 0, size, new Customer.ByNameComparator());
    }
}
