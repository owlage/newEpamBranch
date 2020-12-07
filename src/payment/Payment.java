package payment;

import java.util.ArrayList;
import java.util.List;

public class Payment {

    private List<Product> productList;
    private double cost;

    public Payment(){
        productList = new ArrayList<>();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public static class Product {

        private String productName;
        private double productPrice;

        public Product(String productName, double productPrice) {
            this.productName = productName;
            this.productPrice = productPrice;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductType(String productName) {
            this.productName = productName;
        }

        public double getProductPrice() {
            return productPrice;
        }

        public void setProductPrice(double productPrice) {
            this.productPrice = productPrice;
        }

        public String toString(){
            return "Товар: " + getProductName() + "| цена: " + getProductPrice() + " $";
        }
    }
}


