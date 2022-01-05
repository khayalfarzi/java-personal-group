package az.coders.java_lessons.lesson_21.project.controllers;

import az.coders.java_lessons.lesson_21.project.entity.Flight;
import az.coders.java_lessons.lesson_21.project.entity.Person;
import az.coders.java_lessons.lesson_21.project.services.Service;
import az.coders.java_lessons.lesson_21.project.services.ServiceImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class Controller {

    private static final Service service = new ServiceImpl();

    public boolean cmd(String cmd) {
        return service.checkCmd(cmd);
    }

    public void show() {
        System.out.println("Online Table Airport: Kiev Boryspil");
        service.showFlights()
                .forEach(System.out::println);
    }

    public void info() {
        System.out.println("Flight info.");

        Flight flight = service.getFlightInfoById();

        System.out.println(flight);
    }

    public void book() {
        boolean b = false;
        int peopleNumber = 0;
        List<Flight> flights = searching();
        Flight bookFlight = null;

        String flightNumber = service.checkFlightNumber();


        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                b = true;
                bookFlight = flight;
            }
        }

        if (b) {
            peopleNumber = service.checkPeopleNumber();
        }

        for (int i = 0; i < peopleNumber; i++) {
            String name = service.checkName();

            String surname = service.checkSurname();

            int age = service.checkAge();

            pgjdbc.booking(bookFlight, new Person(name, surname, age));
        }
    }

    public void cancel() {
        System.out.println("Cancel flight");

        long id = service.checkBookingId();
        long previousCount = bookingCount();

        pgjdbc.cancel(id);

        long presentCount = bookingCount();

        if (presentCount < previousCount) {
            System.out.println("Cancellation was successful");
        } else {
            System.out.println("Cancellation failed");
        }

    }

    public void flights() {
        System.out.println("My flights.");

        for (int i = 0; i < pgjdbc.myFlights().size(); i++) {
            System.out.println(pgjdbc.myFlights().get(0));
        }

    }

    private long bookingCount() {
        long count = 0;
        try {
            ResultSet rs = pgjdbc.statement(pgjdbc.connection()).executeQuery("select count (*) from booking");

            while (rs.next()) {
                count = rs.getLong("count");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return count;
    }

    private List<Flight> searching() {
        System.out.println("Enter flight info.");

        Date date = service.checkDate();

        String destination = service.checkDestination();

        return pgjdbc.searching(new Flight(date, destination));
    }
}
