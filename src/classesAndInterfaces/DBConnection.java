package classesAndInterfaces;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp 820
 */
import java.sql.*;

public class DBConnection {

    public Connection connection;

    public DBConnection() {

    }

    public void init() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/scdProject?serverTimezone=UTC", "root", "");
            System.out.println("Connection Done with Database....");
        } catch (Exception e) {
            System.err.println("Exeception = " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public String insertData(String query) {
        try {
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(query);
            return "Query executed successfully, Rows Affected " + rowsAffected;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return e.getMessage();
        }
    }

    public String updateData(String query) {
        try {
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(query);
            return "Query executed successfully, Rows Affected " + rowsAffected;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return e.getMessage();
        }
    }

    public String deleteData(String query) {
        try {
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(query);
            return "Query executed successfully, Rows Affected " + rowsAffected;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return e.getMessage();
        }
    }

    public ResultSet getData(String query) {
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            return result;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
