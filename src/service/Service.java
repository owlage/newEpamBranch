package service;

import program.Util;
import train.Train;

import java.util.Arrays;
import java.util.Comparator;

public class Service {

    Util util = new Util();

    public Train[] addTrainArray() {
        Train[] trains = new Train[5];
        trains[0] = new Train("Москва", 123, "13:00");
        trains[1] = new Train("Питер", 231, "9:00");
        trains[2] = new Train("Минск", 395, "4:27");
        trains[3] = new Train("Москва", 314, "2:15");
        trains[4] = new Train("Киев", 105, "19:00");
        return trains;
    }

    public void numTrain(Train[] array) {
        int temp = 0;
        int numTrain = util.numInput();
        for (Train o : array) {
            if (o.getNumTrain() == numTrain) {
                temp++;
                System.out.println("Данные о поезде");
                System.out.println("Место прибытия: " + o.getDestination() + "; Номер поезда: " + o.getNumTrain() +
                        "; Время отправления: " + o.getTime());
            }
        }
        if (temp == 0) {
            System.out.println("Такого поезда нет, введите номер другого поезда");
            numTrain(array);
        }
    }

    //сортировка по номеру поезда
    public void sortingByVolume(Train[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].getNumTrain() > array[j + 1].getNumTrain()) {
                    Object temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = (Train) temp;
                }
            }
        }
        for (Train o : array) {
            System.out.println("Место прибытия: " + o.getDestination() + "; Номер поезда: " + o.getNumTrain() +
                    "; Время отправления: " + o.getTime());
        }
    }

    public static class sortingDestination implements Comparator<Train> {
        @Override
        public int compare(Train one, Train two) {
            //сделал такое решение т.к. one.time.compareTo(two.time) не работает
            if (one.getDestination() == two.getDestination()) {
                String str1 = one.getTime().replaceAll("[^0-9]", "");//записываем в строку только числа
                String str2 = two.getTime().replaceAll("[^0-9]", "");
                Integer time1 = Integer.parseInt(str1);//строку чисел записываем в Integer
                Integer time2 = Integer.parseInt(str2);
                return time1.compareTo(time2);
            }
            return one.getDestination().compareTo(two.getDestination());
        }
    }

    public void showAllTrain() {
        Service service = new Service();
        Train[] trains = service.addTrainArray();
        System.out.println("Начальные обьекты");
        for (Train train : trains) {
            System.out.println("Место прибытия: " + train.getDestination() + "; Номер поезда: " + train.getNumTrain() +
                    "; Время отправления: " + train.getTime());
        }
    }

    public int menu() {
        System.out.println("Выберете пункт меню:" + "\n" +
                "1. сортировка по номерам поездов" + "\n" +
                "2. вывод информации о поезде по номеру" + "\n" +
                "3. сортировка по пункту назначения" + "\n" +
                "0. выход" + "\n");
        while (true) {
            int numCommand = util.numInput();
            if (numCommand < 0 || numCommand > 3) {
                continue;
            }
            return numCommand;
        }
    }


    public void showCommand(int num) {
        switch (num) {
            case 1:
                sortingByVolume(addTrainArray());
                break;
            case 2:
                System.out.println("Введите номер поезда");
                numTrain(addTrainArray());
                break;
            case 3:
                Arrays.sort(addTrainArray(), new Service.sortingDestination());
                for (Train o : addTrainArray()) {
                    System.out.println("Место прибытия: " + o.getDestination() + "; Номер поезда: " +
                            o.getNumTrain() + "; Время отправления: " + o.getTime());
                }
                break;
        }
    }
}
