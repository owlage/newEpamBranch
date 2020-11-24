import java.util.Scanner;

public class Util {

    static int num;
    static char ch;

    static int numInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            num = sc.nextInt();
        } else {
            System.out.println("Введите цифру");
            numInput();
        }
        return num;
    }

    static char aCharInput() {
        Scanner sc = new Scanner(System.in);
        ch = 0;
        if (sc.hasNext()) {
            ch = sc.next().charAt(0);
        }
        return ch;
    }
}
