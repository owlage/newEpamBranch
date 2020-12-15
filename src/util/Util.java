package util;

import java.util.Scanner;

public class Util {

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
