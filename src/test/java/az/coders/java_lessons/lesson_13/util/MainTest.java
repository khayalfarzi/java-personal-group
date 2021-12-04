package az.coders.java_lessons.lesson_13.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    private XList<Integer> xArrayList;

    @Before
    public void set() {
        xArrayList = new XArrayList<>();
    }

    @Test
    public void testMethods() {
        Assert.assertEquals(java.util.Optional.of(5), xArrayList.get(1));
    }
}
