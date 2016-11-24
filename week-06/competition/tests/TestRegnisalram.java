import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by regnisalram on 11/21/16.
 */
public class TestRegnisalram {

    private WordToolbox wSource;
    private WordToolbox tarzanAndJane;

    @Before
    public void setUp() {
        wSource = new WordToolbox("Tarzan's toenails");
        tarzanAndJane = new WordToolbox("Me Tarzan, You Jane");
    }

    @Test
    public void countHowManyCharacter() throws Exception {
        assertEquals(3, wSource.countHowMany('a'));
        assertEquals(2, tarzanAndJane.countHowMany('e'));
    }

    @Test
    public void countHowManyUppercase() throws Exception {
        assertEquals(2, wSource.countHowMany('T'));
    }

    @Test
    public void countHowManyLowercase() throws Exception {
        assertEquals(2, wSource.countHowMany('t'));
    }

    @Test
    public void countHowManyDoesNotHave() throws Exception {
        assertEquals(0, wSource.countHowMany('x'));
        assertEquals(0, tarzanAndJane.countHowMany('x'));
    }

    @Test
    public void countHowManySpace() throws Exception {
        assertEquals(1, wSource.countHowMany(' '));
        assertEquals(3, tarzanAndJane.countHowMany(' '));
    }

    @Test
    public void countHowManyNothing() throws Exception {
        assertEquals(0, wSource.countHowMany('0'));
        assertEquals(0, tarzanAndJane.countHowMany('0'));
    }

    @Ignore ("not ready yet")
    @Test
    public void isAnAnagram() throws Exception {

    }

    @Test
    public void waitingItOut() throws Exception {

    }

    @Test
    public void setS() throws Exception {

    }

    @Test
    public void getS() throws Exception {

    }
}
