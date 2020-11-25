package service;

import vouchers.*;

import java.util.*;

public class VoucherService {

    public List<Voucher> fillInVouchers() {

        List<Voucher> voucherList = new ArrayList<>();

        Voucher treatmentVoucher1 = new Voucher(VoucherType.TREATMENT);
        treatmentVoucher1.setTourDescription(new DescriptionVouchers("bus", false, 3));
        voucherList.add(treatmentVoucher1);

        Voucher treatmentVoucher2 = new Voucher(VoucherType.TREATMENT);
        treatmentVoucher1.setTourDescription(new DescriptionVouchers("bus", false, 4));
        voucherList.add(treatmentVoucher2);


//        Voucher voucher = new Voucher();
//        voucher.getExcursionList().add(new Excursion(new DescriptionVouchers("bus", false,
//                3)));
//        voucher.getExcursionList().add(new Excursion(new DescriptionVouchers("bus", false,
//                4)));
//        voucher.getExcursionList().add(new Excursion(new DescriptionVouchers("bus", false,
//                5)));
//        voucher.getExcursionList().add(new Excursion(new DescriptionVouchers("bus", false,
//                6)));
//
//        voucher.getCruseList().add(new Cruse(new DescriptionVouchers("ship", true, 7)));
//        voucher.getCruseList().add(new Cruse(new DescriptionVouchers("ship", true, 11)));
//        voucher.getCruseList().add(new Cruse(new DescriptionVouchers("ship", true, 15)));
//        voucher.getCruseList().add(new Cruse(new DescriptionVouchers("ship", true, 20)));
//
//        voucher.getRecreationList().add(new Recreation(new DescriptionVouchers("bus", false,
//                7)));
//        voucher.getRecreationList().add(new Recreation(new DescriptionVouchers("train", false,
//                7)));
//        voucher.getRecreationList().add(new Recreation(new DescriptionVouchers("ship", false,
//                7)));
//        voucher.getRecreationList().add(new Recreation(new DescriptionVouchers("airplane", true,
//                11)));
//
//
//        voucher.getShoppingList().add(new Shopping(new DescriptionVouchers("bus", false, 2)));
//        voucher.getShoppingList().add(new Shopping(new DescriptionVouchers("train", true,
//                4)));
//        voucher.getShoppingList().add(new Shopping(new DescriptionVouchers("bus", false, 2)));
//        voucher.getShoppingList().add(new Shopping(new DescriptionVouchers("airplane", true,
//                4)));
//
//
//        voucher.getTreatmentList().add(new Treatment(new DescriptionVouchers("bus", false,
//                7)));
//        voucher.getTreatmentList().add(new Treatment(new DescriptionVouchers("train", false,
//                7)));
//        voucher.getTreatmentList().add(new Treatment(new DescriptionVouchers("ship", false,
//                7)));
//        voucher.getTreatmentList().add(new Treatment(new DescriptionVouchers("airplane", false,
//                7)));
//
//        return voucher;
    }
}
