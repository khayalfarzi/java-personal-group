package az.coders.java_lessons.lesson_6.warmup;

import org.junit.Test;

import static az.coders.java_lessons.lesson_6.warmup.NaturalNumbers.sumNaturalNumbers;
import static az.coders.java_lessons.lesson_6.warmup.NaturalNumbers.sumSimpleNumbers;
import static org.junit.Assert.assertEquals;

public class NaturalNumbersTest {

    @Test
    public void testSumNaturalNumbers() {
        assertEquals(15, sumNaturalNumbers(5));
        assertEquals(3, sumNaturalNumbers(2));
        assertEquals(45, sumNaturalNumbers(9));
    }

    @Test
    public void testSumSimpleNumbers() {
        assertEquals(6, sumSimpleNumbers(3));
        assertEquals(18, sumSimpleNumbers(5));
        assertEquals(42, sumSimpleNumbers(7));
    }
}