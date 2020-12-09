package service;

import train.Train;

public class TrainData {

    public Train[] addTrainArray() {
        Train[] trains = new Train[5];
        trains[0] = new Train("Москва", 123, "13:00");
        trains[1] = new Train("Питер", 231, "9:00");
        trains[2] = new Train("Минск", 395, "4:27");
        trains[3] = new Train("Москва", 314, "2:15");
        trains[4] = new Train("Киев", 105, "19:00");
        return trains;
    }
}
