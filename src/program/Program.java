package program;

import payment.Payment;
import service.Service;
import service.ServiceMenu;

import java.util.List;

public class Program {

    public static void main(String[] args) {
        Payment payment = new Payment();
        Service service = new Service();
        ServiceMenu serviceMenu = new ServiceMenu();
        List<Payment.Product> paymentList = service.fillInProduct();
        int i = 0;
        for (Payment.Product product : paymentList) {
            System.out.println(" [" + i++ + "] " + product.toString());
        }
        while (true) {
            int choice = serviceMenu.menu();
            if (choice != 0) {
                serviceMenu.programExecution(choice, paymentList, payment);
            } else {
                break;
            }
        }
    }
}
