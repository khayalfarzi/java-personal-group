package az.coders.java_lessons.lesson_18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSql implements Sql {

    private static final String path = "//path";
    private static final String user = "user name";
    private static final String pass = "password";

    @Override
    public Connection connection(String path, String user, String pass) {
        System.out.println("Postgresql connection started...");
        Connection con = null;

        try {
            con = DriverManager.getConnection(path, user, pass);
            System.out.println("Postgresql connected successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Postgresql connection ended.");
        return con;
    }

    @Override
    public Statement statement(Connection con) {
        // fill statement
        return null;
    }
}
