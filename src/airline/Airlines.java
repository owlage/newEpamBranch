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

    public Airline[] getAirlines() {
        return airlines;
    }

    public void setAirlines(Airline[] airlines) {
        this.airlines = airlines;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
