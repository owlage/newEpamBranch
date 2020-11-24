import java.util.Scanner;

public class Test1 {

    private int numOne;
    private int numTwo;
    static int number;//использовал static т.к. при неправельном вводе одного из чисел повторный ввод не учитывается

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

    public int greatest(int numberOne, int numberTwo) {
        if (numberOne > numberTwo) {
            return numberOne;
        } else if (numberOne < numberTwo) {
            return numberTwo;
        } else {
            return 0;
        }
    }

    public int numberInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            number = sc.nextInt();
        } else {
            System.out.println("Введите целое число");
            numberInput();
        }
        return number;
    }
}

