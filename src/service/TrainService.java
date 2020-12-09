package service;

import train.Train;
import util.Util;
import java.util.Arrays;
import java.util.Comparator;

public class TrainService {

    public void displayTrainByNumber(Train[] array) {
        Util util = new Util();
        int temp = 0;
        int numTrain = util.readingNumberFromTheKeyboard();
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
            displayTrainByNumber(array);
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
        TrainData service = new TrainData();
        Train[] trains = service.addTrainArray();
        System.out.println("Начальные обьекты");
        for (Train train : trains) {
            System.out.println("Место прибытия: " + train.getDestination() + "; Номер поезда: " + train.getNumTrain() +
                    "; Время отправления: " + train.getTime());
        }
    }

    public void commandExecution(int num) {
        TrainData trainData = new TrainData();
        switch (num) {
            case 1:
                sortingByVolume(trainData.addTrainArray());
                break;
            case 2:
                System.out.println("Введите номер поезда");
                displayTrainByNumber(trainData.addTrainArray());
                break;
            case 3:
                Arrays.sort(trainData.addTrainArray(), new TrainService.sortingDestination());
                for (Train o : trainData.addTrainArray()) {
                    System.out.println("Место прибытия: " + o.getDestination() + "; Номер поезда: " +
                            o.getNumTrain() + "; Время отправления: " + o.getTime());
                }
                break;
        }
    }
}
