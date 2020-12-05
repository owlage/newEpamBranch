package carService;

import car.Car;
import car.Engine;
import car.Wheel;
import program.Util;

public class Service {

    Util util = new Util();

    public Car addCar(){
        Car car = new Car(new Wheel[4], new car.Engine(0), "", 0.0, 0.0);
        Wheel [] arr = new Wheel[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Колесо " + i);
            System.out.println("Введите диаметр");
            arr[i] = new Wheel(util.numInput());
            car.setWheels(arr);
        }
        System.out.println("Введите мощьность двигателя");
        car.setEngine(new Engine(util.numInput()));
        System.out.println("Введите бренд");
        car.setBrand(util.strInput());
        System.out.println("Введите расход топлива на 100км.");
        car.setConsumption(util.numInput());
        System.out.println("Введите кол - во топлива на данный момент");
        car.setFuelLevel(util.numInput());
        return car;
    }

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
            number = (int) util.numInput();
            if (number >= 0 && number <= 3)
                break;
            System.out.println("Неправильный номер, повтори ввод");
        }
        System.out.println("Введите диаметр");
        car.getWheels()[number] = new Wheel(util.numInput());
    }

}
