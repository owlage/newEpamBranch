package program;

import payment.Payment;
import service.Service;

import java.util.List;

public class Program {

    public void showMenu() {
        Payment payment = new Payment();
        Util util = new Util();
        Service service = new Service();
        List<Payment.Product> paymentList = service.fillInProduct();
        int i = 0;
        for (Payment.Product product : paymentList) {
            System.out.println(" [" + i++ + "] " + product.toString());
        }
        while (true) {
            System.out.println("Выберите команду:\n" +
                    "0 - выход\n" +
                    "1 - показать список доступных товаров\n" +
                    "2 - купить товар\n" +
                    "3 - список всех купленых товаров");

            int choice = util.readNumConsole();
            if (choice == 0) {
                break;
            }
            if (choice < 1 || choice > 3) {
                System.out.println("Повторите ввод");
                continue;
            }
            switch (choice) {
                case 1:
                    i = 0;
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
                        continue;
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


    public static void main(String[] args) {
        Program program = new Program();
        program.showMenu();
    }
}
