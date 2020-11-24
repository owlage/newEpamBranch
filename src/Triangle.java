public class Triangle {

    private double sideA, sideB, sideC;

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

    Triangle(Mediana a, Mediana b, Mediana c) {
        if (a == null || b == null || c == null) {
            System.out.println("Вы не ввели одну из координат");
        } else {
            sideA = a.distanceTo(b);
            sideB = b.distanceTo(c);
            sideC = a.distanceTo(c);
        }
    }

    public int checkTriangle() {
        if (sideA * sideB * sideC == 0 || sideA + sideB <= sideC || sideA + sideC <= sideB) {
            System.out.println("Такого треугольника не существует");
            return 0;
        } else {
            return 1;
        }
    }
    double trianglePerimeter() {
        return sideA + sideB + sideC;
    }

    double triangleSquare(Triangle triangle) {
        double p = trianglePerimeter() / 2;
        return Math.sqrt(p * (p - triangle.sideA) * (p - triangle.sideB) * (p - triangle.sideC));
    }

    void triangleMediana(Mediana mediana1, Mediana mediana2, Mediana mediana3) {
        double med1 = (mediana1.getX() + mediana2.getX() + mediana3.getX()) / 3;
        double med2 = (mediana1.getY() + mediana2.getY() + mediana3.getY()) / 3;
        System.out.print("Точка пересечения медиан: ");
        System.out.format("%.2f", med1);
        System.out.print(" ; ");
        System.out.format("%.2f", med2);
    }
}

