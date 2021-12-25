package az.coders.java_lessons.lesson_18;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public abstract class Query {

    private static final Sql sql = new PostgreSql();

    public static Person getById(long id) throws SQLException {
        String query = String.format("select * from humans where id = %s", id);
        ResultSet rs = getStatement().executeQuery(query);

        List<Person> people = new ArrayList<>();

        while (rs.next()) {
            int idd = rs.getInt("id");
            String name = rs.getString("name");
            String surname = rs.getString("surname");
            int age = rs.getInt("age");
            Gender gender = (Gender) rs.getObject("gender");
            people.add(new Person(idd, name, surname, (byte) age, gender));
        }
        return people.get(0);
    }

    public static List<Person> getAll() {
        return null; // fill the method
    }

    public static void save(Person person) {
        // fill
    }

    public static void saveAll(List<Person> people) {
        // fill
    }

    public static void update(Person person) {
        // fill
    }

    public static void deleteById(long id) {
        // fill
    }

    private static Statement getStatement() {
        return sql.statement(sql.connection());
    }
}