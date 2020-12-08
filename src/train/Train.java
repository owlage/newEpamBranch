package train;

import java.util.Comparator;

public class Train {

    private int numTrain;
    private String time;
    private String destination;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumTrain() {
        return numTrain;
    }

    public void setNumTrain(int numTrain) {
        this.numTrain = numTrain;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Train(String destination, int numTrain, String time) {
        this.destination = destination;
        this.numTrain = numTrain;
        this.time = time;
    }
}
