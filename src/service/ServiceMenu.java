package service;

import account.Accounts;
import account.Human;
import account.NewAccounts;
import util.Util;

public class ServiceMenu {

    final Util util = new Util();
    final ServiceHuman serviceHuman = new ServiceHuman();
    private Human human = new Human();

    public int menu() {
        System.out.println("Выберите команду:\n" +
                "0 - выход\n" +
                "1 - Добавить счёт\n" +
                "2 - Поиск по номеру счёта\n" +
                "3 - Сортировка счёта по номеру\n" +
                "4 - Сортировка счёта по сумме денег\n" +
                "5 - Сумма денег на всех счётах\n" +
                "6 - Сумма денег на выбраных счетах\n" +
                "7 - Сумма положительных счетов\n" +
                "8 - Сумма отрицательных счетов\n" +
                "9 - Возможность блокировки/разблокировки счета");
        while (true) {
            int choice = util.readIntFromConsole();
            if (choice < 0 || choice > 9) {
                continue;
            } else {
                return choice;
            }
        }
    }

    public void programExecution(int choice){
        switch (choice) {
            case 1:
                System.out.println("Введите номер счёта и сумму денег которая хранится на счёте через enter");
                human.getAccountsList().add(new Accounts(util.readIntFromConsole(), util.readIntFromConsole()));
                break;
            case 2:
                System.out.println("Введите номер счёта");
                int num = util.readIntFromConsole();
                serviceHuman.searchAccount(num, human);
                break;
            case 3:
                serviceHuman.sortByCount();
                serviceHuman.print();
                break;
            case 4:
                serviceHuman.sortByAmount();
                serviceHuman.print();
                break;
            case 5:
                System.out.println("Сумма денег на счетах: " + serviceHuman.sumMoney());
                break;
            case 6:
                serviceHuman.print();
                while (true) {
                    System.out.println("1 - добавить счёт\n" +
                            "0 - показать сумму\n" +
                            "Любая другая цифра,выход");
                    choice = util.readIntFromConsole();
                    if (choice == 1) {
                        System.out.println("Введите номер счёта");
                        human.getNewAccountsList().add(new NewAccounts(util.readIntFromConsole()));
                        continue;
                    }
                    if (choice == 0) {
                        System.out.println("Сумма счетов = " + serviceHuman.sumMoneyByAccounts());
                        continue;
                    }
                    if (choice != 1 || choice != 0) {
                        human.getNewAccountsList().clear();
                        break;
                    }
                }
            case 7:
                serviceHuman.sumOfPositiveBills();
                break;
            case 8:
                serviceHuman.sumOfNegativeBills();
                break;
            case 9:
                serviceHuman.print();
                System.out.println("Введите номер счёта");
                num = util.readIntFromConsole();
                System.out.println("0 - поменять статус\n" +
                        "[1-9] - выход\n" +
                        "ЗАБЛОКИРОВАННЫЕ СЧЕТА НЕ ПРИНИМАЮТ УЧАСТИЕ В ВЫЧЕСЛИТЕЛЬНЫХ ОПЕРАЦИЯХ");
                choice = util.readIntFromConsole();
                if (choice == 0) {
                    serviceHuman.swapStatus(num);
                } else {
                    break;
                }
        }
    }
}
