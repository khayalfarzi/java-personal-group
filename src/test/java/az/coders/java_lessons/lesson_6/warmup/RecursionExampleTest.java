package az.coders.java_lessons.lesson_6.warmup;

import org.junit.Test;

import static az.coders.java_lessons.lesson_6.warmup.RecursionExample.factorial;
import static org.junit.Assert.assertEquals;

public class RecursionExampleTest {

    @Test
    public void testFactorial() {
        assertEquals(2, factorial(2));
        assertEquals(120, factorial(5));
        assertEquals(720, factorial(6));
    }
}