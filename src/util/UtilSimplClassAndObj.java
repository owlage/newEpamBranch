package util;

import java.util.Scanner;

public class UtilSimplClassAndObj {

    public int readingNumberFromTheKeyboard() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Введите целое число");
            return readingNumberFromTheKeyboard();
        }
    }

    public String readingStringFromTheKeyboard() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            return sc.nextLine();
        } else {
            return readingStringFromTheKeyboard();
        }
    }

}
