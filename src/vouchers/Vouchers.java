package vouchers;

import java.util.ArrayList;
import java.util.List;

public class Vouchers {

    private List<Excursions> excursionsList;
    private List<Cruse> cruseList;
    private List<Recreation> recreationList;
    private List<Shopping> shoppingList;
    private List<Treatment> treatmentList;

    public List<Treatment> getTreatmentList() {
        return treatmentList;
    }

    public void setTreatmentList(List<Treatment> treatmentList) {
        this.treatmentList = treatmentList;
    }

    public List<Shopping> getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(List<Shopping> shoppingList) {
        this.shoppingList = shoppingList;
    }

    public List<Recreation> getRecreationList() {
        return recreationList;
    }

    public void setRecreationList(List<Recreation> recreationList) {
        this.recreationList = recreationList;
    }

    public List<Cruse> getCruseList() {
        return cruseList;
    }

    public void setCruseList(List<Cruse> cruseList) {
        this.cruseList = cruseList;
    }

    public List<Excursions> getExcursionsList() {
        return excursionsList;
    }

    public void setExcursionsList(List<Excursions> excursionsList) {
        this.excursionsList = excursionsList;
    }

    public Vouchers() {
        excursionsList = new ArrayList<>();
        cruseList = new ArrayList<>();
        recreationList = new ArrayList<>();
        shoppingList = new ArrayList<>();
        treatmentList = new ArrayList<>();
    }

    public void showAllTours() {
        for (Excursions excursions : getExcursionsList()) {
            for (DescriptionVouchers descriptionVouchers : excursions.getDescriptionVouchersList()) {
                System.out.print(excursions.getType() + "| ");
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
    }

    public void voucherSearch(String str, boolean bool, int num) {
        for (Excursions excursions : getExcursionsList()) {
            for (DescriptionVouchers descriptionVouchers : excursions.getDescriptionVouchersList()) {
                if (descriptionVouchers.getTransport().equals(str)) {
                    if (descriptionVouchers.isFood() == bool) {
                        if (descriptionVouchers.getNumbersOfDay() == num) {
                            System.out.print(excursions.getType() + "| ");
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
    }
}
