package service;

import voucher.Voucher;

public class Comparator {

    public static class VoucherComparatorIsFood implements java.util.Comparator<Voucher> {

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

    public static class VoucherComparatorGetDay implements java.util.Comparator<Voucher> {

        @Override
        public int compare(Voucher o1, Voucher o2) {
            return o1.getTourDescription().getNumbersOfDay() - o2.getTourDescription().getNumbersOfDay();
        }
    }

    public static class VoucherComparatorGetTransport implements java.util.Comparator<Voucher> {

        @Override
        public int compare(Voucher o1, Voucher o2) {
            return o1.getTourDescription().getTransport().compareTo(o2.getTourDescription().getTransport());
        }
    }
}
