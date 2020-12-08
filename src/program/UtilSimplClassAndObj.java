package program;

import java.util.Scanner;

public class UtilSimplClassAndObj {

    public int numberInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Введите целое число");
            return numberInput();
        }
    }

    public String strInput() {
        String str = "";
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            return sc.nextLine();
        } else {
            return strInput();
        }
    }

}
