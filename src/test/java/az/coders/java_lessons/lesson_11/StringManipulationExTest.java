package az.coders.java_lessons.lesson_11;

import az.coders.java_lessons.lesson_11.warmup.StringManipulationEx;
import org.junit.Assert;
import org.junit.Test;

import static az.coders.java_lessons.lesson_11.warmup.StringManipulationEx.without2XX;
import static az.coders.java_lessons.lesson_11.warmup.StringManipulationEx.withoutX2;
import static org.junit.Assert.assertEquals;

public class StringManipulationExTest {

    @Test
    public void testWithout2XX() {
        assertEquals("Hi", without2XX("Hixx"));
        assertEquals("Hi", without2XX("Hxix"));
        assertEquals("Hi", without2XX("Hi"));
    }

    @Test
    public void testWithoutX2() {
        assertEquals("Hi", withoutX2("xHixx"));
        assertEquals("Hxi", withoutX2("Hxix"));
        assertEquals("Hxi", withoutX2("Hxi"));
    }
}
