package program;

import service.Service;
import train.Train;

import java.util.Arrays;

class Program {

    public static void main(String[] args) {
        Service service = new Service();
        service.showAllTrain();
        while (true) {
            int number = service.menu();
            if (number != 0) {
                service.showCommand(number);
            } else {
                break;
            }
        }
    }
}

