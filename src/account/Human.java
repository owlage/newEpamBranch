package account;

import java.util.ArrayList;
import java.util.List;

public class Human {

    private List<NewAccounts> newAccountsList;
    private List<Accounts> accountsList;

    public Human() {
        this.newAccountsList = new ArrayList<>();
        this.accountsList = new ArrayList<>();
    }

    public List<NewAccounts> getNewAccountsList() {
        return newAccountsList;
    }

    public void setAccountsList(List<Accounts> accountsList) {
        this.accountsList = accountsList;
    }

    public List<Accounts> getAccountsList() {
        return accountsList;
    }

    public void setNewAccountsList(List<NewAccounts> newAccountsList) {
        this.newAccountsList = newAccountsList;
    }
}
