package Program;

import java.util.Scanner;

public class Util {

    public String str;
    public int number;

    public String readStrConsole() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            str = scanner.nextLine();
        } else {
            System.out.println("Недопустимый ввод");
            readStrConsole();
        }
        return str;
    }

    public int readNumberConsole() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Недопустимый ввод");
            readNumberConsole();
        }
        return number;
    }


}
