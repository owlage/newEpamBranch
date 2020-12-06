package program;

import test1.Test1;

public class Program {

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Util util = new Util();
        System.out.println("Начальные значения");
        test1.outputOnDisplay();
        System.out.println("Задайте значения");
        System.out.println("Первое число");
        test1.setNumOne(util.numberInput());
        System.out.println("Второе число");
        test1.setNumTwo(util.numberInput());
        System.out.println("Сумма чисел");
        System.out.println(test1.sum(test1.getNumOne(), test1.getNumTwo()));
        System.out.println("Наибольшее из чисел");
        if (test1.greatTest(test1.getNumOne(), test1.getNumTwo()) == 0) {
            System.out.println("Числа равны");
        } else {
            System.out.println(test1.greatTest(test1.getNumOne(), test1.getNumTwo()));
        }
    }
}
