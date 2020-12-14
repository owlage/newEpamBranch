package test1;

import java.util.Scanner;

public class Test1 {

    private int numOne;
    private int numTwo;

    public int getNumOne() {
        return numOne;
    }

    public void setNumOne(int numOne) {
        this.numOne = numOne;
    }

    public int getNumTwo() {
        return numTwo;
    }

    public void setNumTwo(int numTwo) {
        this.numTwo = numTwo;
    }

    public void outputOnDisplay() {
        System.out.println(numOne);
        System.out.println(numTwo);
    }

    public int sum(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public int greatTest(int numberOne, int numberTwo) {
        if (numberOne > numberTwo) {
            return getNumOne();
        } else if (numberOne < numberTwo) {
            return getNumTwo();
        } else {
            return 0;
        }
    }

}

