import java.util.Scanner;

public class Program {

    public Time timeInput() {
        System.out.println("Введите команду:" + "\n"
                + "'1' - Текущее время" + "\n"
                + "'2' - Установить время");
        Time time = null;
        int num = Util.numInput();
        boolean bool = true;
        while (bool) {
            switch (num) {
                case 1:
                    time = new Time();
                    time.print();
                    bool = false;
                    break;
                case 2:
                    System.out.println("Введите часы:");
                    int hh = Util.numInput();
                    System.out.println("Введите минуты");
                    int mm = Util.numInput();
                    System.out.println("Введите секунды");
                    int sec = Util.numInput();
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

    public Time time(Time time) {
        boolean bool = true;
        while (bool) {
            System.out.println("Выберите что хотите прибавить" + "\n"
                    + "'1' - часы" + "\n" + "'2' - минуты" + "\n" + "'3' - секунды" + "\n" + "'0' - выход");
            int num = Util.numInput();
            switch (num) {
                case 1:
                    System.out.println("Введите кол - во часов");
                    time.add_hours(Util.numInput());
                    System.out.print("Время: ");
                    time.print();
                    break;
                case 2:
                    System.out.println("Введите кол - во минут");
                    time.add_minutes(Util.numInput());
                    System.out.print("Время: ");
                    time.print();
                    break;
                case 3:
                    System.out.println("Введите кол - во секунд");
                    time.add_seconds(Util.numInput());
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

    public static void main(String[] args) {
        Program program = new Program();
        program.time(program.timeInput());
    }
}
