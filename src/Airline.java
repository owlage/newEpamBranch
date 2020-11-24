import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class Airline {

    private String pointOfDelivery, aircraftType;
    private String[] daysOfTheWeek;
    private int flightNumber;
    private double time;

    Airline(String pointOfDelivery, int flightNumber, String aircraftType, double time, String[] daysOfTheWeek) {
        this.pointOfDelivery = pointOfDelivery;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.time = time;
        this.daysOfTheWeek = daysOfTheWeek;
    }

    String getPointOfDelivery() {
        return pointOfDelivery;
    }

    int getFlightNumber() {
        return flightNumber;
    }

    String getAircraftType() {
        return aircraftType;
    }

    double getTime() {
        return time;
    }

    String[] getDaysOfTheWeek() {
        return (String[]) daysOfTheWeek.clone();
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

    static Airline getAirline() throws ParseException {
        Airline airline = new Airline("", 0, "", 0.0, null);
        System.out.println("Введите пункт назначения");
        airline.pointOfDelivery = Util.strInput();
        System.out.println("Введите номер самолета");
        airline.flightNumber = Util.numInput();
        System.out.println("Введите тип самолета");
        airline.aircraftType = Util.strInput();
        System.out.println("Введите время отправления через ','.Формат: 12,25");
        airline.time = Util.numDoublInput();
        System.out.println("Введит дни недели отправления самолета, через пробел");
        airline.daysOfTheWeek = Util.strInput().split(" ");
        return airline;
    }
}
