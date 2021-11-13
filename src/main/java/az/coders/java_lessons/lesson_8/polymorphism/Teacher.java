package az.coders.java_lessons.lesson_8.polymorphism;

public class Teacher extends Human implements Ability {

    public Teacher(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void read(String msg) {
        System.out.printf("Teacher %s %s , %s years old is reading : \n %s\n",
                getName(),
                getSurname(),
                getAge(),
                msg);
    }

    @Override
    public void write(String msg) {
        System.out.printf("Teacher %s %s , %s years old is writing : \n %s\n",
                getName(),
                getSurname(),
                getAge(),
                msg);
    }
}
