import java.util.Scanner;

public class Program {

    public int number1, number2;

    public static Object obCounter() {
        Program program = new Program();
        Util util = new Util();
        System.out.println("Введите 0 если хотите задать значения счётчика по умолчанию" + "\n" +
                "Введите любую цифру и она будет проинициализирована как минимальное значение счётчика");
        program.number1 = util.numInput();
        if (program.number1 == 0) {
            Decimal decimalCounter = new Decimal();
            return decimalCounter;
        } else {
            System.out.println("Введите верхнюю границу счётчика");
            program.number2 = util.numInput();
            if (program.number1 >= program.number2) {
                System.out.println("Нижняя граница не может быть больше чем верхняя");
                obCounter();
            }
            Decimal decimalCounter = new Decimal(program.number1, program.number2);
            return decimalCounter;
        }
    }

    public int state(Decimal decimalCounter) {
        return decimalCounter.getCount();
    }

    public static void main(String[] args) {
        Util util = new Util();
        Program program = new Program();
        Decimal decimalCounter = (Decimal) obCounter();
        System.out.println("Для того что бы узнать текущее состояние счётчика введите" + "\n" +
                '-' + " - уменшение счётчика" + "\n" +
                '+' + " - увеличение счётчика" + "\n" +
                '/' + " - выйти из программы" + "\n" +
                '=' + " - состояние счётчика");
        char operation = 0;
        while (operation != '/') {
            operation = util.aCharInput();
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
                System.out.println(program.state(decimalCounter));
            }
        }
    }
}
