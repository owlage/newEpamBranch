package airline;

import airline.Airline;

import java.util.Arrays;

public class Airlines {


    private Airline[] airlines;
    private int size;
    private int capacity;

    public Airlines(int capacity) {
        size = 0;
        this.capacity = capacity;
        airlines = new Airline[capacity];
    }

    public Airlines() {
        this(10);
    }

    public void pushAirlines(Airline airline) {
        if (size < capacity) {
            airlines[size] = airline;
            size++;
        } else {
            Airline[] buffer = new Airline[capacity * 2];
            for (int i = 0; i < size; i++) {
                buffer[i] = airlines[i];
            }
            airlines = buffer;
            capacity = capacity * 2;
            airlines[size] = airline;
            size++;
        }
    }

    public void pointSearch(String point) {
        int length = airlines.length;
        Airline [] arr = Arrays.copyOf(airlines, length);
        for (int i = 0; i < arr.length; i++) {
            if (point.equalsIgnoreCase(arr[i].getPointOfDelivery())) {
                airlines[i].print();
            }
        }
    }

    public void daySearch(String day) {
        for (int i = 0; i < airlines.length; i++) {
            for (String str : airlines[i].getDaysOfTheWeek()) {
                if (str.equalsIgnoreCase(day)) {
                    airlines[i].print();
                }
            }
        }
    }

    public void dayAndTimeSearch(String day, double time) {
        for (int i = 0; i < airlines.length; i++) {
            for (String str : airlines[i].getDaysOfTheWeek()) {
                if (str.equalsIgnoreCase(day)) {
                    if (airlines[i].getTime() >= time) {
                        airlines[i].print();
                    }
                }
            }
        }
    }
}
