package az.coders.java_lessons.lesson_16.exercise;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        DataLoader<List<Person>> loader = new CollectionLoader();
        List<Person> people = loader.loadData();

        StreamHelper.sortByAge(people);
    }
}
