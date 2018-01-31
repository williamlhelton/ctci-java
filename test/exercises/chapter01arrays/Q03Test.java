package exercises.chapter01arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q03Test {
    private static Q03 objUnderTest;

    @BeforeAll
    static void setUp(){
        objUnderTest = new Q03();
    }

    @Test
    void runMethod01() {
        char[] actual = "dougbaker".toCharArray();
        objUnderTest.runMethod01(actual, 9);
        assertArrayEquals("dougbaker".toCharArray(), actual, "no spaces");
        char[] actual2 = "Mr John Smith    ".toCharArray();
        objUnderTest.runMethod01(actual2, 13);
        assertArrayEquals("Mr%20John%20Smith".toCharArray(), actual2, "two space");
    }

    @Test
    void runMethod02() {
        assertEquals("dougbaker", objUnderTest.runMethod02("dougbaker"), "no spaces");
        assertEquals("doug%20baker", objUnderTest.runMethod02("doug baker  "), "one space");
        assertEquals("do$20ug%20baker", objUnderTest.runMethod02("   do ug baker       "), "multiple spaces");
    }
}