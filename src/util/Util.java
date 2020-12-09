package util;

import java.util.Scanner;

public class Util {

    public int readingNumberFromTheKeyboard() {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        if (sc.hasNextInt()) {
            num = sc.nextInt();
            if (num < 0) {
                System.out.println("число не может быть отрицательным");
                return readingNumberFromTheKeyboard();
            } else {
                return num;
            }
        } else {
            System.out.println("Введите целое число");
            return readingNumberFromTheKeyboard();
        }
    }
}
