package az.coders.java_lessons.lesson_10.date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocalDateEx {

    public static void main(String[] args) {

        System.out.println(LocalDate.now());

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yy");
        System.out.println(date.format(formatter));

        System.out.println();

        LocalDate date1 = LocalDate.of(2021, 12, 24);
        System.out.println(date1);

        System.out.println(date1.format(formatter));
    }
}
