package dev.akshith;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Akshith Ragukumar hotel management Database test connection CSIS 505
 *
 * @author Akshith
 */
import java.sql.Connection;

public class TestConnection {

    public static void main(String[] args) {
        Connection connection = DatabaseConnection.connect();
        if (connection != null) {
            System.out.println("Database is connected!");
        } else {
            System.out.println("Failed to connect to the database.");
        }
    }
}
