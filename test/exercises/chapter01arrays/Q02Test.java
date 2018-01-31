package exercises.chapter01arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q02Test {
    private static Q02 objUnderTest;

    @BeforeAll
    static void setUp(){
        objUnderTest = new Q02();
    }

    @Test
    void runMethod01() {
        assertTrue(objUnderTest.runMethod01("", ""), "empty strings");
        assertTrue(objUnderTest.runMethod01("abc", "bca"), "permutation");
        assertTrue(objUnderTest.runMethod01("abc", "abc"), "identical strings");

        assertFalse(objUnderTest.runMethod01("abc", "ab"), "different lengths");
        assertFalse(objUnderTest.runMethod01("abc123", "321cda"), "same length, not permutation");
        assertFalse(objUnderTest.runMethod01(null, "abc"), "one null string");
    }

    @Test
    void runMethod02() {
        assertTrue(objUnderTest.runMethod02("", ""), "empty strings");
        assertTrue(objUnderTest.runMethod02("abc", "bca"), "permutation");
        assertTrue(objUnderTest.runMethod02("abc", "abc"), "identical strings");

        assertFalse(objUnderTest.runMethod02("abc", "ab"), "different lengths");
        assertFalse(objUnderTest.runMethod02("abc123", "321cda"), "same length, not permutation");
        assertFalse(objUnderTest.runMethod02(null, "abc"), "one null string");
    }
}