package util;

import java.util.Scanner;

public class Util {

    public int readingNumberFromTheKeyboard() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Введите число");
            return readingNumberFromTheKeyboard();
        }
    }
}
