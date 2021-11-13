package az.coders.java_lessons.lesson_8.polymorphism;

public class Main {

    public static void main(String[] args) {

        Ability teacher = new Teacher("Khayal", "Farziyev", 24);

        teacher.read("We are learning Polymorphism");
        teacher.write("We are learning Polymorphism");

        System.out.println();

        Ability student = new Student("Ismail", "Nabiyev", 19);
        student.read("I am learning Polymorphism");
        student.write("I am learning Polymorphism");
    }
}
