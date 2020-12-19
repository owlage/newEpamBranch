package Program;

import directory.Directory;
import service.ServiceMenu;

public class Program {

    public static void main(String[] args) {
        ServiceMenu serviceMenu = new ServiceMenu();
        Directory directory = new Directory("DIR");
        while (true){
            int choice = serviceMenu.menu();
            if(choice != 0){
                serviceMenu.programExecution(choice, directory);
            } else {
                break;
            }
        }

    }
}
