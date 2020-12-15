package program;

import service.ServiceMenu;

import java.text.ParseException;

public class Program {

    public static void main(String[] args) throws ParseException {
        ServiceMenu serviceMenu = new ServiceMenu();
        while (true) {
            int number = serviceMenu.menu();
            if (number != 0) {
                serviceMenu.programExecution(number);
            } else {
                break;
            }
        }
    }
}
