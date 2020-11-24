import java.util.Scanner;

public class Util {

    static String strIn;
    static long integIn;

    static String strInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            strIn = sc.nextLine();
            strIn = strIn.replaceAll("[^А-Яа-я]", "");
        } else {
            System.out.println("Введите строку");
            strInput();
        }
        return strIn;
    }

    static String addressInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            strIn = sc.nextLine();
            strIn = strIn.replaceAll("[^А-Яа-я0-9]", "");
        } else {
            System.out.println("Введите строку");
            strInput();
        }
        return strIn;
    }

    static long number() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLong()) {
            integIn = sc.nextLong();
            int length = (int) (Math.log10(integIn) + 1);
            if (length != 16) {
                System.out.println("Введите 16 цифр");
                number();
            }
        } else {
            System.out.println("Введите 16 цифр");
            number();
        }
        return integIn;
    }
}
