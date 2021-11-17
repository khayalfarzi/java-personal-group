package az.coders.java_lessons.lesson_9.inner;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.setAge(23);
        person.setName("Name");
        Person.Gender gender = new Person.Gender();
        person.setGender(gender);

        System.out.println(person);
    }
}
