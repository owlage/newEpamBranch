package program;

import cave.Cave;
import menu.ServiceMenu;

public class Program {

    public static Cave snakeGorynychcave = new Cave("Snake Gorynych");

    public static void main(String[] args) {
        ServiceMenu serviceMenu = new ServiceMenu();
        snakeGorynychcave.setNumberOfTreasure(100);
        while (true){
            int choice = serviceMenu.menu();
            if(choice != 0){
                serviceMenu.programExecution(choice);
            }
        }
    }
}
