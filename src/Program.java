import java.util.Arrays;
import java.util.Scanner;

class Program {
    //сортировка по номеру поезда
    static void sortingByVolume(Train[] array) {
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

    static int numInput() {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        if (sc.hasNextInt()) {
            num = sc.nextInt();
            if (num < 0) {
                System.out.println("число не может быть отрицательным");
                numInput();
            }
        } else {
            System.out.println("Введите целое число");
            numInput();
        }
        return num;
    }

    static void numTrain(Train[] array) {
        int temp = 0;
        int numTrain = numInput();
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

    public static void main(String[] args) {

        Train[] trains = new Train[5];
        trains[0] = new Train("Москва", 123, "13:00");
        trains[1] = new Train("Питер", 231, "9:00");
        trains[2] = new Train("Минск", 395, "4:27");
        trains[3] = new Train("Москва", 314, "2:15");
        trains[4] = new Train("Киев", 105, "19:00");
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
            int numCommand = numInput();
            if (numCommand == 0) {
                break;
            }
            switch (numCommand) {
                case 1:
                    sortingByVolume(trains);
                    break;
                case 2:
                    System.out.println("Введите номер поезда");
                    numTrain(trains);
                    break;
                case 3:
                    Arrays.sort(trains, new Train.sortingDestination());
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
}
