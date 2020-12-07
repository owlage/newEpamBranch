package service;

import airline.Airline;
import program.Util;

import java.text.ParseException;

public class Service {

    public Airline getAirline() throws ParseException {
        Util util = new Util();
        Airline airline = new Airline("", 0, "", 0.0, null);
        System.out.println("Введите пункт назначения");
        airline.setPointOfDelivery(util.strInput());
        System.out.println("Введите номер самолета");
        airline.setFlightNumber(util.numInput());
        System.out.println("Введите тип самолета");
        airline.setAircraftType(util.strInput());
        System.out.println("Введите время отправления через ','.Формат: 12,25");
        airline.setTime(util.numDoublInput());
        System.out.println("Введит дни недели отправления самолета, через пробел");
        airline.setDaysOfTheWeek(util.strInput().split(" "));
        return airline;
    }
}
