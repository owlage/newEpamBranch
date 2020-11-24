package vouchers;

public class FillInVouchers {

    public Vouchers FillInVouchers() {
        Vouchers vouchers = new Vouchers();
        vouchers.getExcursionsList().add(new Excursions(new DescriptionVouchers("bus", false,
                        3)));
        vouchers.getExcursionsList().add(new Excursions(new DescriptionVouchers("bus", false,
                        4)));
        vouchers.getExcursionsList().add(new Excursions(new DescriptionVouchers("bus", false,
                        5)));
        vouchers.getExcursionsList().add(new Excursions(new DescriptionVouchers("bus", false,
                        6)));

        vouchers.getCruseList().add(new Cruse(new DescriptionVouchers("ship", true, 7)));
        vouchers.getCruseList().add(new Cruse(new DescriptionVouchers("ship", true, 11)));
        vouchers.getCruseList().add(new Cruse(new DescriptionVouchers("ship", true, 15)));
        vouchers.getCruseList().add(new Cruse(new DescriptionVouchers("ship", true, 20)));

        vouchers.getRecreationList().add(new Recreation(new DescriptionVouchers("bus", false,
                        7)));
        vouchers.getRecreationList().add(new Recreation(new DescriptionVouchers("train", false,
                        7)));
        vouchers.getRecreationList().add(new Recreation(new DescriptionVouchers("ship", false,
                        7)));
        vouchers.getRecreationList().add(new Recreation(new DescriptionVouchers("airplane", true,
                        11)));


        vouchers.getShoppingList().add(new Shopping(new DescriptionVouchers("bus", false, 2)));
        vouchers.getShoppingList().add(new Shopping(new DescriptionVouchers("train", true,
                        4)));
        vouchers.getShoppingList().add(new Shopping(new DescriptionVouchers("bus", false, 2)));
        vouchers.getShoppingList().add(new Shopping(new DescriptionVouchers("airplane", true,
                        4)));


        vouchers.getTreatmentList().add(new Treatment(new DescriptionVouchers("bus", false,
                        7)));
        vouchers.getTreatmentList().add(new Treatment(new DescriptionVouchers("train", false,
                        7)));
        vouchers.getTreatmentList().add(new Treatment(new DescriptionVouchers("ship", false,
                        7)));
        vouchers.getTreatmentList().add(new Treatment(new DescriptionVouchers("airplane", false,
                        7)));

        return vouchers;
    }
}
