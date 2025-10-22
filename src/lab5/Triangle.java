package lab5;

import lab5.Point;

public class Triangle {
    private Point A;
    private Point B;
    private Point C;

    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double perimeter() {
        return A.distance(B) + B.distance(C) + C.distance(A);
    }

    public boolean isEquilateral() {
        double dAB = A.distance(B);
        double dBC = B.distance(C);
        double dCA = C.distance(A);
        double epsilon = 1e-6; // 容差，防止浮点比较误差
        return Math.abs(dAB - dBC) < epsilon &&
               Math.abs(dBC - dCA) < epsilon;
    }

    @Override
    public String toString() {
        return "Triangle[" + A + ", " + B + ", " + C + "]";
    }
}
