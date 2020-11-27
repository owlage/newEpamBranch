package service;

import vouchers.DescriptionVouchers;
import vouchers.Voucher;
import vouchers.VoucherType;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VoucherService {

    public List<Voucher> fillInVouchers() {

        List<Voucher> voucherList = new ArrayList<>();

        Voucher treatmentVoucher1 = new Voucher(VoucherType.TREATMENT);
        treatmentVoucher1.setTourDescription(new DescriptionVouchers("bus", true, 3));
        voucherList.add(treatmentVoucher1);

        Voucher treatmentVoucher2 = new Voucher(VoucherType.TREATMENT);
        treatmentVoucher2.setTourDescription(new DescriptionVouchers("train", true, 4));
        voucherList.add(treatmentVoucher2);

        Voucher treatmentVoucher3 = new Voucher(VoucherType.TREATMENT);
        treatmentVoucher3.setTourDescription(new DescriptionVouchers("train", true, 5));
        voucherList.add(treatmentVoucher3);

        Voucher treatmentVoucher4 = new Voucher(VoucherType.TREATMENT);
        treatmentVoucher4.setTourDescription(new DescriptionVouchers("bus", true, 6));
        voucherList.add(treatmentVoucher4);

        Voucher vacationVoucher1 = new Voucher(VoucherType.VACATION);
        vacationVoucher1.setTourDescription(new DescriptionVouchers("airplane", true, 7));
        voucherList.add(vacationVoucher1);

        Voucher vacationVoucher2 = new Voucher(VoucherType.VACATION);
        vacationVoucher2.setTourDescription(new DescriptionVouchers("airplane", true, 11));
        voucherList.add(vacationVoucher2);

        Voucher vacationVoucher3 = new Voucher(VoucherType.VACATION);
        vacationVoucher3.setTourDescription(new DescriptionVouchers("ship", true, 7));
        voucherList.add(vacationVoucher3);

        Voucher vacationVoucher4 = new Voucher(VoucherType.VACATION);
        vacationVoucher4.setTourDescription(new DescriptionVouchers("train", false, 11));
        voucherList.add(vacationVoucher4);

        Voucher cruiseVoucher1 = new Voucher(VoucherType.CRUISE);
        cruiseVoucher1.setTourDescription(new DescriptionVouchers("ship", true, 7));
        voucherList.add(cruiseVoucher1);

        Voucher cruiseVoucher2 = new Voucher(VoucherType.CRUISE);
        cruiseVoucher2.setTourDescription(new DescriptionVouchers("ship", true, 11));
        voucherList.add(cruiseVoucher2);

        Voucher cruiseVoucher3 = new Voucher(VoucherType.CRUISE);
        cruiseVoucher3.setTourDescription(new DescriptionVouchers("ship", true, 15));
        voucherList.add(cruiseVoucher3);

        Voucher cruiseVoucher4 = new Voucher(VoucherType.CRUISE);
        cruiseVoucher4.setTourDescription(new DescriptionVouchers("ship", true, 20));
        voucherList.add(cruiseVoucher4);

        Voucher shoppingVoucher1 = new Voucher(VoucherType.SHOPPING);
        shoppingVoucher1.setTourDescription(new DescriptionVouchers("bus", false, 1));
        voucherList.add(shoppingVoucher1);

        Voucher shoppingVoucher2 = new Voucher(VoucherType.SHOPPING);
        shoppingVoucher2.setTourDescription(new DescriptionVouchers("train", false, 2));
        voucherList.add(shoppingVoucher2);

        Voucher shoppingVoucher3 = new Voucher(VoucherType.SHOPPING);
        shoppingVoucher3.setTourDescription(new DescriptionVouchers("airplane", false, 3));
        voucherList.add(shoppingVoucher3);

        Voucher shoppingVoucher4 = new Voucher(VoucherType.SHOPPING);
        shoppingVoucher4.setTourDescription(new DescriptionVouchers("train", false, 4));
        voucherList.add(shoppingVoucher4);

        Voucher excursionVoucher1 = new Voucher(VoucherType.EXCURSION);
        excursionVoucher1.setTourDescription(new DescriptionVouchers("bus", false, 1));
        voucherList.add(excursionVoucher1);

        Voucher excursionVoucher2 = new Voucher(VoucherType.EXCURSION);
        excursionVoucher2.setTourDescription(new DescriptionVouchers("bus", false, 2));
        voucherList.add(excursionVoucher2);

        Voucher excursionVoucher3 = new Voucher(VoucherType.EXCURSION);
        excursionVoucher3.setTourDescription(new DescriptionVouchers("bus", false, 3));
        voucherList.add(excursionVoucher3);

        Voucher excursionVoucher4 = new Voucher(VoucherType.EXCURSION);
        excursionVoucher4.setTourDescription(new DescriptionVouchers("bus", false, 4));
        voucherList.add(excursionVoucher4);

        return voucherList;
    }

    public void showAllVouchers() {
        for (Voucher voucher : fillInVouchers()) {
            System.out.print(voucher.getVoucherType() + ": ");
            System.out.println(voucher.getTourDescription().toString());
        }
    }

    public void searchTour(String str, boolean bool, int num) {
        int number = 0;
        for (Voucher voucher : fillInVouchers()) {
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
            for (Voucher voucher : fillInVouchers()) {
                if (voucher.getTourDescription().getTransport() == str) {
                    if (voucher.getTourDescription().isFood() == bool) {
                        System.out.print(voucher.getVoucherType() + ": ");
                        System.out.println(voucher.getTourDescription().toString());
                    }
                }
            }
        }
    }
    public static class VoucherComparatorGetTransport implements Comparator<Voucher>{

        @Override
        public int compare(Voucher o1, Voucher o2) {
            return o1.getTourDescription().getTransport().compareTo(o2.getTourDescription().getTransport());
        }
    }

    public static class VoucherComparatorIsFood implements Comparator<Voucher>{

        @Override
        public int compare(Voucher o1, Voucher o2) {
            if(o1.getTourDescription().isFood() && !o2.getTourDescription().isFood()){
                return 1;
            }
            else if(!o1.getTourDescription().isFood() && o2.getTourDescription().isFood()){
                return -1;
            } else {
                return 0;
            }
        }
    }

    public static class VoucherComparatorGetDay implements Comparator<Voucher>{

        @Override
        public int compare(Voucher o1, Voucher o2) {
            return o1.getTourDescription().getNumbersOfDay() - o2.getTourDescription().getNumbersOfDay();
        }
    }
}

