package program;

import airline.Airlines;
import service.ServiceAirlines;
import service.ServiceMenu;

import java.text.ParseException;

public class Program {

    public static void main(String[] args) throws ParseException {
        ServiceMenu serviceMenu = new ServiceMenu();
        Airlines airlines = new Airlines(1);
        ServiceAirlines serviceAirlines = new ServiceAirlines();
        while (true) {
            int number = serviceMenu.menu();
            if (number != 0) {
                serviceMenu.programExecution(number, airlines, serviceAirlines);
            } else {
                break;
            }
        }
    }
}
