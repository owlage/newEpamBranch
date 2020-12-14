package service;

import airline.Airline;
import util.Util;

import java.text.ParseException;

public class ServiceMenu {

    private Util util = new Util();
    private ServiceAirlines serviceAirlines = new ServiceAirlines();

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
                System.out.println("Введите пункт назначения");
                String point = util.strInput();
                System.out.println("Введите номер самолета");
                int flightNumber = util.numInput();
                System.out.println("Введите тип самолета");
                String aircraftType = util.strInput();
                System.out.println("Введите время отправления через ','.Формат: 12,25");
                double time = util.numDoublInput();
                System.out.println("Введит дни недели отправления самолета, через пробел");
                String[] daysOfTheWeek = util.strInput().split(" ");
                serviceAirlines.pushAirlines(new Airline(point, flightNumber, aircraftType, time,
                        daysOfTheWeek));
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
                time = util.numDoublInput();
                serviceAirlines.dayAndTimeSearch(day1, time);
        }
    }
}
