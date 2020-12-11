package util;

import java.util.Scanner;

public class Util {

    public String readStringFromConsole() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            return scanner.nextLine();
        } else {
            System.out.println("Неверный ввод, повторите попытку");
            return readStringFromConsole();
        }
    }

    public double readDoubleFromConsole() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            System.out.println("Неверный ввод, повторите попытку");
            return readDoubleFromConsole();
        }
    }

    public int readIntFromConsole() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Неверный ввод, повторите попытку");
            return readIntFromConsole();
        }
    }
}
