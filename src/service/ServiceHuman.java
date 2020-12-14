package service;

import account.Accounts;
import account.Human;
import account.NewAccounts;
import copmarator.ComparatorClass;

import java.util.Collections;

public class ServiceHuman {

    public void sortByCount() {
        Collections.sort(human.getAccountsList(), new ComparatorClass.SortByCountComparator());
    }

    public void sortByAmount() {
        Collections.sort(human.getAccountsList(), new ComparatorClass.SortByAmountComparator());
    }

    public void print() {
        for (Accounts accounts : human.getAccountsList()) {
            System.out.println("Номер счёта: " + accounts.getNumAccount());
            System.out.println("Сумма на счёте: " + accounts.getAmountOfMoney());
            System.out.println("Статус: " + accounts.getStatus());
        }
    }

    public void searchAccount(int num, Human human) {
        for (Accounts accounts : human.getAccountsList()) {
            if (accounts.getNumAccount() == num) {
                System.out.println("Номер счёта: " + accounts.getNumAccount());
                System.out.println("Сумма на счёте: " + accounts.getAmountOfMoney());
                System.out.println("Статус: " + accounts.getStatus());
            }
        }
    }

    public int sumMoney() {
        int sum = 0;
        for (Accounts accounts : human.getAccountsList()) {
            if (accounts.getStatus().equals("Разблокирован")) {
                sum += accounts.getAmountOfMoney();
            }
        }
        return sum;
    }

    public int sumMoneyByAccounts() {
        int sum = 0;
        for (Accounts accounts : human.getAccountsList()) {
            for (NewAccounts newAccounts : human.getNewAccountsList()) {
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
        for (Accounts accounts : human.getAccountsList()) {
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
        for (Accounts accounts : human.getAccountsList()) {
            if (accounts.getAmountOfMoney() < 0) {
                if (accounts.getStatus().equals("Разблокирован")) {
                    sum += accounts.getAmountOfMoney();
                }
            }
        }
        return sum;
    }

    public void swapStatus(int num) {
        for (Accounts accounts : human.getAccountsList()) {
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
