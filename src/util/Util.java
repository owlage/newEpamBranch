package util;

import java.util.Scanner;

public class Util {

    public int readYearFromConsole() {
        Scanner sc = new Scanner(System.in);
        int num;
        if (sc.hasNextInt()) {
            num = sc.nextInt();
            int length = (int) (Math.log10(num) + 1);
            if (length == 4) {
                return num;
            } else {
                System.out.println("Введите год из 4 цифр");
                return readYearFromConsole();
            }
        } else {
            System.out.println("Введите год из 4 цифр");
            return readYearFromConsole();
        }
    }

    public int readIntFromConsole() {
        Scanner sc = new Scanner(System.in);
        int num;
        if (sc.hasNextInt()) {
            num = sc.nextInt();
            if (num >= 0) {
                return num;
            } else {
                System.out.println("Введите значение больше чем 0");
                return readIntFromConsole();
            }
        } else {
            System.out.println("Вы допустили ошибку ввода числа");
            return readIntFromConsole();
        }
    }

    public String readStringFromConsole() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            return sc.nextLine();
        } else {
            System.out.println("Введите строку");
            return readStringFromConsole();
        }
    }
}
