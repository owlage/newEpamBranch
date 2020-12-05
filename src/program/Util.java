package program;

import java.util.Scanner;

public class Util {

    private String strInput;
    private int numInput;

    public String getStrInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            strInput = sc.nextLine();
        } else {
            System.out.println("Недопустимый ввод");
            getStrInput();
        }
        return strInput;
    }

     public int getNumInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            numInput = sc.nextInt();
        } else {
            System.out.println("Недопустимый ввод");
            getNumInput();
        }
        return numInput;
    }
}
