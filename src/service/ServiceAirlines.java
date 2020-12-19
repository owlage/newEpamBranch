package service;

import airline.Airline;
import airline.Airlines;

public class ServiceAirlines {

    public void pushAirlines(Airline airline, Airlines airlines) {
        if (airlines.getSize() < airlines.getCapacity()) {
            airlines.getAirlines()[airlines.getSize()] = airline;
            airlines.setSize(airlines.getSize() + 1);
        } else {
            Airline[] buffer = new Airline[airlines.getCapacity() * 2];
            for (int i = 0; i < airlines.getSize(); i++) {
                buffer[i] = airlines.getAirlines()[i];
            }
            airlines.setAirlines(buffer);
            airlines.setCapacity(airlines.getCapacity() * 2);
            airlines.getAirlines()[airlines.getSize()] = airline;
            airlines.setSize(airlines.getSize() + 1);
        }
    }

    public void pointSearch(String point, Airlines airlines) {
        Airline [] arr = new Airline[airlines.getAirlines().length];
        System.arraycopy(airlines.getAirlines(),0,arr,0,airlines.getAirlines().length);
        for (int i = 0; i < arr.length; i++) {
            if (point.equalsIgnoreCase(arr[i].getPointOfDelivery())) {
                airlines.getAirlines()[i].print();
            }
        }
    }

    public void daySearch(String day, Airlines airlines) {
        for (int i = 0; i < airlines.getAirlines().length; i++) {
            for (String str : airlines.getAirlines()[i].getDaysOfTheWeek()) {
                if (str.equalsIgnoreCase(day)) {
                    airlines.getAirlines()[i].print();
                }
            }
        }
    }

    public void dayAndTimeSearch(String day, double time, Airlines airlines) {
        for (int i = 0; i < airlines.getAirlines().length; i++) {
            for (String str : airlines.getAirlines()[i].getDaysOfTheWeek()) {
                if (str.equalsIgnoreCase(day)) {
                    if (airlines.getAirlines()[i].getTime() >= time) {
                        airlines.getAirlines()[i].print();
                    }
                }
            }
        }
    }
}
