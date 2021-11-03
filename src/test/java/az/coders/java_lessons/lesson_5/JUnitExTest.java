package az.coders.java_lessons.lesson_5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnitExTest {

    @Test
    public void sqrTest() {
        JUnitEx jUnitEx = new JUnitEx();
        assertEquals(25, jUnitEx.sqr(5));
    }

    @Test
    public void findMaxArrTest() {
        assertEquals(34, JUnitEx.findMaxArr(new int[]{15, 6, 2, 34, 8, 9}));
    }

    @Test
    public void findMaxTest() {
        assertEquals(98, JUnitEx.findMax(45, 98));
    }
}