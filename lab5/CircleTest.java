package lab5;

import static org.junit.Assert.*;
import org.junit.Test;

public class CircleTest {

    @Test
    public void testCreate() {
        Point p = new Point(2, -3);
        Circle c = new Circle(p, 4);
        assertNotNull(c);
    }

    @Test
    public void testPerimeter() {
        // 2 * pi * r for r = 3
        Circle c = new Circle(0, 0, 3);
        double expected = 2 * Math.PI * 3;
        double actual = c.perimeter();
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testArea() {
        // pi * r^2 for r = 3
        Circle c = new Circle(0, 0, 3);
        double expected = Math.PI * 9; 
        double actual = c.area();
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testUnitCircleDefaults() {
        // default should be center (0,0) and r = 1
        Circle c = new Circle();
        assertEquals(new Point(0.0, 0.0), c.center);
        assertEquals(1.0, c.radius, 1e-9);
        assertEquals(Math.PI, c.area(), 1e-9);
        assertEquals(2.0 * Math.PI, c.perimeter(), 1e-9);
    }
}
