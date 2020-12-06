package student;

import program.UtilSimplClassAndObj;

import java.util.Scanner;

public class Student {

    private int number;
    private String surname;
    private int numGroup;
    private int[] performance = new int[5];
    UtilSimplClassAndObj util = new UtilSimplClassAndObj();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumGroup() {
        return numGroup;
    }

    public void setNumGroup(int numGroup) {
        this.numGroup = numGroup;
    }

    public int[] getPerformance() {
        return performance;
    }

    public void setPerformance(int[] performance) {
        this.performance = performance;
    }
}
