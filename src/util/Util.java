package util;

import java.util.Scanner;

public class Util {

    public String readStrConsole() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            return scanner.nextLine();
        } else {
            System.out.println("Недопустимый ввод");
            return readStrConsole();
        }
    }

    public int readNumberConsole() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Недопустимый ввод");
            return readNumberConsole();
        }
    }
}
