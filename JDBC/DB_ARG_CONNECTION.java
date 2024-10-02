package JDBC;

import java.sql.*;

public class DB_ARG_CONNECTION {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost/book";

    public static void main(String[] args) {

        // Load JDBC driver and establish a connection
        try {
            Class.forName(JDBC_DRIVER);
            try (Connection conn = DriverManager.getConnection(DB_URL, args[0], args[1]);
                 Statement stmt = conn.createStatement()) {

                if (conn != null) {
                    System.out.println("Successfully connected to DB");
                }
                String sqlQuery = "select * from book";
                ResultSet rs = stmt.executeQuery(sqlQuery);
                while(rs.next())
                {
                  int id = rs.getInt("BookID");
                  String name = rs.getString("BookName");
                  String genre = rs.getString("genre");
                  String author = rs.getString("author");

                  System.out.println("Book ID : " + id + " Book Name: " + name + " Genre: "+ genre + " Author: "+ author);
                }


            } catch (SQLException e) {
                System.err.println("SQL Error: " + e.getMessage());
            }
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        }
    }
}
