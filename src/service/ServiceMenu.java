package service;

import payment.Payment;
import util.Util;

import java.util.List;

public class ServiceMenu {

    private Util util = new Util();

    public int menu() {
        System.out.println("Выберите команду:\n" +
                "0 - выход\n" +
                "1 - показать список доступных товаров\n" +
                "2 - купить товар\n" +
                "3 - список всех купленых товаров");
        while (true) {
            int choice = util.readNumConsole();
            if (choice < 0 || choice > 3) {
                System.out.println("Повторите ввод");
                continue;
            } else {
                return choice;
            }
        }
    }

    public void programExecution(int choice, List<Payment.Product> paymentList, Payment payment) {
        switch (choice) {
            case 1:
                int i = 0;
                for (Payment.Product product : paymentList) {
                    System.out.println(" [" + i++ + "] " + product.toString());
                }
                break;
            case 2:
                System.out.println("Выберите номер товара");
                int readNum = util.readNumConsole();
                if (readNum < paymentList.size()) {
                    payment.getProductList().add(paymentList.get(readNum));
                    break;
                } else {
                    System.out.println("Недопустимый ввод");
                    break;
                }
            case 3:
                double sum = 0;
                for (Payment.Product product : payment.getProductList()) {
                    System.out.println(product.toString());
                    sum += product.getProductPrice();
                }
                System.out.println("Сумма покупок: " + sum + " $");
                break;
        }
    }
}
