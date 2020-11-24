import java.util.Comparator;
import java.util.Scanner;

public class Customer {

    private int id;
    private static int ID;
    private String surname;
    private String name;
    private String ochestvo;
    private String address;
    private long numCreditCard, bankAccountNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOchestvo() {
        return ochestvo;
    }

    public void setOchestvo(String ochestvo) {
        this.ochestvo = ochestvo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getNumCreditCard() {
        return numCreditCard;
    }

    public void setNumCreditCard(long numCreditCard) {
        this.numCreditCard = numCreditCard;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    Customer(String surname, String name, String ochestvo, String address, long numCreditCart, long bankAccountNumber) {
        id = ID++;
        this.surname = surname;
        this.name = name;
        this.ochestvo = ochestvo;
        this.address = address;
        this.numCreditCard = numCreditCart;
        this.bankAccountNumber = bankAccountNumber;
    }

    public String toString() {
        return "id: " + getId() + "\n" + "Surname: " + getSurname() + "\n" + "Name: " + getName() + "\n" +
                "Otchestvo: " + getOchestvo() + "\n" + "Address: " + getAddress() + "\n" +
                "Num credit card: " + getNumCreditCard() + "\n" + "Bank account number: " +
                getBankAccountNumber() + "\n";
    }

    public void print() {
        System.out.println(toString());
    }

    public static Customer getCustomer() {
        Customer customer = new Customer("", "", "", "", 0, 0);
        System.out.println("Введите фамилию");
        customer.surname = Util.strInput();
        System.out.println("Введите имя");
        customer.name = Util.strInput();
        System.out.println("Введите отчество");
        customer.ochestvo = Util.strInput();
        System.out.println("Введите адрес");
        customer.address = Util.addressInput();
        System.out.println("Введите номер кредитной карты, 16 цифр");
        customer.numCreditCard = Util.number();
        System.out.println("введите номер банковского счета, 16 цифр");
        customer.bankAccountNumber = Util.number();

        return customer;
    }

    static class ByNameComparator implements Comparator<Customer> {
        @Override
        public int compare(Customer left, Customer right) {
            if (left.surname != right.surname)
                return left.surname.compareTo(right.surname);
            if (left.name != right.name)
                return left.name.compareTo(right.name);
            return left.ochestvo.compareTo(right.ochestvo);
        }
    }

}
