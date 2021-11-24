package az.coders.java_lessons.lesson_10.date_time;

import java.time.LocalTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeEx {

    public static void main(String[] args) {
        System.out.println(LocalTime.now());

        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH/mm/ss");
        System.out.println(time.format(formatter));

        System.out.println();

        LocalTime time1 = LocalTime.of(21, 12, 24);
        System.out.println(time1);

        System.out.println(time1.format(formatter));
    }
}
