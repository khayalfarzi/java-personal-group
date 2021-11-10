package az.coders.java_lessons.lesson_7.warmup;

import org.junit.Test;

import static az.coders.java_lessons.lesson_7.warmup.StringManipulations.getUniqueString;
import static org.junit.Assert.assertEquals;

public class StringManipulationsTest {

    @Test
    public void testGetUniqueString() {
        assertEquals("Hello world", getUniqueString("Hello Hello world World"));
        assertEquals("Bla", getUniqueString("Bla Bla bla"));
        assertEquals("My name is Ismayil", getUniqueString("My my name is is Ismayil"));
    }
}
