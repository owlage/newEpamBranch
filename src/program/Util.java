package program;

import java.util.Scanner;

public class Util {

    static int num;
    static String str;

    public static int readNumConsole(){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Неверный ввод");
            readNumConsole();
        }
        return num;
    }

    public static String readStringConsole(){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextLine()){
            str = scanner.nextLine();
        } else {
            System.out.println("Неверный ввод");
            readStringConsole();
        }
        return str;
    }
}
