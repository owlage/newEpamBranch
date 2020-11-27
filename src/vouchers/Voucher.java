package vouchers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Voucher {

    private VoucherType voucherType;
    private DescriptionVouchers tourDescription;

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

    public Voucher(VoucherType voucherType) {
        this.voucherType = voucherType;
    }
}

