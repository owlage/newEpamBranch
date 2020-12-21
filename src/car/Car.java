package car;

/*
2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, менять колесо,
вывести на консоль марку автомобиля.
 */

public class Car {
    private Wheel wheels[];
    private Engine engine;
    private String brand;
    private double consumption;
    private double fuelLevel;

    public Car(Engine engine, String brand, double consumption, double fuelLevel) {
        this.wheels = new Wheel[4];
        this.engine = engine;
        this.brand = brand;
        this.consumption = consumption;
        this.fuelLevel = fuelLevel;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public String toString() {
        String string = "";
        string += "Бренд:" + brand + " Обьем двигателя:" + engine.getPower() + "; "
                + "Потребление: " + consumption + "L/100km { " + fuelLevel + " }; диаметр колес [";
        for (int i = 0; i < 4; ++i) {
            string += wheels[i].getDiameter() + " ";
        }
        return string + "]";
    }
}
