package account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    static class SortByCountComparator implements Comparator<Accounts> {

        @Override
        public int compare(Accounts o1, Accounts o2) {
            return o1.getNumAccount() - o2.getNumAccount();
        }
    }

    static class SortByAmountComparator implements Comparator<Accounts> {

        @Override
        public int compare(Accounts o1, Accounts o2) {
            return o1.getAmountOfMoney() - o2.getAmountOfMoney();
        }
    }

    public void sortByCount() {
        Collections.sort(accountsList, new Human.SortByCountComparator());
    }

    public void sortByAmount() {
        Collections.sort(accountsList, new Human.SortByAmountComparator());
    }

    public void print() {
        for (Accounts accounts : accountsList) {
            System.out.println("Номер счёта: " + accounts.getNumAccount());
            System.out.println("Сумма на счёте: " + accounts.getAmountOfMoney());
            System.out.println("Статус: " + accounts.getStatus());
        }
    }

    public void searchAccount(int num) {
        for (Accounts accounts : accountsList) {
            if (accounts.getNumAccount() == num) {
                System.out.println("Номер счёта: " + accounts.getNumAccount());
                System.out.println("Сумма на счёте: " + accounts.getAmountOfMoney());
                System.out.println("Статус: " + accounts.getStatus());
            }
        }
    }

    public int sumMoney() {
        int sum = 0;
        for (Accounts accounts : accountsList) {
            if(accounts.getStatus().equals("Разблокирован")) {
                sum += accounts.getAmountOfMoney();
            }
        }
        return sum;
    }

    public int sumMoneyByAccounts() {
        int sum = 0;
        for (Accounts accounts : accountsList) {
            for (NewAccounts newAccounts : newAccountsList) {
                if (accounts.getNumAccount() == newAccounts.getNumAccounts()) {
                    if (accounts.getStatus().equals("Разблокирован")) {
                        sum += accounts.getAmountOfMoney();
                    }
                }
            }
        }
        return sum;
    }

    public int sumOfPositiveBills() {
        int sum = 0;
        for (Accounts accounts : accountsList) {
            if (accounts.getAmountOfMoney() >= 0) {
                if (accounts.getStatus().equals("Разблокирован")) {
                    sum += accounts.getAmountOfMoney();
                }
            }
        }
        return sum;
    }

    public int sumOfNegativeBills() {
        int sum = 0;
        for (Accounts accounts : accountsList) {
            if (accounts.getAmountOfMoney() < 0) {
                if (accounts.getStatus().equals("Разблокирован")) {
                    sum += accounts.getAmountOfMoney();
                }
            }
        }
        return sum;
    }

    public void swapStatus(int num) {
        for (Accounts accounts : accountsList) {
            if (accounts.getNumAccount() == num) {
                if (accounts.getStatus().equals("Разблокирован")) {
                    accounts.setStatus("Заблокирован");
                } else {
                    accounts.setStatus("Разблокирован");
                }
            }
        }
    }
}
