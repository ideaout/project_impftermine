package projekt_impftermine.backend.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseInitializer {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mariadb://localhost:3306/fernicholas_db";
            String user = "root"; // Replace with your user
            String password = "password"; // Replace with your password

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection successful!");

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
