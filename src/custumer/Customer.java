package custumer;

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

    public Customer(String surname, String name, String ochestvo, String address, long numCreditCart,
                    long bankAccountNumber) {
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
}
