package carService;

import car.Car;
import car.Engine;
import car.Wheel;
import util.Util;

public class Service {

    private Util util = new Util();

    public Car createCar() {
        Car car = new Car(new car.Engine(0), "", 0.0, 0.0);
        Wheel[] arr = new Wheel[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Колесо " + i);
            System.out.println("Введите диаметр");
            arr[i] = new Wheel(util.readingNumberFromTheKeyboard());
            car.setWheels(arr);
        }
        System.out.println("Введите мощьность двигателя");
        car.setEngine(new Engine(util.readingNumberFromTheKeyboard()));
        System.out.println("Введите бренд");
        car.setBrand(util.readingStringFromTheKeyboard());
        System.out.println("Введите расход топлива на 100км.");
        car.setConsumption(util.readingNumberFromTheKeyboard());
        System.out.println("Введите кол - во топлива на данный момент");
        car.setFuelLevel(util.readingNumberFromTheKeyboard());
        return car;
    }
}
