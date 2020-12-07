import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Util util = new Util();
        System.out.println("Введите 6 координат точек через enter, для построения треугольника");
        Mediana a = new Mediana(util.numInput(),util.numInput());
        Mediana b = new Mediana(util.numInput(),util.numInput());
        Mediana c = new Mediana(util.numInput(),util.numInput());
        Triangle triangle = new Triangle(a, b, c);
        if(triangle.checkTriangle() == 1) {
            System.out.print("Периметр треугольника = ");
            System.out.format("%.2f", triangle.trianglePerimeter());
            System.out.println();
            System.out.print("Площадь треугольника = ");
            System.out.format("%.2f", triangle.triangleSquare(triangle));
            System.out.println();
            triangle.triangleMediana(a, b, c);
        }

    }
}
