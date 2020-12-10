package program;

import service.ServiceMenu;

public class Program {

    public static void main(String[] args) {
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
