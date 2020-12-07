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

    public class sortingDestination implements Comparator<Train> {
        @Override
        public int compare(Train one, Train two) {
            //сделал такое решение т.к. one.time.compareTo(two.time) не работает
            if (one.destination == two.destination) {
                String str1 = one.time.replaceAll("[^0-9]", "");//записываем в строку только числа
                String str2 = two.time.replaceAll("[^0-9]", "");
                Integer time1 = Integer.parseInt(str1);//строку чисел записываем в Integer
                Integer time2 = Integer.parseInt(str2);
                return time1.compareTo(time2);
            }
            return one.destination.compareTo(two.destination);
        }
    }
}
