package az.coders.java_lessons.lesson_9.abstraction;

import az.coders.java_lessons.lesson_9.enums.GenderE;

public class Person extends Human {

    private GenderE gender;

    public GenderE getGender() {
        return gender;
    }

    public void setGender(GenderE gender) {
        this.gender = gender;
    }

    @Override
    public void run() {
        System.out.println("Person is running...");
    }
}

enum Gender {
    MALE, FEMALE
}