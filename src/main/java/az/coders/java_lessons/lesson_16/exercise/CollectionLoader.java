package az.coders.java_lessons.lesson_16.exercise;

import java.util.Collections;
import java.util.List;

public class CollectionLoader implements DataLoader<List<Person>> {

    @Override
    public List<Person> loadData() {
        return Collections.singletonList(
                new Person("Name", "Surname", (byte) 22,
                        new Person("Mother name", "Mother surname", (byte) 66),
                        new Person("Father name", "Father surname", (byte) 66))
        );
    }
}
