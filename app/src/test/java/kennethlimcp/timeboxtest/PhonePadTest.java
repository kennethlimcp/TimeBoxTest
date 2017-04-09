package kennethlimcp.timeboxtest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

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

        assertEquals(-1, pp.getPressesFromChar('1'));
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
    public void getNumberRepOfChar() {
        assertEquals(2, pp.getNumberRepOfChar('c'));
        assertEquals(3, pp.getNumberRepOfChar('f'));
        assertEquals(4, pp.getNumberRepOfChar('i'));
        assertEquals(5, pp.getNumberRepOfChar('l'));
        assertEquals(6, pp.getNumberRepOfChar('o'));
        assertEquals(7, pp.getNumberRepOfChar('s'));
        assertEquals(8, pp.getNumberRepOfChar('v'));
        assertEquals(9, pp.getNumberRepOfChar('z'));
    }

    @Test
    public void getNumberRepOfWord() {
        assertEquals("43556", pp.getNumberRepOfWord("hello"));
        assertEquals("23456789", pp.getNumberRepOfWord("behknruy"));
        assertEquals("9", pp.getNumberRepOfWord("Z"));
    }

    @Test
    public void testGetPossibleWordsFromNum() {
        List l1 = pp.getPossibleWordsFromNum("2355");

        assertEquals(2, l1.size());
        assertTrue("bell",l1.contains("bell"));
        assertTrue("cell",l1.contains("cell"));

        List l2 = pp.getPossibleWordsFromNum("2");
        assertEquals(6, l2.size());
        assertTrue("A",l2.contains("A"));
        assertTrue("a",l2.contains("a"));
        assertTrue("B",l2.contains("B"));
        assertTrue("b",l2.contains("b"));
        assertTrue("C",l2.contains("C"));
        assertTrue("c",l2.contains("c"));

        List l3 = pp.getPossibleWordsFromNum("0");
        assertEquals(0, l3.size());
    }

    @Test
    public void TestGetWordCombisFromNum() throws Exception {
        List<String> l1 = new LinkedList();
        l1.add("p");
        l1.add("q");
        l1.add("r");
        l1.add("s");

        List l2 = pp.getWordCombisFromNum("7");

        assertArrayEquals(l1.toArray(), l2.toArray());

        List<String> l3 = new LinkedList();
        l3.add("dw");
        l3.add("dx");
        l3.add("dy");
        l3.add("dz");
        l3.add("ew");
        l3.add("ex");
        l3.add("ey");
        l3.add("ez");
        l3.add("fw");
        l3.add("fx");
        l3.add("fy");
        l3.add("fz");

        List l4 = pp.getWordCombisFromNum("39");

        assertArrayEquals(l3.toArray(), l4.toArray());

    }
}