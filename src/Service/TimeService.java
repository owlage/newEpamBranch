package Service;

import time.MyTime;
import util.Util;

public class TimeService {

    private Util util = new Util();

    public MyTime timeEntry() {
        System.out.println("Введите команду:" + "\n"
                + "'1' - Текущее время" + "\n"
                + "'2' - Установить время");
        MyTime myTime = null;
        int num = util.readingNumberFromTheKeyboard();
        boolean bool = true;
        while (bool) {
            switch (num) {
                case 1:
                    myTime = new MyTime(0,0,0);
                    myTime.print();
                    bool = false;
                    break;
                case 2:
                    System.out.println("Введите часы:");
                    int hh = util.readingNumberFromTheKeyboard();
                    System.out.println("Введите минуты");
                    int mm = util.readingNumberFromTheKeyboard();
                    System.out.println("Введите секунды");
                    int sec = util.readingNumberFromTheKeyboard();
                    myTime = new MyTime(hh,mm,sec);
                    bool = false;
                    break;
                default:
                    System.out.println("Введите команду");
                    continue;
            }
        }
        return myTime;
    }
}
