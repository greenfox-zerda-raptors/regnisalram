import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by regnisalram on 11/21/16.
 */
public class AppleTest {
    @Test
    public void getName() throws Exception {
        Apple myObject = new Apple();
        assertEquals("apple", myObject.getName());
//        assertEquals("pineapple", myObject.getName());
    }
}