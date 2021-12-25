package az.coders.java_lessons.lesson_18;

import java.sql.Connection;
import java.sql.Statement;

public interface Sql {

    Connection connection();

    Statement statement(Connection con);
}