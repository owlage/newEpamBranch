package program;

import java.util.Scanner;

public class Util {

    private int number;

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
