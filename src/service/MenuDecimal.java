package service;

import decimal.Decimal;
import util.Util;

public class MenuDecimal {

    private Util util = new Util();

    public char showMenuAndMakeChoice() {
        System.out.println("Выберите операцию" + "\n" +
                '-' + " - уменшение счётчика" + "\n" +
                '+' + " - увеличение счётчика" + "\n" +
                '/' + " - выйти из программы" + "\n" +
                '=' + " - состояние счётчика");
        while (true) {
            char operation = util.readingCharFromTheKeyboard();
            if (operation == '-' || operation == '+' || operation == '/' || operation == '=') {
                return operation;
            } else {
                continue;
            }
        }
    }
}
