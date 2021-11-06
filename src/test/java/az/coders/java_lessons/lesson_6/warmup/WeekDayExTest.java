package az.coders.java_lessons.lesson_6.warmup;

import static az.coders.java_lessons.lesson_6.warmup.WeekDayEx.getWeekday;
import static org.junit.Assert.assertEquals;

public class WeekDayExTest {

    public void testGetWeekday() {
        assertEquals("WEDNESDAY", getWeekday(3));
    }
}
