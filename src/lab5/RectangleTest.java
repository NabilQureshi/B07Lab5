package lab5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RectangleTest{

    @Test
    void testArea() {
        Rectangle r = new Rectangle(new Point(0, 0), 4, 5);
        assertEquals(20, r.area());
    }

    @Test
    void testPerimeter() {
        Rectangle r = new Rectangle(new Point(1, 1), 3, 6);
        assertEquals(18, r.perimeter());
    }

    @Test
    void testDefaultConstructor() {
        Rectangle r = new Rectangle();
        assertEquals(1, r.area());
    }
}
