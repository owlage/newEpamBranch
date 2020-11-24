import java.text.ParseException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Airlines airlines = new Airlines(1);
        while (true) {
            System.out.println(
                    "Выберете пункт меню:\n" +
                            "0. выйти\n" +
                            "1. добавить рейс\n" +
                            "2. найти список рейсов по пункту назначения\n" +
                            "3. найти список рейсов по дню недели\n" +
                            "4. найти список рейсов по дню недели и времени" + "\n");
            int choice = Util.numInput();
            if (choice == 0) {
                break;
            }
            if (choice < 1 || choice > 4) {
                System.out.println("выбран неправильный пункт меню, повторите ввод.");
                continue;
            }
            switch (choice) {
                case 1:
                    airlines.pushAirlines(Airline.getAirline());
                    break;
                case 2:
                    System.out.println("Введите пункт назначения");
                    String strPoint = Util.strInput();
                    airlines.pointSearch(strPoint);
                    break;
                case 3:
                    System.out.println("Введите день недели");
                    String day = Util.strInput();
                    airlines.daySearch(day);
                    break;
                case 4:
                    System.out.println("Введите день недели и через enter введите время через ','. Формат: 12,25");
                    String day1 = Util.strInput();
                    double time = Util.numDoublInput();
                    airlines.dayAndTimeSearch(day1, time);
            }
        }
    }
}
