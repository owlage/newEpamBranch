package triangle;

public class Triangle {

    private double sideA, sideB, sideC;
    private Mediana a, b, c;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public Mediana getA() {
        return a;
    }

    public void setA(Mediana a) {
        this.a = a;
    }

    public Mediana getB() {
        return b;
    }

    public void setB(Mediana b) {
        this.b = b;
    }

    public Mediana getC() {
        return c;
    }

    public void setC(Mediana c) {
        this.c = c;
    }

    public Triangle(Mediana a, Mediana b, Mediana c) {
        if (a == null || b == null || c == null) {
            System.out.println("Вы не ввели одну из координат");
        } else {
            sideA = a.distanceTo(b);
            sideB = b.distanceTo(c);
            sideC = a.distanceTo(c);
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}

