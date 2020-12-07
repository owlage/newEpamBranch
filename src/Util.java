import java.util.Scanner;

public class Util {

    private int num;

    public int numInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            num = sc.nextInt();
        } else {
            System.out.println("Введите число");
        }
        return num;
    }
}
