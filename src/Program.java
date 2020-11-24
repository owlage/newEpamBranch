
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Customers customers = new Customers();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "Выберете пункт меню:\n" +
                            "0. выйти\n" +
                            "1. добавить покупателя\n" +
                            "2. вывод покупателей в алфавитном порядке\n" +
                            "3. вывод покупателей с кредитной картой в интервале\n");
            int choice = sc.nextInt();
            if (choice == 0)
                break;
            if (choice < 1 || choice > 3) {
                System.out.println("выбран неправильный пункт меню, повторите ввод.");
                continue;
            }
            switch (choice) {
                case 1:
                    customers.push_back(Customer.getCustomer());
                    break;
                case 2:
                    customers.sortByName();
                    customers.print();
                    break;
                case 3:
                    System.out.println("Введи диапазон кредитных карт\n");
                    System.out.println("От: ");
                    long a = Util.number();
                    System.out.println("До: ");
                    long b = Util.number();
                    customers.print_if_card_in(a, b);
            }
        }
    }
}
