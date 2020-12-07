package program;

import java.util.Scanner;

public class Util {

    private int num;
    private String str;

    public int readNumConsole() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Неверный ввод");
            readNumConsole();
        }
        return num;
    }


    public String readStringConsole() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            str = scanner.nextLine();
        } else {
            System.out.println("Неверный ввод");
            readStringConsole();
        }
        return str;
    }
}

