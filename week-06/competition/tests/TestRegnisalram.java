import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by regnisalram on 11/21/16.
 */
public class TestRegnisalram {

    @Test
    public void countHowMany() throws Exception {
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        assertEquals(3, wSource.countHowMany('a'));
    }

    @Test
    public void countHowMany2() throws Exception {
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        assertEquals(2, wSource.countHowMany('T'));
    }

    @Test
    public void countHowMany3() throws Exception {
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        assertEquals(2, wSource.countHowMany('t'));
    }

    @Test
    public void countHowMany4() throws Exception {
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        assertEquals(0, wSource.countHowMany('x'));
    }

    @Test
    public void countHowMany5() throws Exception {
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        assertEquals(1, wSource.countHowMany(' '));
    }

    @Test
    public void countHowMany6() throws Exception {
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        assertEquals(0, wSource.countHowMany('0'));
    }
}
