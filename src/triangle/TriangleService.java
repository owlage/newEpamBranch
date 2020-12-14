package triangle;

import util.Util;

public class TriangleService {

    public Triangle createTriangle() {
        Util util = new Util();
        System.out.println("Введите 6 координат точек через enter, для построения треугольника");
        Mediana a = new Mediana(util.readingNumberFromTheKeyboard(), util.readingNumberFromTheKeyboard());
        Mediana b = new Mediana(util.readingNumberFromTheKeyboard(), util.readingNumberFromTheKeyboard());
        Mediana c = new Mediana(util.readingNumberFromTheKeyboard(), util.readingNumberFromTheKeyboard());
        Triangle triangle = new Triangle(a, b, c);
        return triangle;
    }

    public int checkTriangle(Triangle triangle) {
        if (triangle.getSideA() * triangle.getSideB() * triangle.getSideC() == 0 ||
                triangle.getSideA() + triangle.getSideB() <= triangle.getSideC() ||
                triangle.getSideA() + triangle.getSideC() <= triangle.getSideB()) {
            System.out.println("Такого треугольника не существует");
            return 0;
        } else {
            return 1;
        }
    }
    public double trianglePerimeter(Triangle triangle) {
        return triangle.getSideA() + triangle.getSideB() + triangle.getSideC();
    }

    public double triangleSquare(Triangle triangle) {
        double p = trianglePerimeter(triangle) / 2;
        return Math.sqrt(p * (p - triangle.getSideA()) * (p - triangle.getSideB()) * (p - triangle.getSideC()));
    }

    public void triangleMediana(Mediana mediana1, Mediana mediana2, Mediana mediana3) {
        double med1 = (mediana1.getX() + mediana2.getX() + mediana3.getX()) / 3;
        double med2 = (mediana1.getY() + mediana2.getY() + mediana3.getY()) / 3;
        System.out.print("Точка пересечения медиан: ");
        System.out.format("%.2f", med1);
        System.out.print(" ; ");
        System.out.format("%.2f", med2);
    }

    public void showPerimeterAndSquareTriangle(Triangle triangle){
        if(checkTriangle(triangle) == 1) {
            System.out.print("Периметр треугольника = ");
            System.out.format("%.2f", trianglePerimeter(triangle));
            System.out.println();
            System.out.print("Площадь треугольника = ");
            System.out.format("%.2f", triangleSquare(triangle));
            System.out.println();
            triangleMediana(triangle.getA(),triangle.getB(),triangle.getC());
        }
    }
}
