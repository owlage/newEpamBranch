import java.util.Scanner;

public class Program {

    static int number1, number2;

    public static Object obCounter() {
        System.out.println("Введите 0 если хотите задать значения счётчика по умолчанию" + "\n" +
                "Введите любую цифру и она будет проинициализирована как минимальное значение счётчика");
        number1 = Util.numInput();
        if (number1 == 0) {
            Decimal decimalCounter = new Decimal();
            return decimalCounter;
        } else {
            System.out.println("Введите верхнюю границу счётчика");
            number2 = Util.numInput();
            if (number1 >= number2) {
                System.out.println("Нижняя граница не может быть больше чем верхняя");
                obCounter();
            }
            Decimal decimalCounter = new Decimal(number1, number2);
            return decimalCounter;
        }
    }

    static int state(Decimal decimalCounter) {
        return decimalCounter.getCount();
    }

    public static void main(String[] args) {
        Decimal decimalCounter = (Decimal) obCounter();
        System.out.println("Для того что бы узнать текущее состояние счётчика введите" + "\n" +
                '-' + " - уменшение счётчика" + "\n" +
                '+' + " - увеличение счётчика" + "\n" +
                '/' + " - выйти из программы" + "\n" +
                '=' + " - состояние счётчика");
        char operation = 0;
        while (operation != '/') {
            operation = Util.aCharInput();
            if (operation == '-') {
                decimalCounter.low();
                System.out.println("Значение счётчика после уменьшения = " + decimalCounter.getCount());
            }
            if (operation == '+') {
                decimalCounter.increase();
                System.out.println("Значение счётчика после увеличения = " + decimalCounter.getCount());
            }
            if (operation == '=') {
                System.out.println("Счётчик");
                System.out.println(state(decimalCounter));
            }
        }
    }
}
