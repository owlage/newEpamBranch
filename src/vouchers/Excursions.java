package vouchers;

import java.util.ArrayList;
import java.util.List;

public class Excursions {

    private String type;
    private List<DescriptionVouchers> descriptionVouchersList;

    public String getType() {
        return type;
    }

    public List<DescriptionVouchers> getDescriptionVouchersList() {
        return descriptionVouchersList;
    }

    public void setDescriptionVouchersList(List<DescriptionVouchers> descriptionVouchersList) {
        this.descriptionVouchersList = descriptionVouchersList;
    }

    public Excursions(DescriptionVouchers descriptionVouchers) {
        type = "Excursion";
        descriptionVouchersList = new ArrayList<>();
        descriptionVouchersList.add(descriptionVouchers);
    }

}
