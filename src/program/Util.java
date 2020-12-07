package program;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

public class Util {

    private String str;
    private int num;
    private double numDoubl;

    public String strInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            str = sc.nextLine();
        } else {
            System.out.println("Недопустимый ввод");
            strInput();
        }
        return str;
    }

    public int numInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            num = sc.nextInt();
        } else {
            System.out.println("Недопустимый ввод");
            numInput();
        }
        return num;
    }

    public double numDoublInput() throws ParseException {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat("#00.00");
        if (sc.hasNextDouble()) {
            numDoubl = sc.nextDouble();
            str = dF.format(numDoubl);
            numDoubl = dF.parse(str).doubleValue();
            if (numDoubl >= 24.00) {
                System.out.println("Вы превысили временной порог");
                numDoublInput();
            }
        } else {
            System.out.println("Недопустимый ввод");
            numDoublInput();
        }
        return numDoubl;
    }
}
