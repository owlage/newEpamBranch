package util;

import java.util.Scanner;

public class Util {

    public String readingStringFromTheKeyboard() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            return sc.nextLine();
        } else {
            System.out.println("Недопустимый ввод");
            return readingStringFromTheKeyboard();
        }
    }

     public int readingNumberFromTheKeyboard() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Недопустимый ввод");
            return readingNumberFromTheKeyboard();
        }
    }
}
