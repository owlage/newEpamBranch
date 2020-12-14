package service;

import voucher.Voucher;

import java.util.List;

public class Service {

    public void showAllVouchers(List<Voucher> vouchers) {
        for (Voucher voucher : vouchers) {
            System.out.print(voucher.getVoucherType() + ": ");
            System.out.println(voucher.getTourDescription().toString());
        }
    }

    public void searchTour(String str, boolean bool, int num, List<Voucher> vouchers) {
        int number = 0;
        for (Voucher voucher : vouchers) {
            if (voucher.getTourDescription().getTransport() == str) {
                if (voucher.getTourDescription().isFood() == bool) {
                    if (voucher.getTourDescription().getNumbersOfDay() == num) {
                        number++;
                        System.out.print(voucher.getVoucherType() + ": ");
                        System.out.println(voucher.getTourDescription().toString());
                    }
                }
            }
        }
        if (number == 0) {
            System.out.println("По вашему запросу ничего не найдено, туры которые могут вам понравиться:");
            for (Voucher voucher : vouchers) {
                if (voucher.getTourDescription().getTransport() == str) {
                    if (voucher.getTourDescription().isFood() == bool) {
                        System.out.print(voucher.getVoucherType() + ": ");
                        System.out.println(voucher.getTourDescription().toString());
                    }
                }
            }
        }
    }
}
