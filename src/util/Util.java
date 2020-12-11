package util;

import java.util.Scanner;

public class Util {

    public double readingNumberFromTheKeyboard() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            System.out.println("Неверный ввод");
            return readingNumberFromTheKeyboard();
        }
    }

    public String readingStringFromTheKeyboard() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            return sc.nextLine();
        } else {
            System.out.println("Неверный ввод");
            return readingStringFromTheKeyboard();
        }
    }
}
