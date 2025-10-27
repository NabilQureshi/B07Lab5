package lab5;

public class Rectangle {
    Point origin;
    double width;
    double height;

    public Rectangle() {
        origin = new Point(0, 0);
        width = 1;
        height = 1;
    }

    public Rectangle(Point p, double w, double h) {
        origin = p;
        width = w;
        height = h;
    }

    public Rectangle(double x, double y, double w, double h) {
        origin = new Point(x, y);
        width = w;
        height = h;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }
}
