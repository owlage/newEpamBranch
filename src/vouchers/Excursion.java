package vouchers;

import java.util.ArrayList;
import java.util.List;

public class Excursion {

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

    public Excursion(DescriptionVouchers descriptionVouchers) {
        type = "Excursion";
        descriptionVouchersList = new ArrayList<>();
        descriptionVouchersList.add(descriptionVouchers);
    }

}
