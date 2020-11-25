package vouchers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Voucher {

    private VoucherType voucherType;
    private DescriptionVouchers tourDescription;

//    private List<Excursion> excursionList;
//    private List<Cruse> cruseList;
//    private List<Recreation> recreationList;
//    private List<Shopping> shoppingList;
//    private List<Treatment> treatmentList;

    public VoucherType getVoucherType() {
        return voucherType;
    }

    public void setVoucherType(VoucherType voucherType) {
        this.voucherType = voucherType;
    }

    public DescriptionVouchers getTourDescription() {
        return tourDescription;
    }

    public void setTourDescription(DescriptionVouchers tourDescription) {
        this.tourDescription = tourDescription;
    }

    //
//    public List<Treatment> getTreatmentList() {
//        return treatmentList;
//    }
//
//    public void setTreatmentList(List<Treatment> treatmentList) {
//        this.treatmentList = treatmentList;
//    }
//
//    public List<Shopping> getShoppingList() {
//        return shoppingList;
//    }
//
//    public void setShoppingList(List<Shopping> shoppingList) {
//        this.shoppingList = shoppingList;
//    }
//
//    public List<Recreation> getRecreationList() {
//        return recreationList;
//    }
//
//    public void setRecreationList(List<Recreation> recreationList) {
//        this.recreationList = recreationList;
//    }
//
//    public List<Cruse> getCruseList() {
//        return cruseList;
//    }
//
//    public void setCruseList(List<Cruse> cruseList) {
//        this.cruseList = cruseList;
//    }
//
//    public List<Excursion> getExcursionList() {
//        return excursionList;
//    }
//
//    public void setExcursionList(List<Excursion> excursionList) {
//        this.excursionList = excursionList;
//    }
//
    public Voucher(VoucherType voucherType) {
        this.voucherType = voucherType;
    }


    //TODO: move to service
    public void showAllTours() {
        for (Excursion excursion : getExcursionList()) {
            for (DescriptionVouchers descriptionVouchers : excursion.getDescriptionVouchersList()) {
                System.out.print(excursion.getType() + "| ");
                System.out.println(descriptionVouchers.toString());
            }
        }
        for (Cruse cruse : getCruseList()) {
            for (DescriptionVouchers descriptionVouchers : cruse.getDescriptionVouchersList()) {
                System.out.print(cruse.getType() + "| ");
                System.out.println(descriptionVouchers.toString());
            }
        }
        for (Recreation recreation : getRecreationList()) {
            for (DescriptionVouchers descriptionVouchers : recreation.getDescriptionVouchersList()) {
                System.out.print(recreation.getType() + "| ");
                System.out.println(descriptionVouchers.toString());
            }
        }
        for (Shopping shopping : getShoppingList()) {
            for (DescriptionVouchers descriptionVouchers : shopping.getDescriptionVouchersList()) {
                System.out.print(shopping.getType() + "| ");
                System.out.println(descriptionVouchers.toString());
            }
        }

        for (Treatment treatment: getTreatmentList()) {
            for (DescriptionVouchers descriptionVouchers: treatment.getDescriptionVouchersList()) {
                System.out.print(treatment.getType() + "| ");
                System.out.println(descriptionVouchers.toString());
            }
        }
    }

    public void voucherSearch(String str, boolean bool, int num) {
        for (Excursion excursion : getExcursionList()) {
            for (DescriptionVouchers descriptionVouchers : excursion.getDescriptionVouchersList()) {
                if (descriptionVouchers.getTransport().equals(str)) {
                    if (descriptionVouchers.isFood() == bool) {
                        if (descriptionVouchers.getNumbersOfDay() == num) {
                            System.out.print(excursion.getType() + "| ");
                            System.out.println(descriptionVouchers.toString());
                        }
                    }
                }
            }
        }
        for (Cruse cruse : getCruseList()) {
            for (DescriptionVouchers descriptionVouchers : cruse.getDescriptionVouchersList()) {
                if (descriptionVouchers.getTransport().equals(str)) {
                    if (descriptionVouchers.isFood() == bool) {
                        if (descriptionVouchers.getNumbersOfDay() == num) {
                            System.out.print(cruse.getType() + "| ");
                            System.out.println(descriptionVouchers.toString());
                        }
                    }
                }
            }
        }
        for (Recreation recreation : getRecreationList()) {
            for (DescriptionVouchers descriptionVouchers : recreation.getDescriptionVouchersList()) {
                if (descriptionVouchers.getTransport().equals(str)) {
                    if (descriptionVouchers.isFood() == bool) {
                        if (descriptionVouchers.getNumbersOfDay() == num) {
                            System.out.print(recreation.getType() + "| ");
                            System.out.println(descriptionVouchers.toString());
                        }
                    }
                }
            }
        }
        for (Shopping shopping : getShoppingList()) {
            for (DescriptionVouchers descriptionVouchers : shopping.getDescriptionVouchersList()) {
                if (descriptionVouchers.getTransport().equals(str)) {
                    if (descriptionVouchers.isFood() == bool) {
                        if (descriptionVouchers.getNumbersOfDay() == num) {
                            System.out.print(shopping.getType() + "| ");
                            System.out.println(descriptionVouchers.toString());
                        }
                    }
                }
            }
        }
        for (Treatment treatment : getTreatmentList()) {
            for (DescriptionVouchers descriptionVouchers : treatment.getDescriptionVouchersList()) {
                if (descriptionVouchers.getTransport().equals(str)) {
                    if (descriptionVouchers.isFood() == bool) {
                        if (descriptionVouchers.getNumbersOfDay() == num) {
                            System.out.print(treatment.getType() + "| ");
                            System.out.println(descriptionVouchers.toString());
                        }
                    }
                }
            }
        }
    }
}
