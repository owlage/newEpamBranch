package time;

import util.Util;

public class TimeMenu {

    public Time showNewTime(Time time) {
        Util util = new Util();
        boolean bool = true;
        while (bool) {
            System.out.println("Выберите что хотите прибавить" + "\n"
                    + "'1' - часы" + "\n" + "'2' - минуты" + "\n" + "'3' - секунды" + "\n" + "'0' - выход");
            int num = util.readingNumberFromTheKeyboard();
            switch (num) {
                case 1:
                    System.out.println("Введите кол - во часов");
                    time.add_hours(util.readingNumberFromTheKeyboard());
                    System.out.print("Время: ");
                    time.print();
                    break;
                case 2:
                    System.out.println("Введите кол - во минут");
                    time.add_minutes(util.readingNumberFromTheKeyboard());
                    System.out.print("Время: ");
                    time.print();
                    break;
                case 3:
                    System.out.println("Введите кол - во секунд");
                    time.add_seconds(util.readingNumberFromTheKeyboard());
                    System.out.print("Время: ");
                    time.print();
                    break;
                case 0:
                    System.out.print("Время: ");
                    time.print();
                    bool = false;
                    break;
                default:
                    System.out.println("Выберите команду");
                    continue;
            }
        }
        return time;
    }
}
