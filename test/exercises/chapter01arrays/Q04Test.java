package exercises.chapter01arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q04Test {
    private static Q04 objUnderTest;

    @BeforeAll
    static void setUp(){
        objUnderTest = new Q04();
    }

    @Test
    void runMethod01() {
        assertTrue(objUnderTest.runMethod01(""), "empty string");
        assertTrue(objUnderTest.runMethod01("asdfdsa"), "already palindrome");
        assertTrue(objUnderTest.runMethod01("asdfasdf"), "valid palindrome");
        assertTrue(objUnderTest.runMethod01("asdfd  sa"), "valid palindrome with spaces");

        assertFalse(objUnderTest.runMethod01("asdfd fsaz"), "not palindrome");
        assertFalse(objUnderTest.runMethod01(" aaa"), "not palindrome");
    }
}