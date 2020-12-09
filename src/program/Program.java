package program;

import service.TrainMenu;
import service.TrainService;

class Program {

    public static void main(String[] args) {
        TrainService service = new TrainService();
        TrainMenu trainMenu = new TrainMenu();
        service.showAllTrain();
        while (true) {
            int number = trainMenu.menu();
            if (number != 0) {
                service.commandExecution(number);
            } else {
                break;
            }
        }
    }
}

