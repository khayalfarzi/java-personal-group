package az.coders.java_lessons.lesson_12.map;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        List<Person> people = asList(
                new Person(1, "Khayal", 23),
                new Person(2, "svvcds", 24),
                new Person(3, "svvcs", 29));

        System.out.println("Enter id: ");
        int id = sc.nextInt();

        for (Person person : people) {
            if (person.getId() == id)
                System.out.println(person);
        }

    }
}
