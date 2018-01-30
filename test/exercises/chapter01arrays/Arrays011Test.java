package exercises.chapter01arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class Arrays011Test {
    private static Arrays011 objUnderTest;

    @BeforeAll
    static void setUp(){
        objUnderTest = new Arrays011();
    }

    @Test
    void runMethod01() {
        assertTrue(objUnderTest.runMethod01(""), "empty string");
        assertTrue(objUnderTest.runMethod01("asdfjkl;"), "unique string");
        assertFalse(objUnderTest.runMethod01("abcdae"), "duplicate characters");
    }

    @Test
    void runMethod02() {
        assertTrue(objUnderTest.runMethod02(""), "empty string");
        assertTrue(objUnderTest.runMethod02("asdfjkl;"), "unique string");
        assertFalse(objUnderTest.runMethod02("abcdae"), "duplicate characters");
    }
}