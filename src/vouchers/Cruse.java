package vouchers;

import java.util.ArrayList;
import java.util.List;

public class Cruse {

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

    public Cruse(DescriptionVouchers descriptionVouchers) {
        type = "Cruise";
        descriptionVouchersList = new ArrayList<>();
        descriptionVouchersList.add(descriptionVouchers);
    }

}
