package lab5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    void testDefaultConstructor() {
        Rectangle r = new Rectangle();
        assertEquals(1.0, r.area(), 0.001);
        assertEquals(4.0, r.perimeter(), 0.001);
    }

    @Test
    void testConstructorWithPoint() {
        Point p = new Point(2, 3);
        Rectangle r = new Rectangle(p, 4, 5);
        assertEquals(20.0, r.area(), 0.001);
        assertEquals(18.0, r.perimeter(), 0.001);
    }

    @Test
    void testConstructorWithCoordinates() {
        Rectangle r = new Rectangle(1, 1, 2, 3);
        assertEquals(6.0, r.area(), 0.001);
        assertEquals(10.0, r.perimeter(), 0.001);
    }

    @Test
    void testAreaCalculation() {
        Rectangle r = new Rectangle(new Point(0, 0), 3, 7);
        assertEquals(21.0, r.area(), 0.001);
    }

    @Test
    void testPerimeterCalculation() {
        Rectangle r = new Rectangle(new Point(0, 0), 3, 7);
        assertEquals(20.0, r.perimeter(), 0.001);
    }
}

