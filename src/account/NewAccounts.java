package account;

/*
Этот класс сделан для 6-го пунка, в обьект этого класса я записываю номера счетов для подсчета суммы, я понимаю что
можно было сделать обычный список в классе Human, но т.к. мы работаем с обьектами я сделал отдельный класс для
закрепления темы
 */

public class NewAccounts {

    private int numAccounts;

    public NewAccounts(int numAccounts) {
        this.numAccounts = numAccounts;
    }

    public int getNumAccounts() {
        return numAccounts;
    }

    public void setNumAccounts(int numAccounts) {
        this.numAccounts = numAccounts;
    }
}
