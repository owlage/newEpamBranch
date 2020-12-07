package program;

import service.Service;
import train.Train;

import java.util.Arrays;
import java.util.Scanner;

class Program {

    public void showMenu(){
        Util util = new Util();
        Service service = new Service();
        Train[]trains = service.addTrainArray();
        System.out.println("Начальные обьекты");
        for (Train train : trains) {
            System.out.println("Место прибытия: " + train.getDestination() + "; Номер поезда: " + train.getNumTrain() +
                    "; Время отправления: " + train.getTime());
        }
        while (true) {
            System.out.println("Выберете пункт меню:" + "\n" +
                    "1. сортировка по номерам поездов" + "\n" +
                    "2. вывод информации о поезде по номеру" + "\n" +
                    "3. сортировка по пункту назначения" + "\n" +
                    "0. выход" + "\n");
            int numCommand = util.numInput();
            if (numCommand == 0) {
                break;
            }
            switch (numCommand) {
                case 1:
                    service.sortingByVolume(trains);
                    break;
                case 2:
                    System.out.println("Введите номер поезда");
                    service.numTrain(trains);
                    break;
                case 3:
                    Arrays.sort(trains, new Service.sortingDestination());
                    for (Train o : trains) {
                        System.out.println("Место прибытия: " + o.getDestination() + "; Номер поезда: " +
                                o.getNumTrain() + "; Время отправления: " + o.getTime());
                    }
                    break;
                default:
                    System.out.println("Такой команды нет, повторите ввод");
                    continue;
            }
        }
    }

    public static void main(String[] args) {
        Program program = new Program();
        program.showMenu();
    }
}
