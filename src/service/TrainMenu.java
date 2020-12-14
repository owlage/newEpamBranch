package service;

import util.Util;

public class TrainMenu {

    public int menu() {
        Util util = new Util();
        System.out.println("Выберете пункт меню:" + "\n" +
                "1. сортировка по номерам поездов" + "\n" +
                "2. вывод информации о поезде по номеру" + "\n" +
                "3. сортировка по пункту назначения" + "\n" +
                "0. выход" + "\n");
        while (true) {
            int numCommand = util.readingNumberFromTheKeyboard();
            if (numCommand < 0 || numCommand > 3) {
                continue;
            }
            return numCommand;
        }
    }
}
