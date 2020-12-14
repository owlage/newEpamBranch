package util;

import java.util.Scanner;

public class Util {

    public double readingNumberFromTheKeyboard() {
        System.out.println("Введите координаты");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            System.out.println("Вы допустили ошибку при вводе");
            return readingNumberFromTheKeyboard();
        }
    }
}
