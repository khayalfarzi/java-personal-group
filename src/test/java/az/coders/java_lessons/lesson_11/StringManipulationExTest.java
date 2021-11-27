package az.coders.java_lessons.lesson_11;

import az.coders.java_lessons.lesson_11.warmup.StringManipulationEx;
import org.junit.Assert;
import org.junit.Test;

public class StringManipulationExTest {

    @Test
    public void testWithout2XX() {
        Assert.assertEquals("Hi", StringManipulationEx.without2XX("Hixx"));
        Assert.assertEquals("Hi", StringManipulationEx.without2XX("Hxix"));
        Assert.assertEquals("Hi", StringManipulationEx.without2XX("Hi"));
    }
}
