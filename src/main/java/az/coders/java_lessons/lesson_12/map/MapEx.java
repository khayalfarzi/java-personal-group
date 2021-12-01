package az.coders.java_lessons.lesson_12.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class MapEx {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Map<Integer, Person> people = new HashMap<>();

        List<Person> peopleList = asList(
                new Person(1, "Khayal", 23),
                new Person(2, "svvcds", 24),
                new Person(3, "svvcs", 29));

        for (Person person : peopleList)
            people.put(person.getId(), person);

        System.out.println("Enter id : ");
        int id = sc.nextInt();
        System.out.println(people.get(id));
    }
}
