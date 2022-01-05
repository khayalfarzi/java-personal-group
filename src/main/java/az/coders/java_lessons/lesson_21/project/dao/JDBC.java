package az.coders.java_lessons.lesson_21.project.dao;

import project.entity.Flight;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public interface JDBC {
    Connection connection();

    Statement statement(Connection con) throws SQLException;

    List<Flight> getFlights();

    Flight getFlightInfoById(long id);

    long findMaxId();
}
