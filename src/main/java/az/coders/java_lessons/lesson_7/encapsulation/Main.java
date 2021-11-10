package az.coders.java_lessons.lesson_7.encapsulation;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
//        person.name = "Is mail";
//        person.age = 19;
        person.setAge(19);
        person.setName("Is mail");

        System.out.println(person);
        System.out.println(person.getName());
        System.out.println(person.getAge());

        Person person1 = new Person();
//        person1.name = "Khayal";
//        person1.age = -24;
        person1.setName("Khayal");
        person1.setAge(-24);

        System.out.println(person1);
        System.out.println(person1.getAge());
        System.out.println(person1.getName());
    }
}
