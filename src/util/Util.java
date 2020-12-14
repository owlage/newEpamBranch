package util;

import java.util.Scanner;

public class Util {

    public static int readNumConsole(){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            return scanner.nextInt();
        } else {
            System.out.println("Неверный ввод");
            return readNumConsole();
        }
    }

    public static String readStringConsole(){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextLine()){
            return scanner.nextLine();
        } else {
            System.out.println("Неверный ввод");
            return readStringConsole();
        }
    }
}
