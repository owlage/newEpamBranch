package program;

import car.Car;
import carService.Service;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Util util = new Util();
        Service service = new Service();
        Car car = service.addCar();
        while (true) {
            System.out.println(
                    "Выберете пункт меню:\n" +
                            "0. выход\n" +
                            "1. ехать\n" +
                            "2. заправляться\n" +
                            "3. менять колесо\n" +
                            "4. вывести информацию об авто (марку тоже)\n");
            int choice = scanner.nextInt();
            if (choice == 0)
                break;
            if (choice < 1 || choice > 4) {
                System.out.println("выбран неправильный пункт меню, повторите ввод.");
                continue;
            }
            switch (choice) {
                case 1:
                    service.move(car);
                    break;
                case 2:
                    System.out.println("Введи количество топлива:");
                    double fuel = util.numInput();
                    service.addFuelLevel(fuel, car);
                    break;
                case 3:
                    service.change_wheel(car);
                    break;
                case 4:
                    System.out.println(car.toString());
                    break;
            }
        }
    }
}
