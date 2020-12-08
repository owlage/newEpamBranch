package program;

import java.util.Scanner;

public class Util {

    public int numberInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Введите целое число");
            return numberInput();
        }
    }

}
