package az.coders.java_lessons.lesson_8.warmup;

import org.junit.Assert;
import org.junit.Test;

import static az.coders.java_lessons.lesson_8.warmup.ArrayManipulation.findDiagSum;
import static org.junit.Assert.assertEquals;

public class ArrayManipulationTest {

    /**
     * 1 2 3
     * 4 5 6
     * 7 8 9
     */
    @Test
    public void testFindDiagSum() {
        assertEquals(25, findDiagSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }
}
