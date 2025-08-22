package dev.akshith;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Akshith Ragukumar hotel Database connection CSIS 505
 *
 * @author Akshith
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:derby://localhost:1527/HotelManagement";
    private static final String USER = "akshith";
    private static final String PASSWORD = "akshith";

    public static Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection established successfully.");
        } catch (SQLException e) {
            System.err.println("Database connection failed: " + e.getMessage());
        }
        return connection;
    }

    public static boolean authenticateUser(String email, String password) {
        String query = "SELECT * FROM Users WHERE email = ? AND password = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD); PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, email);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();
            return rs.next(); // If a result is found, authentication is successful
        } catch (SQLException e) {
            System.err.println("Error authenticating user: " + e.getMessage());
            return false;
        }
    }
}
