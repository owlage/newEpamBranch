package programs;


import account.Accounts;
import account.Human;
import account.NewAccounts;
import util.Util;

import java.util.Scanner;

public class Program {

    private void showMenu() {
        Util util = new Util();
        Scanner sc = new Scanner(System.in);
        Human human = new Human();
        int choice;
        while (true) {
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

            choice = util.readIntFromConsole();
            if (choice == 0) {
                break;
            }
            if (choice < 1 || choice > 9) {
                System.out.println("Повторите ввод");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("Введите номер счёта и сумму денег которая хранится на счёте через enter");
                    human.getAccountsList().add(new Accounts(util.readIntFromConsole(), util.readIntFromConsole()));
                    break;
                case 2:
                    System.out.println("Введите номер счёта");
                    int num = util.readIntFromConsole();
                    human.searchAccount(num);
                    break;
                case 3:
                    human.sortByCount();
                    human.print();
                    break;
                case 4:
                    human.sortByAmount();
                    human.print();
                    break;
                case 5:
                    System.out.println("Сумма денег на счетах: " + human.sumMoney());
                    break;
                case 6:
                    human.print();
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
                            System.out.println("Сумма счетов = " + human.sumMoneyByAccounts());
                            continue;
                        }
                        if (choice != 1 || choice != 0) {
                            human.getNewAccountsList().clear();
                            break;
                        }
                    }
                case 7:
                    human.sumOfPositiveBills();
                    break;
                case 8:
                    human.sumOfNegativeBills();
                    break;
                case 9:
                    human.print();
                    System.out.println("Введите номер счёта");
                    num = util.readIntFromConsole();
                    System.out.println("0 - поменять статус\n" +
                            "[1-9] - выход\n" +
                            "ЗАБЛОКИРОВАННЫЕ СЧЕТА НЕ ПРИНИМАЮТ УЧАСТИЕ В ВЫЧЕСЛИТЕЛЬНЫХ ОПЕРАЦИЯХ");
                    choice = util.readIntFromConsole();
                    if (choice == 0) {
                        human.swapStatus(num);
                    } else {
                        break;
                    }
            }
        }
    }


    public static void main(String[] args) {
        Program program = new Program();
        program.showMenu();
    }
}
