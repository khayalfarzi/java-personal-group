package az.coders.java_lessons.lesson_21.project.services;

import az.coders.java_lessons.lesson_21.project.entity.Flight;

import java.util.Date;
import java.util.List;

public interface Service {

    List<Flight> showFlights();

    Flight getFlightInfoById();

    boolean checkCmd(String cmd);

    long checkFlightId();

    Date checkDate();

    String checkDestination();

    String checkFlightNumber();

    int checkPeopleNumber();

    String checkName();

    String checkSurname();

    int checkAge();

    long checkBookingId();
}
