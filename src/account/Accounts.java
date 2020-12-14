package account;

import programs.Program;

public class Accounts {

    private int numAccount;
    private int amountOfMoney;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public Accounts(int numAccount, int amountOfMoney) {
        this.numAccount = numAccount;
        this.amountOfMoney = amountOfMoney;
        status = "Разблокирован";
    }

    public int getNumAccount() {
        return numAccount;
    }

    public void setNumAccount(int numAccount) {
        this.numAccount = numAccount;
    }
}
