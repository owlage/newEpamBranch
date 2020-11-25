package program;

import service.*;
import vouchers.*;

import java.util.*;
import java.util.stream.*;

public class Program {

    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        VoucherService voucherService = new VoucherService();
        List<Voucher> vouchers = voucherService.fillInVouchers();
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
                    voucher.showAllTours();
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
                            voucher.voucherSearch("bus", true, choice);
                        } else if (choice == 2) {
                            System.out.println("введите кол - во дней: от 2 до 20");
                            choice = Util.readNumConsole();
                            voucher.voucherSearch("bus", false, choice);
                        }
                    } else if (choice == 2) {
                        System.out.println("нужно ли питание: 1 - true или 2 - false\n");
                        choice = Util.readNumConsole();
                        if (choice == 1) {
                            System.out.println("введите кол - во дней: от 2 до 20");
                            choice = Util.readNumConsole();
                            voucher.voucherSearch("train", true, choice);
                        } else if (choice == 2) {
                            System.out.println("введите кол - во дней: от 2 до 20");
                            choice = Util.readNumConsole();
                            voucher.voucherSearch("train", false, choice);
                        }
                    } else if (choice == 3) {
                        System.out.println("нужно ли питание: 1 - true или 2 - false\n");
                        choice = Util.readNumConsole();
                        if (choice == 1) {
                            System.out.println("введите кол - во дней: от 2 до 20");
                            choice = Util.readNumConsole();
                            voucher.voucherSearch("ship", true, choice);
                        } else if (choice == 2) {
                            System.out.println("введите кол - во дней: от 2 до 20");
                            choice = Util.readNumConsole();
                            voucher.voucherSearch("ship", false, choice);
                        }
                    } else if (choice == 4) {
                        System.out.println("нужно ли питание: 1 - true или 2 - false\n");
                        choice = Util.readNumConsole();
                        if (choice == 1) {
                            System.out.println("введите кол - во дней: от 2 до 20");
                            choice = Util.readNumConsole();
                            voucher.voucherSearch("airplane", true, choice);
                        } else if (choice == 2) {
                            System.out.println("введите кол - во дней: от 2 до 20");
                            choice = Util.readNumConsole();
                            voucher.voucherSearch("airplane", false, choice);
                        }
                    } else {
                        System.out.println("выберите транспорт");
                        continue;
                    }
                    break;
                case 3:

                    //using java 8 stream api
                   List<Voucher> sorted = vouchers
                           .stream()
                           .sorted(Comparator.comparing(voucher -> voucher.getTourDescription().getTransport()))
                           .collect(Collectors.toList());

                   // TODO: implement any kind of sorting

                   sorted.forEach(System.out::print);

            }
        }
    }

    public static void main(String[] args) {

        Program program = new Program();
        program.showMenu();
    }
}
