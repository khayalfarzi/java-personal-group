package az.coders.java_lessons.lesson_21.project.dao;

import az.coders.java_lessons.lesson_21.project.entity.Booking;
import az.coders.java_lessons.lesson_21.project.entity.Flight;
import az.coders.java_lessons.lesson_21.project.entity.Person;
import az.coders.java_lessons.lesson_21.project.exceptions.DataNotFoundException;
import az.coders.java_lessons.lesson_21.project.sql.PgSql;
import az.coders.java_lessons.lesson_21.project.sql.Sql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class PgJDBC implements JDBC {

    private static final Sql sql = new PgSql();
    private static final String path = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String pass = "root";
    private Statement statement;

    public PgJDBC() {
        try {
            statement = statement(connection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Connection connection() {
        System.out.println("Connection started...");

        Connection con = null;
        try {
            con = DriverManager.getConnection(path, user, pass);
            System.out.println("Connected successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Connection ended.");
        return con;

    }

    @Override
    public Statement statement(Connection con) throws SQLException {
        Statement stmt = con.createStatement();
        System.out.println("Statement created successfully.");
        return stmt;
    }

    @Override
    public List<Flight> getFlights() {
        return handleResult(sql.getAllFlights());
    }

    public Flight getFlightInfoById(long id) {
        return handleResult(sql.getFlightById(id)).get(0);
    }

    @Override
    public long findMaxId() {
        int lastId = 0;

        try {
            ResultSet rs = statement.executeQuery(sql.findMaxId());

            while (rs.next()) {
                lastId = rs.getInt("id");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lastId;
    }

    public List<Flight> searching(Flight flight) {
        return handleResult(sql.getFlightByDestinitionAndDate(flight));
    }

    public void booking(Flight flight, Person person) {

        try {
            statement.execute(String.valueOf(sql.booking(flight, person)));

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void cancel(long id) {

        try {
            statement.execute(sql.cancel(id));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Booking> myFlights() {
        List<Booking> bookings = null;

        try {
            ResultSet rs = statement.executeQuery(sql.myFlights());

            while (rs.next()) {
                long idd = rs.getLong("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                int age = rs.getInt("age");
                String destination = rs.getString("destination");
                Date date = rs.getDate("date");

                assert false;
                bookings.add(new Booking(idd, new Person(name, surname, age), new Flight(date, destination)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return bookings;
    }

    private List<Flight> handleResult(String sql) {
        try {
            ResultSet rs = statement.executeQuery(sql);

            System.out.println(rs);
            return getResult(rs);

        } catch (SQLException e) {
            throw new DataNotFoundException();
        }
    }

    private List<Flight> getResult(ResultSet rs) {
        List<Flight> flights = new ArrayList<>();

        while (true) {
            try {
                if (rs.next()) {
                    long id = rs.getLong("id");
                    String flightNumber = rs.getString("flightnumber");
                    Date date = rs.getDate("date");
                    Time time = rs.getTime("time");
                    String destination = rs.getString("destination");
                    Time duration = rs.getTime("duration");

                    assert false;
                    flights.add(new Flight(id, flightNumber, date, time, destination, duration));
                } else break;

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return flights;
    }
}
