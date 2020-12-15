package util;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

public class Util {

    public String strInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            return sc.nextLine();
        } else {
            System.out.println("Недопустимый ввод");
            return strInput();
        }
    }

    public int numInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Недопустимый ввод");
            return numInput();
        }
    }

    public double numDoublInput() throws ParseException {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat("#00.00");
        if (sc.hasNextDouble()) {
            double numDoubl = sc.nextDouble();
            String str = dF.format(numDoubl);
            if (numDoubl <= 24.00) {
                return numDoubl = dF.parse(str).doubleValue();
            } else {
                System.out.println("Вы превысили временной порог");
                return numDoublInput();
            }
        } else {
            System.out.println("Недопустимый ввод");
            return numDoublInput();
        }
    }
}
