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
    public void testGetPressesFromChar() {
        assertEquals(1, pp.getPressesFromChar('a'));
        assertEquals(3, pp.getPressesFromChar('c'));

        assertEquals(1, pp.getPressesFromChar('d'));
        assertEquals(3, pp.getPressesFromChar('f'));

        assertEquals(1, pp.getPressesFromChar('g'));
        assertEquals(3, pp.getPressesFromChar('i'));

        assertEquals(1, pp.getPressesFromChar('j'));
        assertEquals(3, pp.getPressesFromChar('l'));

        assertEquals(1, pp.getPressesFromChar('m'));
        assertEquals(3, pp.getPressesFromChar('o'));

        assertEquals(1, pp.getPressesFromChar('p'));
        assertEquals(4, pp.getPressesFromChar('s'));

        assertEquals(1, pp.getPressesFromChar('t'));
        assertEquals(3, pp.getPressesFromChar('v'));

        assertEquals(1, pp.getPressesFromChar('w'));
        assertEquals(4, pp.getPressesFromChar('z'));
    }

    @Test
    public void getPressesFromString() {
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

    @Test
    public void getNumberRepOfWord() {
        assertEquals("test", pp.getNumberRepOfWord("test"));
    }
}