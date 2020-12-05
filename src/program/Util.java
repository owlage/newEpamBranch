package program;

import java.util.Scanner;

public class Util {

    private double numInput;
    private String strInput;

    public double numInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            numInput = sc.nextDouble();
        } else {
            System.out.println("Неверный ввод");
            numInput();
        }
        return numInput;
    }

    public String strInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            strInput = sc.nextLine();
        } else {
            System.out.println("Неверный ввод");
            strInput();
        }
        return strInput;
    }
}
