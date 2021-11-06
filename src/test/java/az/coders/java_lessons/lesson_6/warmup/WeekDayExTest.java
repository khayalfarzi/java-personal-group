package az.coders.java_lessons.lesson_6.warmup;

import org.junit.Test;

import static az.coders.java_lessons.lesson_6.warmup.WeekDayEx.getWeekday;
import static org.junit.Assert.assertEquals;

public class WeekDayExTest {

    @Test
    public void testGetWeekday() {
        assertEquals("WEDNESDAY", getWeekday(3));
    }
}
