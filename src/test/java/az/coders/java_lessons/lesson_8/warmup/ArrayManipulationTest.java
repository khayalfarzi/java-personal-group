package az.coders.java_lessons.lesson_8.warmup;

import org.junit.Assert;
import org.junit.Test;

import static az.coders.java_lessons.lesson_8.warmup.ArrayManipulation.findDiagSum;
import static az.coders.java_lessons.lesson_8.warmup.ArrayManipulation.findSum;
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

    @Test
    public void testFindSum() {
        /**
         * 1+4+1+4 = 10
         * <p>
         * 5 2
         * <p>
         * 5, 1, 9, 1, 4
         * 4, 9, 1, 4
         * 5, 1, 4
         * 4, 4
         * 0*/
        assertEquals(10, findSum(new int[]{5, 1, 9, 1, 4}, 5, 2));

        /**
         * 1 + 1 +3 + 1 + 1 + 2 + 4 =
         *
         * 9 3
         * 5, 1, 9, 1, 4, 8, 1, 8, 9
         * a  b   c  d  e  f  g  h  x
         *
         * 4, 8, 1, 4, 8, 1, 8, 9
         *
         * 3, 7, 4, 8, 1, 8, 9
         *
         * 4, 1, 8, 1, 8, 9
         *
         * 3, 7, 1, 8, 9
         *
         * 2, 6, 8, 9
         *
         * 4, 6, 9
         *
         * 2, 5
         * */
        assertEquals(13, findSum(new int[]{5, 1, 9, 1, 4, 8, 1, 8, 9}, 9, 3));
    }
}
