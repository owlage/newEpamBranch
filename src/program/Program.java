package program;

import vouchers.*;

import java.util.Scanner;

public class Program {

    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        FillInVouchers fillInVouchers = new FillInVouchers();
        Vouchers vouchers = fillInVouchers.FillInVouchers();
        while (true) {
            System.out.println("Выберите команду:\n" +
                    "0 - выход\n" +
                    "1 - показать все путевки\n" +
                    "2 - выбор тура по: транспорту, питанию, кол - во дней\n" +
                    "3 - сортировка по транспотру в алфовитном порядке\n" +
                    "4 - сортировка по питанию\n" +
                    "5 - сортировка по кол - ву дней");

            int choice = Util.readNumConsole();
            if (choice == 0) {
                break;
            }
            if (choice < 1 || choice > 5) {
                System.out.println("Повторите ввод");
                continue;
            }
            switch (choice) {
                case 1:
                    vouchers.showAllTours();
                    break;
                case 2:
                    System.out.println("введите данные через enter\n" +
                            "выберите транспорт: 1 - bus, 2 - train, 3 - ship, 4 - airplane\n");
                    choice = Util.readNumConsole();
                    if (choice == 1) {
                        System.out.println("нужно ли питание: 1 - true или 2 - false\n");
                        choice = Util.readNumConsole();
                        if (choice == 1) {
                            System.out.println("введите кол - во дней: от 2 до 20");
                            choice = Util.readNumConsole();
                            vouchers.voucherSearch("bus", true, choice);
                        } else if (choice == 2) {
                            System.out.println("введите кол - во дней: от 2 до 20");
                            choice = Util.readNumConsole();
                            vouchers.voucherSearch("bus", false, choice);
                        }
                    } else if (choice == 2) {
                        System.out.println("нужно ли питание: 1 - true или 2 - false\n");
                        choice = Util.readNumConsole();
                        if (choice == 1) {
                            System.out.println("введите кол - во дней: от 2 до 20");
                            choice = Util.readNumConsole();
                            vouchers.voucherSearch("train", true, choice);
                        } else if (choice == 2) {
                            System.out.println("введите кол - во дней: от 2 до 20");
                            choice = Util.readNumConsole();
                            vouchers.voucherSearch("train", false, choice);
                        }
                    } else if (choice == 3) {
                        System.out.println("нужно ли питание: 1 - true или 2 - false\n");
                        choice = Util.readNumConsole();
                        if (choice == 1) {
                            System.out.println("введите кол - во дней: от 2 до 20");
                            choice = Util.readNumConsole();
                            vouchers.voucherSearch("ship", true, choice);
                        } else if (choice == 2) {
                            System.out.println("введите кол - во дней: от 2 до 20");
                            choice = Util.readNumConsole();
                            vouchers.voucherSearch("ship", false, choice);
                        }
                    } else if (choice == 4) {
                        System.out.println("нужно ли питание: 1 - true или 2 - false\n");
                        choice = Util.readNumConsole();
                        if (choice == 1) {
                            System.out.println("введите кол - во дней: от 2 до 20");
                            choice = Util.readNumConsole();
                            vouchers.voucherSearch("airplane", true, choice);
                        } else if (choice == 2) {
                            System.out.println("введите кол - во дней: от 2 до 20");
                            choice = Util.readNumConsole();
                            vouchers.voucherSearch("airplane", false, choice);
                        }
                    } else {
                        System.out.println("выберите транспорт");
                        continue;
                    }
                    break;
                case 3:

            }
        }
    }

    public static void main(String[] args) {

        Program program = new Program();
        program.showMenu();
    }
}
