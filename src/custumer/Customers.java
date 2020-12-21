package custumer;/*
создается новый массив, большего размера (в этом примере – в 2 раза большего);
в новый массив копируется содержимое старого массива;
происходит добавление элемента в новый массив обычным образом.
 */

import java.util.Arrays;


public class Customers {
    private Customer[] customers;
    private int capacity;
    private int size;

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void print_if_card_in(long a, long b) {
        for (int i = 0; i < size; ++i) {
            if (customers[i].getNumCreditCard() >= a && customers[i].getNumCreditCard() <= b)
                customers[i].print();
        }
    }

    public void sortByName() {
        Arrays.sort(customers);

    }

    public Customers(int capacity) {
        size = 0;
        this.capacity = capacity;
        customers = new Customer[capacity];
    }

    public Customers() {
        this(10);
    }

}
