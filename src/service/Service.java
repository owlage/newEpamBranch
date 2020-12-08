package service;

import decimal.Decimal;
import program.Program;
import util.Util;

public class Service {

    public Object obCounter() {
        int number1, number2;
        Util util = new Util();
        System.out.println("Введите 0 если хотите задать значения счётчика по умолчанию" + "\n" +
                "Введите любую цифру и она будет проинициализирована как минимальное значение счётчика");
        number1 = util.numInput();
        if (number1 == 0) {
            Decimal decimalCounter = new Decimal();
            return decimalCounter;
        } else {
            System.out.println("Введите верхнюю границу счётчика");
            number2 = util.numInput();
            if (number1 >= number2) {
                System.out.println("Нижняя граница не может быть больше чем верхняя");
                obCounter();
            }
            Decimal decimalCounter = new Decimal(number1, number2);
            return decimalCounter;
        }
    }

    public int state(Decimal decimalCounter) {
        return decimalCounter.getCount();
    }

    public char showMenuAndMakeChoice() {
        Util util = new Util();
        System.out.println("Выберите операцию" + "\n" +
                '-' + " - уменшение счётчика" + "\n" +
                '+' + " - увеличение счётчика" + "\n" +
                '/' + " - выйти из программы" + "\n" +
                '=' + " - состояние счётчика");
        while (true) {
            char operation = util.aCharInput();
            if (operation == '-' || operation == '+' || operation == '/' || operation == '=') {
                return operation;
            } else {
                continue;
            }
        }
    }

    public void menuShow(char operation, Decimal decimalCounter) {

            switch (operation) {
                case '-':
                    decimalCounter.low();
                    System.out.println("Значение счётчика после уменьшения = " + decimalCounter.getCount());
                    break;
                case '+':
                    decimalCounter.increase();
                    System.out.println("Значение счётчика после увеличения = " + decimalCounter.getCount());
                    break;
                case '=':
                    System.out.println("Счётчик");
                    System.out.println(state(decimalCounter));
                    break;

        }
    }

}


