import static org.junit.Assert.*;
import org.junit.Test;
import lab5.Point;

public class TrapezoidTest {
    
    @Test
    public void testCreate() {
        Point a = new Point(0, 0);
        Point b = new Point(6, 0);
        Point c = new Point(3, 3);
        Point d = new Point(1, 2);
        
        Trapezoid trapezoid = new Trapezoid(a, b, c, d);
        assertNotNull(trapezoid);
    }
    
    @Test
    public void testPerimeter() {
        // Create the same points as the example
        Point a = new Point(0, 0);
        Point b = new Point(6, 0);
        Point c = new Point(3, 3);
        Point d = new Point(1, 2);
        
        Trapezoid trapezoid = new Trapezoid(a, b, c, d);
        
        double expected = 14.71747766;
        double actual = trapezoid.perimeter();
        
        assertEquals(expected, actual, 0.0001);
    }
    
    @Test
    public void testArea() {
        // Set up the points
        Point a = new Point(0, 0);
        Point b = new Point(6, 0);
        Point c = new Point(3, 3);
        Point d = new Point(1, 2);
        
        Trapezoid trapezoid = new Trapezoid(a, b, c, d);
        
        assertEquals(10.5, trapezoid.area(), 0.0001);
    }
    
    @Test
    public void testToString() {
        // Setup
        Point a = new Point(0, 0);
        Point b = new Point(6, 0);
        Point c = new Point(3, 3);
        Point d = new Point(1, 2);
        
        Trapezoid trapezoid = new Trapezoid(a, b, c, d);
        
        String expected = "Trapezoid[(0.0, 0.0), (6.0, 0.0), (3.0, 3.0), (1.0, 2.0)]";
        
        assertEquals(expected, trapezoid.toString());
    }
    
    @Test
    public void testRectangleShape() {
        // Rectangle points
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(4, 3);
        Point d = new Point(0, 3);
        
        Trapezoid trapezoid = new Trapezoid(a, b, c, d);
        
        assertEquals(14.0, trapezoid.perimeter(), 0.0001); // 2*(width+height)
        assertEquals(12.0, trapezoid.area(), 0.1);         // width*height
    }
}