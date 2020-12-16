package carService;

import car.Car;
import car.Wheel;
import util.Util;

public class ServiceCar {

    private Util util = new Util();

    public void move(Car car) {
        if (car.getFuelLevel() <= 0) {
            System.out.println("Машина не может ехать, нет бензина");
            return;
        }
        for (int i = 0; i < car.getWheels().length - 1; i++) {
            if (car.getWheels()[i].getDiameter() != car.getWheels()[i + 1].getDiameter()) {
                System.out.println("Машина не может ехать, колеса разного диаметра");
                System.out.println("Колесо " + (i + 1) + ":" + car.getWheels()[i + 1].getDiameter());
                return;
            }
        }

        double distance = car.getFuelLevel() / car.getConsumption();
        System.out.println("Закончился бензин");
        System.out.println("Машина проехала " + distance * 100 + "км.");
        car.setFuelLevel(0);
    }

    public void addFuelLevel(double fuel, Car car) {
        car.setFuelLevel(fuel);
    }

    public void change_wheel(Car car) {
        System.out.println("Введи номер колеса [0-3]:");
        int number;
        while (true) {
            number = (int) util.readingNumberFromTheKeyboard();
            if (number >= 0 && number <= 3)
                break;
            System.out.println("Неправильный номер, повтори ввод");
        }
        System.out.println("Введите диаметр");
        car.getWheels()[number] = new Wheel(util.readingNumberFromTheKeyboard());
    }
}
