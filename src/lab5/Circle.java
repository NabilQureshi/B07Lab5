package lab5;

import java.lang.Math;

public class Circle {
	
	Point center;
	double radius;

	public Circle() {
		center = new Point(0, 0);
		radius = 1;
	}

	public Circle(Point p, double r) {
		center = p;
		radius = r;
	}

	public Circle(double x, double y, double r) {
		center = new Point(x, y);
		radius = r;
	}

	public double area() {
		return Math.PI * radius * radius;
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

}
