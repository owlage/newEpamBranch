package program;

import java.util.Scanner;

public class Util {

    private int num;

    public int numInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            num = sc.nextInt();
            if (num < 0) {
                System.out.println("число не может быть отрицательным");
                numInput();
            }
        } else {
            System.out.println("Введите целое число");
            numInput();
        }
        return num;
    }
}
