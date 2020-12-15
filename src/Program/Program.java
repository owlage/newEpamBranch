package Program;

import service.ServiceMenu;

public class Program {

    public static void main(String[] args) {
        ServiceMenu serviceMenu = new ServiceMenu();
        while (true){
            int choice = serviceMenu.menu();
            if(choice != 0){
                serviceMenu.programExecution(choice);
            } else {
                break;
            }
        }

    }
}
