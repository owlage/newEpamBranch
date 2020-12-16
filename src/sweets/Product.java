package sweets;

import wrap.Type;

public abstract class Product {

    private String name;
    private int weight;
    private double price;

    Product(String name, int weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public abstract Type getType();

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
