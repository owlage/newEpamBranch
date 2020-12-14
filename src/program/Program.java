package program;

import decimal.Decimal;
import service.MenuDecimal;
import service.Service;

public class Program {

    public static void main(String[] args) {
        Service service = new Service();
        MenuDecimal menuDecimal = new MenuDecimal();
        Decimal decimal = (Decimal) service.assignmentOfBoundaries();
        while (true) {
            char operation = menuDecimal.showMenuAndMakeChoice();
            if (operation != '/') {
                service.counterResult(operation, decimal);
            } else {
                break;
            }
        }
    }
}
