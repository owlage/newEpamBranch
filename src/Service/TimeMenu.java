package Service;

import time.MyTime;
import util.Util;

public class TimeMenu {

    private Util util = new Util();

    public MyTime showNewTime(MyTime myTime) {
        boolean bool = true;
        while (bool) {
            System.out.println("Выберите что хотите прибавить" + "\n"
                    + "'1' - часы" + "\n" + "'2' - минуты" + "\n" + "'3' - секунды" + "\n" + "'0' - выход");
            int num = util.readingNumberFromTheKeyboard();
            switch (num) {
                case 1:
                    System.out.println("Введите кол - во часов");
                    myTime.add_hours(util.readingNumberFromTheKeyboard());
                    System.out.print("Время: ");
                    myTime.print();
                    break;
                case 2:
                    System.out.println("Введите кол - во минут");
                    myTime.add_minutes(util.readingNumberFromTheKeyboard());
                    System.out.print("Время: ");
                    myTime.print();
                    break;
                case 3:
                    System.out.println("Введите кол - во секунд");
                    myTime.add_seconds(util.readingNumberFromTheKeyboard());
                    System.out.print("Время: ");
                    myTime.print();
                    break;
                case 0:
                    System.out.print("Время: ");
                    myTime.print();
                    bool = false;
                    break;
                default:
                    System.out.println("Выберите команду");
                    continue;
            }
        }
        return myTime;
    }
}
