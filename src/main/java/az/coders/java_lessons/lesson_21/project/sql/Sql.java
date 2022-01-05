package az.coders.java_lessons.lesson_21.project.sql;

import az.coders.java_lessons.lesson_21.project.entity.Flight;
import az.coders.java_lessons.lesson_21.project.entity.Person;

public interface Sql {

    String getAllFlights();

    String getFlightById(long id);

    String getFlightByDestinitionAndDate(Flight flight);

    String booking(Flight flight, Person person);

    String cancel(long id);

    String myFlights();

    String findMaxId();
}
