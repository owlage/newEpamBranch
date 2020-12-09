package time;

import util.Util;

public class TimeService {

    public Time timeEntry() {
        Util util = new Util();
        System.out.println("Введите команду:" + "\n"
                + "'1' - Текущее время" + "\n"
                + "'2' - Установить время");
        Time time = null;
        int num = util.readingNumberFromTheKeyboard();
        boolean bool = true;
        while (bool) {
            switch (num) {
                case 1:
                    time = new Time(0,0,0);
                    time.print();
                    bool = false;
                    break;
                case 2:
                    System.out.println("Введите часы:");
                    int hh = util.readingNumberFromTheKeyboard();
                    System.out.println("Введите минуты");
                    int mm = util.readingNumberFromTheKeyboard();
                    System.out.println("Введите секунды");
                    int sec = util.readingNumberFromTheKeyboard();
                    time = new Time();
                    time.set_hh(hh);
                    time.set_mm(mm);
                    time.set_ss(sec);
                    time.print();
                    bool = false;
                    break;
                default:
                    System.out.println("Введите команду");
                    continue;
            }
        }
        return time;
    }
}
