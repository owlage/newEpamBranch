package car;

public class Wheel {
    private double diameter;

    Wheel(double diameter) {
        this.diameter = diameter;
    }

   public double getDiameter() {
        return diameter;
    }

    static Wheel get() {
        System.out.println("Введите диаметр колеса");
        Wheel wheel = new Wheel(0.0);
        wheel.diameter = Car.numInput();
        return wheel;
    }
}
