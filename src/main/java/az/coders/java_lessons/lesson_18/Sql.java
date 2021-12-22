package az.coders.java_lessons.lesson_18;

import java.sql.Connection;
import java.sql.Statement;

public interface Sql {

    Connection connection(String path, String user, String pass);

    Statement statement(Connection con);
}