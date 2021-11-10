package az.coders.java_lessons.lesson_7.constructors_modifiers;

public class ConstructorEx {

    private static String name = "Is mail";

    public ConstructorEx() {
        System.out.println("This is default constructor !");

        name = "My name " + name;
    }

    public String getName() {
        return name;
    }
}
