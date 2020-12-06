package program;

import java.util.Scanner;

public class Util {

    private String str;
    private double numDouble;
    private int numInt;

    public String readStringFromConsole() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            str = scanner.nextLine();
        } else {
            System.out.println("Неверный ввод, повторите попытку");
            readStringFromConsole();
        }
        return str;
    }

    public double readDoubleFromConsole() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()) {
            numDouble = scanner.nextDouble();
        } else {
            System.out.println("Неверный ввод, повторите попытку");
            readDoubleFromConsole();
        }
        return numDouble;
    }

    public int readIntFromConsole() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            numInt = scanner.nextInt();
        } else {
            System.out.println("Неверный ввод, повторите попытку");
            readIntFromConsole();
        }
        return numInt;
    }
}
