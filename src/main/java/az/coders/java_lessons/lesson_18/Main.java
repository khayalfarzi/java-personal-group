package az.coders.java_lessons.lesson_18;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Database process started.");
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/personal_group",
                    "postgres", "root");
            System.out.println("Connected successfully.");
        } catch (SQLException e) {
            System.out.printf("Can't connect to database. \n The problem is: %s", e.getMessage());
        }

        Statement stmt = null;
        try {
            assert con != null;
            stmt = con.createStatement();
            System.out.println("Statement successfully added.");
            boolean isInserted = stmt.execute("insert into jgroup_personal.\"user\" (name, id, surname, age) values ('Ismayil', 29, 'Nabiyev', 99)");

            if (!isInserted)
                System.out.println("Successfully inserted data");
            else System.out.println("Problem occurred");

            ResultSet rs = stmt.executeQuery("select * from jgroup_personal.\"user\"");
            while (rs.next()) {
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                int age = rs.getInt("age");
                int id = rs.getInt("id");

                System.out.printf("id = %s \nName = %s \nSurname = %s \nAge = %s\n", id, name, surname, age);
            }

        } catch (SQLException e) {
            System.out.printf("Statement process error: %s.\n", e.getMessage());
        }

        System.out.println("Database process ended.");
    }
}
