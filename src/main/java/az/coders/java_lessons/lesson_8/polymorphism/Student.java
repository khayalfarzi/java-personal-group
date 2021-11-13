package az.coders.java_lessons.lesson_8.polymorphism;

import java.io.Serializable;

public class Student extends Human implements Ability, Serializable, Cloneable {

    public Student(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void read(String msg) {
        System.out.printf("Student %s %s , %s years old is reading : \n %s\n",
                getName(),
                getSurname(),
                getAge(),
                msg);
    }

    @Override
    public void write(String msg) {
        System.out.printf("Student %s %s , %s years old is writing : \n %s\n",
                getName(),
                getSurname(),
                getAge(),
                msg);
    }

    @Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
