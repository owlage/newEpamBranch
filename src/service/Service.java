package service;

import payment.*;

import java.util.ArrayList;
import java.util.List;

public class Service {

    public List<Payment.Product> fillInProduct() {
        List<Payment.Product> paymentList = new ArrayList<>();

        paymentList.add(new Payment.Product("Бройлер", 2.5));
        paymentList.add(new Payment.Product("Суп. набор", 1.2));
        paymentList.add(new Payment.Product("Филе куриное", 2));
        paymentList.add(new Payment.Product("Колбаса вареная", 1.5));
        paymentList.add(new Payment.Product("Колбаса в/к", 1.5));
        paymentList.add(new Payment.Product("Колбаса с/к", 1.6));
        paymentList.add(new Payment.Product("Бананы", 1.3));
        paymentList.add(new Payment.Product("Яблоки", 1.1));
        paymentList.add(new Payment.Product("Груши", 1));
        paymentList.add(new Payment.Product("Морковь", 0.9));
        paymentList.add(new Payment.Product("Томаты", 1.6));
        paymentList.add(new Payment.Product("Сгущенка", 2));
        paymentList.add(new Payment.Product("Молоко", 1));
        paymentList.add(new Payment.Product("Хлеб \"Богатырский\"", 0.5));
        paymentList.add(new Payment.Product("Водка \"Хмельная\"", 3));
        paymentList.add(new Payment.Product("Конфеты \"Умка\"", 1.7));
        return paymentList;
    }
}
