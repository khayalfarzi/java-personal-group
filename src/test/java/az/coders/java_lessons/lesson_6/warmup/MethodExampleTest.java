package az.coders.java_lessons.lesson_6.warmup;

import org.junit.Test;

import static az.coders.java_lessons.lesson_6.warmup.MethodExample.findVowelsCount;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MethodExampleTest {

    @Test
    public void testContainsVowel() {
        assertTrue(MethodExample.containsVowel('a'));
    }

    public void testFindVowelsCount() {
        assertEquals(11, findVowelsCount("Hey Java Unit test and clean code"));
    }
}
