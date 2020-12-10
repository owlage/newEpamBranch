package service;

import airline.Airlines;
import util.Util;

import java.text.ParseException;

public class ServiceMenu {

    Util util = new Util();
    Service service = new Service();
    ServiceAirlines serviceAirlines = new ServiceAirlines();

    public int menu() {
        while (true) {
            System.out.println(
                    "Выберете пункт меню:\n" +
                            "0. выйти\n" +
                            "1. добавить рейс\n" +
                            "2. найти список рейсов по пункту назначения\n" +
                            "3. найти список рейсов по дню недели\n" +
                            "4. найти список рейсов по дню недели и времени" + "\n");
            int choice = util.numInput();
            if (choice < 0 || choice > 4) {
                System.out.println("выбран неправильный пункт меню, повторите ввод.");
                continue;
            }
            return choice;
        }
    }

    public void programExecution(int choice) throws ParseException {
        switch (choice) {
            case 1:
                serviceAirlines.pushAirlines(service.getAirline());
                break;
            case 2:
                System.out.println("Введите пункт назначения");
                String strPoint = util.strInput();
                serviceAirlines.pointSearch(strPoint);
                break;
            case 3:
                System.out.println("Введите день недели");
                String day = util.strInput();
                serviceAirlines.daySearch(day);
                break;
            case 4:
                System.out.println("Введите день недели и через enter введите время через ','. Формат: 12,25");
                String day1 = util.strInput();
                double time = util.numDoublInput();
                serviceAirlines.dayAndTimeSearch(day1, time);
        }
    }
}
