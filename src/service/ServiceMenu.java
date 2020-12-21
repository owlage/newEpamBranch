package service;

import util.Util;
import voucher.Voucher;

import java.util.Collections;
import java.util.List;

public class ServiceMenu {

    private Service service = new Service();
    private Util util = new Util();

    public int menu() {
        System.out.println("Выберите команду:\n" +
                "0 - выход\n" +
                "1 - показать все путевки\n" +
                "2 - выбор тура по: транспорту, питанию, кол - во дней\n" +
                "3 - сортировка по транспотру в алфовитном порядке\n" +
                "4 - сортировка по питанию\n" +
                "5 - сортировка по кол - ву дней");
        while (true) {
            int choice = util.readNumConsole();
            if (choice < 0 || choice > 5) {
                System.out.println("Повторите ввод");
                continue;
            } else {
                return choice;
            }
        }
    }

    public void programExecution(int choice, List<Voucher> vouchers) {
        switch (choice) {
            case 1:
                service.showAllVouchers(vouchers);
                break;
            case 2:
                System.out.println("введите данные через enter\n" +
                        "выберите транспорт: 1 - bus, 2 - train, 3 - ship, 4 - airplane\n");
                int transport = util.readNumConsole();
                String str;
                if (transport == 1) {
                    str = "bus";
                } else if (transport == 2) {
                    str = "train";
                } else if (transport == 3) {
                    str = "ship";
                } else if (transport == 4) {
                    str = "airplane";
                } else {
                    break;
                }
                System.out.println("нужно ли питание: 1 - true или 2 - false\n");
                choice = util.readNumConsole();
                if (choice == 1) {
                    System.out.println("введите кол - во дней: от 2 до 20");
                    choice = util.readNumConsole();
                    service.searchTour(str, true, choice, vouchers);
                } else if (choice == 2) {
                    System.out.println("введите кол - во дней: от 2 до 20");
                    choice = util.readNumConsole();
                    service.searchTour(str, false, choice, vouchers);
                }
                break;
            case 3:
                Collections.sort(vouchers, new Comparator.VoucherComparatorGetTransport());
                for (Voucher voucher : vouchers) {
                    System.out.print(voucher.getVoucherType() + ": ");
                    System.out.println(voucher.getTourDescription().toString());
                }
                break;
            case 4:
                Collections.sort(vouchers, new Comparator.VoucherComparatorIsFood());
                for (Voucher voucher : vouchers) {
                    System.out.print(voucher.getVoucherType() + ": ");
                    System.out.println(voucher.getTourDescription().toString());
                }
                break;
            case 5:
                Collections.sort(vouchers, new Comparator.VoucherComparatorGetDay());
                for (Voucher voucher : vouchers) {
                    System.out.print(voucher.getVoucherType() + ": ");
                    System.out.println(voucher.getTourDescription().toString());
                }
                break;
        }
    }
}
