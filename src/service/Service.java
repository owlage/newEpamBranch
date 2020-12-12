package service;

import airline.Airline;

import java.text.ParseException;

public class Service {

    public Airline createAirline(String pointOfDelivery, int flightNumber, String aircraftType,
                                 double time, String[] daysOfTheWeek) throws ParseException {
        Airline airline = new Airline(pointOfDelivery, flightNumber, aircraftType, time, daysOfTheWeek);
        return airline;
    }
}
