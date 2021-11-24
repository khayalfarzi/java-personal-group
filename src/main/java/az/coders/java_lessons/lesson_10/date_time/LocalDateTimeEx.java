package az.coders.java_lessons.lesson_10.date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx {

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy <> HH/mm/ss");
        System.out.println(LocalDateTime.now().format(formatter));
    }
}
