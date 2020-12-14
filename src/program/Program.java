package program;

import triangle.Triangle;
import triangle.TriangleService;

public class Program {

    public static void main(String[] args) {
        TriangleService triangleService = new TriangleService();
        Triangle triangle = triangleService.createTriangle();
        if (triangleService.checkTriangle(triangle) == 1) {
            triangleService.showPerimeterAndSquareTriangle(triangle);
        }
    }
}
