import java.util.Scanner;

public class Util {

    static int num;
    static String strIn;

    static int numYearInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            num = sc.nextInt();
            int length = (int) (Math.log10(num) + 1);
            if (length > 4) {
                System.out.println("Введите год из 4 цифр");
                numYearInput();
            }
        } else {
            System.out.println("Введите год из 4 цифр");
            numYearInput();
        }
        return num;
    }

    static int numInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            num = sc.nextInt();
            if (num < 1) {
                System.out.println("Введите значение больше чем 0");
                numInput();
            }
        } else {
            System.out.println("Вы допустили ошибку ввода числа");
            numInput();
        }
        return num;
    }

    static String strInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            strIn = sc.nextLine();
        } else {
            System.out.println("Введите строку");
            strInput();
        }
        return strIn;
    }
}
