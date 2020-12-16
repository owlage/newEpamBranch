package program;

import car.Car;
import carService.Service;
import carService.ServiceMenu;

public class Program {

    public static void main(String[] args) {
        Service service = new Service();
        ServiceMenu serviceMenu = new ServiceMenu();
        Car car = service.createCar();
        while (true) {
            int number = serviceMenu.menu();
            if (number != 0) {
                serviceMenu.commandExecution(number,car);
            } else {
                break;
            }
        }
    }
}

