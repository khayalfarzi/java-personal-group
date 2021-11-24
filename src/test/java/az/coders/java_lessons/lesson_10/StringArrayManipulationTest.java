package az.coders.java_lessons.lesson_10;

import az.coders.java_lessons.lesson_10.warmup.StringArrayManipulation;
import org.junit.Assert;
import org.junit.Test;

import static az.coders.java_lessons.lesson_10.warmup.StringArrayManipulation.findDuplicateElements;
import static org.junit.Assert.assertEquals;

public class StringArrayManipulationTest {

    //Write a Java program to find the duplicate values of an array of string values
    @Test
    public void testFindDuplicateElements() {
        assertEquals(
                new String[]{"Hi", "Hello", "HI"},
                findDuplicateElements(new String[]{"Hi", "Hello", "Hello", "Hi", "Java", "java", "Javaa", "HI", "HI"}));
    }
}
