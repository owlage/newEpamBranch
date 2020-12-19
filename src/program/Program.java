package program;

import ServiceMenu.Menu;
import country.Country;

public class Program {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Country country = new Country(menu.addCountryName(), menu.addCapital());
        while (true) {
            int number = menu.menu();
            if (number != 0) {
                menu.commandExecution(number,country);
            } else {
                break;
            }
        }
    }
}
