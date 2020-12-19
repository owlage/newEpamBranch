package program;

import service.TrainData;
import service.TrainMenu;
import service.TrainService;

class Program {

    public static void main(String[] args) {
        TrainService service = new TrainService();
        TrainMenu trainMenu = new TrainMenu();
        TrainData trainData = new TrainData();
        service.showAllTrain(trainData);
        while (true) {
            int number = trainMenu.menu();
            if (number != 0) {
                service.commandExecution(number,trainData);
            } else {
                break;
            }
        }
    }
}

