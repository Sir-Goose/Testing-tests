import org.junit.Test;

import static org.junit.Assert.*;

public class RecursionTestTest {
    @Test
    public void testFact() {
        assertEquals(120, RecursionTest.fact(5));
        assertEquals(1, RecursionTest.fact(0));
        assertEquals(1, RecursionTest.fact(1));
    }

    @Test
    public void testReverseString() {
        assertEquals("kroWtiseoDwoH", RecursionTest.reverseString("HowDoesitWork"));
        assertEquals("", RecursionTest.reverseString(""));
        assertEquals("a", RecursionTest.reverseString("a"));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(RecursionTest.isPalindrome("amanaplanacanalpanama"));
        assertTrue(RecursionTest.isPalindrome("racecar"));
        assertFalse(RecursionTest.isPalindrome("HowDoesitWork"));
    }

    @Test
    public void testSum() {
        assertEquals(5050, RecursionTest.sum(100));
        assertEquals(0, RecursionTest.sum(0));
        assertEquals(1, RecursionTest.sum(1));
    }
}

