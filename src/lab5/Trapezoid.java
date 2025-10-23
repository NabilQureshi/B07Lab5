package lab5;

import lab5.Point;

public class Trapezoid {
    private Point A;
    private Point B;
    private Point C;
    private Point D;

    public Trapezoid(Point A, Point B, Point C, Point D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public double perimeter() {
        return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
    }

    // we define area using the formula:
    // area = AB * BC * sin(ABC) + CD * DA * sin(CDA)
    // this assumes the figure is a general quadrilateral, not necessarily perfectly parallel
    // but for a trapezoid with AB || CD, this formula still gives a valid area approximation.
    public double area() {
        double AB = A.distance(B);
        double BC = B.distance(C);
        double CD = C.distance(D);
        double DA = D.distance(A);

        // --- Compute sin(ABC) ---
        double dot1 = (A.getX() - B.getX()) * (C.getX() - B.getX()) + (A.getY() - B.getY()) * (C.getY() - B.getY());
        double cos1 = dot1 / (AB * BC);
        double sin1 = Math.sqrt(1 - Math.pow(cos1, 2));

        // --- Compute sin(CDA) ---
        double dot2 = (C.getX() - D.getX()) * (A.getX() - D.getX()) + (C.getY() - D.getY()) * (A.getY() - D.getY());
        double cos2 = dot2 / (CD * DA);
        double sin2 = Math.sqrt(1 - Math.pow(cos2, 2));

        // --- Approximate total area ---
        // basically treating it as two triangles: ABC and CDA
        double area1 = 0.5 * AB * BC * sin1;
        double area2 = 0.5 * CD * DA * sin2;

        return area1 + area2;
    }

    @Override
    public String toString() {
        return "Trapezoid[" + A + ", " + B + ", " + C + ", " + D + "]";
    }
    
    // this is a simple test for me to check if my code is correct, you can copy it if you like
    /*
     * public static void main(String[] args) {
    	Point A = new Point(0, 0);
    	Point B = new Point(6, 0);
    	Point C = new Point(3, 3);
    	Point D = new Point(1, 2);
    	Trapezoid tra = new Trapezoid(A, B, C, D);
    	
    	// test the perimeter function
    	double per = tra.perimeter();
    	System.out.println("The perimeter of the trapezoid: " + per); // it should be 14.71747766
    	
    	// test the area function
    	double s = tra.area();
    	System.out.println("The area of the trapezoid: " + s); // it should be 10.5
    	
    	// test the toString function
    	System.out.println(tra); // it should be Trapezoid[(0.0, 0.0), (6.0, 0.0), (3.0, 3.0), (1.0, 2.0)]
    }
     */
}
