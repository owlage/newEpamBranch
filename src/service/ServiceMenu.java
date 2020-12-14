package service;

import account.Accounts;
import account.Human;
import account.NewAccounts;
import util.Util;

public class ServiceMenu {

    final Util util = new Util();
    final ServiceHuman serviceHuman = new ServiceHuman();

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

    public void programExecution(int choice, Human human){
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
                serviceHuman.sortByCount(human);
                serviceHuman.print(human);
                break;
            case 4:
                serviceHuman.sortByAmount(human);
                serviceHuman.print(human);
                break;
            case 5:
                System.out.println("Сумма денег на счетах: " + serviceHuman.sumMoney(human));
                break;
            case 6:
                serviceHuman.print(human);
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
                        System.out.println("Сумма счетов = " + serviceHuman.sumMoneyByAccounts(human));
                        continue;
                    }
                    if (choice != 1 || choice != 0) {
                        human.getNewAccountsList().clear();
                        break;
                    }
                }
            case 7:
                System.out.println("Сумма положительных счетов: " + serviceHuman.sumOfPositiveBills(human));
                break;
            case 8:
                System.out.println("Сумма отрицательных счетов: " + serviceHuman.sumOfNegativeBills(human));
                break;
            case 9:
                serviceHuman.print(human);
                System.out.println("Введите номер счёта");
                num = util.readIntFromConsole();
                System.out.println("0 - поменять статус\n" +
                        "[1-9] - выход\n" +
                        "ЗАБЛОКИРОВАННЫЕ СЧЕТА НЕ ПРИНИМАЮТ УЧАСТИЕ В ВЫЧЕСЛИТЕЛЬНЫХ ОПЕРАЦИЯХ");
                choice = util.readIntFromConsole();
                if (choice == 0) {
                    serviceHuman.swapStatus(num,human);
                } else {
                    break;
                }
        }
    }
}
