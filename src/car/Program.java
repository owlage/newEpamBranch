package car;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = Car.getCar();
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
                    car.move();
                    break;
                case 2:
                    System.out.println("Введи количество топлива:");
                    double fuel = Car.numInput();
                    car.addFuelLevel(fuel);
                    break;
                case 3:
                    car.change_wheel();
                    break;
                case 4:
                    System.out.println(car.toString());
                    break;
            }
        }
    }
}
