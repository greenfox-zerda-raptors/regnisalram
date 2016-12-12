import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by regnisalram on 12/2/16.
 */
public class CircleTest {

    @Test
    public void countObjectsTest() throws Exception {
        assertEquals(4, Circle.countObjects());
    }

    @Test
    public void getPerimeterTest1() throws Exception {
        Circle karika = new Circle();
        assertEquals(2 * Math.PI, karika.getPerimeter(), 0.5);
    }

    @Test
    public void getPerimeterTest2() throws Exception {
        Circle karika = new Circle(2);
        assertEquals(4 * Math.PI, karika.getPerimeter(), 0.5);
    }

    @Test
    public void getAreaTest1() throws Exception {
        Circle karika = new Circle();
        assertEquals(Math.PI, karika.getArea(), 0.5);
    }

    @Test
    public void getAreaTest2() throws Exception {
        Circle karika = new Circle(2);
        assertEquals(Math.PI * 4, karika.getArea(), 0.5);
    }
}