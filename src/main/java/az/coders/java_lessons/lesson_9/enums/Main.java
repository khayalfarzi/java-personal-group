package az.coders.java_lessons.lesson_9.enums;

public class Main {

    public static void main(String[] args) {

        System.out.println(GenderE.MALE);
        System.out.println(GenderE.FEMALE);

        for (DayOfWeek day : DayOfWeek.values())
            System.out.println(day);

    }
}
