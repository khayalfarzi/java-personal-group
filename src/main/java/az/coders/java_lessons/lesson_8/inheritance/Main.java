package az.coders.java_lessons.lesson_8.inheritance;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        person.setAge(12);

        Engineer engineer = new Engineer("Java developer", BigDecimal.valueOf(2354.98));
        System.out.println(engineer.toString());
    }
}
