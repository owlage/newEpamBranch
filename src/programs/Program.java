package programs;

import account.Human;
import service.ServiceMenu;

public class Program {

    public static void main(String[] args) {

        ServiceMenu serviceMenu = new ServiceMenu();
        Human human = new Human();
        while (true){
            int number = serviceMenu.menu();
            if(number != 0){
                serviceMenu.programExecution(number,human);
            } else {
                break;
            }
        }
    }
}
