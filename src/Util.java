import java.util.Scanner;

public class Util {

    static int num;

    static int numInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            num = sc.nextInt();
        } else {
            System.out.println("Введите число");
        }
        return num;
    }
}
