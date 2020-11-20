package car;

public class Engine {
    private double power;

    Engine(double power) {
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    static Engine get() {
        Engine engine = new Engine(0);
        engine.power = Car.numInput();
        return engine;
    }
}
