package program;

import service.ServiceMenu;
import service.VoucherService;
import voucher.Voucher;

import java.util.List;

public class Program {

    public static void main(String[] args) {
        ServiceMenu serviceMenu = new ServiceMenu();
        VoucherService voucherService = new VoucherService();
        List<Voucher> vouchers = voucherService.fillInVouchers();
        while (true){
            int number = serviceMenu.menu();
            if(number != 0){
                serviceMenu.programExecution(number,vouchers);
            } else {
                break;
            }
        }
    }
}
