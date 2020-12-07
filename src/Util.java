import java.util.Scanner;

public class Util {

    private int num;
    private char ch;

    public int numInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            num = sc.nextInt();
        } else {
            System.out.println("Введите цифру");
            numInput();
        }
        return num;
    }

    public char aCharInput() {
        Scanner sc = new Scanner(System.in);
        ch = 0;
        if (sc.hasNext()) {
            ch = sc.next().charAt(0);
        }
        return ch;
    }
}
