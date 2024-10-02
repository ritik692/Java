package JDBC;

import java.sql.*;

public class JDBC_CONNECTIVITY {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost/book";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "system";

    public static void main(String[] args) {

        // Load JDBC driver and establish a connection
        try {
            Class.forName(JDBC_DRIVER);
            try (Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
                 Statement stmt = conn.createStatement()) {

                if (conn != null) {
                    System.out.println("Successfully connected to DB");
                }

                // Execute SQL query
//                String sqlQuery1 = "CREATE DATABASE book";
//                String sqlQuery2 = "CREATE TABLE BOOK (BookID int," +
//                        "Book_name varchar(30)," +
//                        "Genre varchar(30)," +
//                        "Author varchar(30))";
//                String sqlQuery3 = "INSERT INTO book values (123,'Atomic Habits','Self Help','James Clear')," +
//                        "(234,'Rich Dad Poor Dad','Finance', 'Robert Kiyosaki')," +
//                        "(461,'The catcher in the Rye','Fiction','JD Salinger')";

                String sqlQuery4 = "select * from book";
                String sqlQuery6 = "CREATE VIEW view1 AS SELECT book_name, author from book where genre = 'Self Help'";
//                stmt.execute(sqlQuery6);
                String sqlQuery7 = "SELECT * from view1";


//                String sqlQuery5 = "UPDATE book SET Genre = 'Self Help' where BookID = 234";
//                stmt.executeUpdate(sqlQuery5);
                ResultSet rs = stmt.executeQuery(sqlQuery7); // executeUpdate for DDL operations



                while(rs.next())
                {
//                    int id = rs.getInt("BookID");
                    String name = rs.getString("book_name");
//                    String genre = rs.getString("genre");
                    String author = rs.getString("author");

                    System.out.println("Book name: "+ name + "  author: "+ author);
//                    System.out.println("Book ID : " + id + " Book Name: " + name + " Genre: "+ genre + " Author: "+ author);
                }
                System.out.println("Database created successfully!");

            } catch (SQLException e) {
                System.err.println("SQL Error: " + e.getMessage());
            }
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        }
    }
}
