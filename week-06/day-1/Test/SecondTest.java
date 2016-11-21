import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by regnisalram on 11/21/16.
 */
public class SecondTest {
    @Test
    public void sum() throws Exception {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 2, 4, 6, 8, 10);
        assertEquals(30, Second.sum(numbers));
    }

    @Test
    public void sum2() throws Exception {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        assertEquals(2, Second.sum(numbers));
    }

    @Test (expected = NullPointerException.class)
    public void sum3() throws Exception {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(null);
        assertEquals(null, Second.sum(numbers));
    }
}