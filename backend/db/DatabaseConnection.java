package projekt_impftermine.backend.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mariadb://localhost:3306/fernicholas_db";
    private static final String USER = "fernicholas@hopper.hs-bremerhaven.de";
    private static final String PASSWORD = "Anjing_123@";

    // Method to establish a connection
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
