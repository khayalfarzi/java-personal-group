package az.coders.java_lessons.lesson_12;

import org.junit.Test;

import static az.coders.java_lessons.lesson_12.warmup.ArrayManipulation.sort;
import static org.junit.Assert.assertEquals;

public class ArrayManipulationExTest {

    @Test
    public void testSort() {
        assertEquals(new int[]{1, 2, 3, 4, 8, 9}, sort(new int[]{3, 8, 1, 2, 9, 4}));
        assertEquals(new int[]{7, 9, 12, 13}, sort(new int[]{9, 7, 13, 12}));
    }
}
