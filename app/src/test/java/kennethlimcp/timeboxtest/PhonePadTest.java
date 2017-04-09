package kennethlimcp.timeboxtest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kennethlimcp on 09/Apr/2017.
 */
public class PhonePadTest {
    private PhonePad pp;

    @Before
    public void setUp() {
         pp = new PhonePad();
    }

    @After
    public void tearDown() {
        pp = null;
    }

    @Test
    public void testGetNumberFromChar() {
        assertEquals(1, pp.getNumberFromChar('a'));
        assertEquals(2, pp.getNumberFromChar('e'));
        assertEquals(2, pp.getNumberFromChar('h'));
        assertEquals(2, pp.getNumberFromChar('n'));
        assertEquals(3, pp.getNumberFromChar('r'));
        assertEquals(1, pp.getNumberFromChar('w'));
        assertEquals(4, pp.getNumberFromChar('z'));
    }

    @Test
    public void getPressesFromString() throws Exception {
        assertEquals(0, pp.getPressesFromString("a"));
    }
}