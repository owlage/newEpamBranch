package airline;

import program.Util;

import java.text.ParseException;
import java.util.Arrays;

public class Airline {

    private String pointOfDelivery, aircraftType;
    private String[] daysOfTheWeek;
    private int flightNumber;
    private double time;

    public Airline(String pointOfDelivery, int flightNumber, String aircraftType, double time, String[] daysOfTheWeek) {
        this.pointOfDelivery = pointOfDelivery;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.time = time;
        this.daysOfTheWeek = daysOfTheWeek;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getPointOfDelivery() {
        return pointOfDelivery;
    }

    public void setPointOfDelivery(String pointOfDelivery) {
        this.pointOfDelivery = pointOfDelivery;
    }

    public String[] getDaysOfTheWeek() {
        return daysOfTheWeek;
    }

    public void setDaysOfTheWeek(String[] daysOfTheWeek) {
        this.daysOfTheWeek = daysOfTheWeek;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String toString() {
        return "Пункт назначения: " + getPointOfDelivery() +
                "\nНомер рейса: " + getFlightNumber() +
                "\nТип самолета: " + getAircraftType() +
                "\nВремя вылета: " + getTime() +
                "\nДни недели: " + Arrays.toString(getDaysOfTheWeek());
    }

    public void print() {
        System.out.println(toString());
    }
}
