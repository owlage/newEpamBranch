package program;

import decimal.Decimal;
import service.Service;

public class Program {

    public static void main(String[] args) {
        Service service = new Service();
        Decimal decimal = (Decimal) service.obCounter();
        while (true) {
            char operation = service.showMenuAndMakeChoice();
            if (operation != '/') {
                service.menuShow(operation, decimal);
            } else {
                break;
            }
        }
    }
}
