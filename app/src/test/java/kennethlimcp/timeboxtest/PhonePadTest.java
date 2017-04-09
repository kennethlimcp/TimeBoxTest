package kennethlimcp.timeboxtest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kennethlimcp on 09/Apr/2017.
 */
public class PhonePadTest {

    @Test
    public void testGetNumberFromChar() {
        PhonePad pp = new PhonePad();
        assertEquals(1, pp.getNumberFromChar('a'));
        assertEquals(2, pp.getNumberFromChar('e'));
        assertEquals(2, pp.getNumberFromChar('h'));
        assertEquals(2, pp.getNumberFromChar('n'));
        assertEquals(3, pp.getNumberFromChar('r'));
        assertEquals(1, pp.getNumberFromChar('w'));
        assertEquals(4, pp.getNumberFromChar('z'));
    }
}