package copmarator;

import account.Accounts;

import java.util.Comparator;

public class ComparatorClass {

    static public class SortByCountComparator implements Comparator<Accounts> {

        @Override
        public int compare(Accounts o1, Accounts o2) {
            return o1.getNumAccount() - o2.getNumAccount();
        }
    }

    static public class SortByAmountComparator implements Comparator<Accounts> {

        @Override
        public int compare(Accounts o1, Accounts o2) {
            return o1.getAmountOfMoney() - o2.getAmountOfMoney();
        }
    }
}
