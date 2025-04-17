package com.training.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTable {

    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/trainingdb";
        String username = "root";
        String password = "Saranya31";
        
        String sql = "CREATE TABLE students(" +
                     "student_name VARCHAR(20), " +
                     "student_id INT PRIMARY KEY, " +
                     "department VARCHAR(20))";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // Establishing the connection
            connection = DriverManager.getConnection(url, username, password);
            
            // Creating the statement
            statement = connection.prepareStatement(sql);

            // Executing the statement
            boolean result = statement.execute();
            System.out.println("Table created: " + !result);

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            // Closing resources safely
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Optional: log this
            }
        }
    }
}
