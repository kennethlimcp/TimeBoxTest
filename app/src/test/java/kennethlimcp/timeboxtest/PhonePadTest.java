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
        assertEquals(3, pp.getNumberFromChar('c'));

        assertEquals(1, pp.getNumberFromChar('d'));
        assertEquals(3, pp.getNumberFromChar('f'));

        assertEquals(1, pp.getNumberFromChar('g'));
        assertEquals(3, pp.getNumberFromChar('i'));

        assertEquals(1, pp.getNumberFromChar('j'));
        assertEquals(3, pp.getNumberFromChar('l'));

        assertEquals(1, pp.getNumberFromChar('m'));
        assertEquals(3, pp.getNumberFromChar('o'));

        assertEquals(1, pp.getNumberFromChar('p'));
        assertEquals(4, pp.getNumberFromChar('s'));

        assertEquals(1, pp.getNumberFromChar('t'));
        assertEquals(3, pp.getNumberFromChar('v'));

        assertEquals(1, pp.getNumberFromChar('w'));
        assertEquals(4, pp.getNumberFromChar('z'));
    }

    @Test
    public void getPressesFromString() throws Exception {
        assertEquals(0, pp.getPressesFromString(""));
        assertEquals(6, pp.getPressesFromString("abc"));
        assertEquals(6, pp.getPressesFromString("def"));
        assertEquals(6, pp.getPressesFromString("ghi"));
        assertEquals(6, pp.getPressesFromString("jkl"));
        assertEquals(6, pp.getPressesFromString("mno"));
        assertEquals(10, pp.getPressesFromString("pqrs"));
        assertEquals(6, pp.getPressesFromString("tuv"));
        assertEquals(10, pp.getPressesFromString("wxyz"));

        assertEquals(13, pp.getPressesFromString("hello"));
        assertEquals(10, pp.getPressesFromString("aaaaaaaaaa"));

    }
}