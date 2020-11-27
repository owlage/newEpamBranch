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
                    voucherService.showAllVouchers();
                    break;
                case 2:
                    System.out.println("введите данные через enter\n" +
                            "выберите транспорт: 1 - bus, 2 - train, 3 - ship, 4 - airplane\n");
                    int transport = Util.readNumConsole();
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
                        continue;
                    }
                    System.out.println("нужно ли питание: 1 - true или 2 - false\n");
                    choice = Util.readNumConsole();
                    if (choice == 1) {
                        System.out.println("введите кол - во дней: от 2 до 20");
                        choice = Util.readNumConsole();
                        voucherService.searchTour(str, true, choice);
                    } else if (choice == 2) {
                        System.out.println("введите кол - во дней: от 2 до 20");
                        choice = Util.readNumConsole();
                        voucherService.searchTour(str, false, choice);
                    }
                case 3:
                    Collections.sort(vouchers, new VoucherService.VoucherComparatorGetTransport());
                    for (Voucher voucher : vouchers) {
                        System.out.print(voucher.getVoucherType() + ": ");
                        System.out.println(voucher.getTourDescription().toString());
                    }
                case 4:
                    Collections.sort(vouchers, new VoucherService.VoucherComparatorIsFood());
                    for (Voucher voucher : vouchers) {
                        System.out.print(voucher.getVoucherType() + ": ");
                        System.out.println(voucher.getTourDescription().toString());
                    }
                case 5:
                    Collections.sort(vouchers, new VoucherService.VoucherComparatorGetDay());
                    for (Voucher voucher : vouchers) {
                        System.out.print(voucher.getVoucherType() + ": ");
                        System.out.println(voucher.getTourDescription().toString());
                    }
            }
        }
    }

    public static void main(String[] args) {

        Program program = new Program();
        program.showMenu();
    }
}
