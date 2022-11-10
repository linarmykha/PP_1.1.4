package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static Connection connection = null;
    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/1.1.4", "root", "root");

        } catch (SQLException e) {
            System.out.println("Failed to connect to database");
        }
        return connection;
    }
}
