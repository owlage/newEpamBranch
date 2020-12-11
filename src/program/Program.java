package program;

import ServiceMenu.Menu;

public class Program {

    public static void main(String[] args) {
        Menu menu = new Menu();
        while (true) {
            int number = menu.menu();
            if (number != 0) {
                menu.commandExecution(number);
            } else {
                break;
            }
        }
    }
}
