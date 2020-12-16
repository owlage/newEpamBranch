package carService;

import car.Car;
import util.Util;

public class ServiceMenu {

    private Util util = new Util();
    private ServiceCar serviceCar = new ServiceCar();

    public int menu() {
        System.out.println(
                "Выберете пункт меню:\n" +
                        "0. выход\n" +
                        "1. ехать\n" +
                        "2. заправляться\n" +
                        "3. менять колесо\n" +
                        "4. вывести информацию об авто (марку тоже)\n");
        while (true) {
            int choice = (int) util.readingNumberFromTheKeyboard();
            if (choice < 0 || choice > 4) {
                System.out.println("выбран неправильный пункт меню, повторите ввод.");
                continue;
            }
            return choice;
        }
    }

    public void commandExecution(int choice, Car car){
        switch (choice) {
            case 1:
                serviceCar.move(car);
                break;
            case 2:
                System.out.println("Введи количество топлива:");
                double fuel = util.readingNumberFromTheKeyboard();
                serviceCar.addFuelLevel(fuel, car);
                break;
            case 3:
                serviceCar.change_wheel(car);
                break;
            case 4:
                System.out.println(car.toString());
                break;
        }
    }
}
