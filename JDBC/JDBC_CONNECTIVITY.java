package JDBC;

import javax.swing.plaf.nimbus.State;
import javax.xml.transform.Result;
import java.sql.*;

class Jdbc_fields{
    private Connection conn;
    private Statement stmt;
    private ResultSet rs;

    Jdbc_fields(Connection conn, Statement stmt, ResultSet rs)
    {
        this.conn = conn;
        this.stmt = stmt;
        this.rs = rs;
    }
    Connection getConnection()
    {
        return this.conn;
    }
    Statement getStatement()
    {
        return this.stmt;
    }
    ResultSet getResultSet ()
    {
        return this.rs;
    }
    void closeAll() throws SQLException {
        if(this.rs != null) this.rs.close();
        this.stmt.close();
        this.conn.close();
        System.out.println("All connections have been closed successfully!!");
    }


}

public class JDBC_CONNECTIVITY {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost/";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "system";

    //    private String jdbcDriver;
    private String dbUrl;
//    private String username;
//    private String password;


//    private String dbName;
//
//    JDBC_CONNECTIVITY(String jdbcDriver,String dbUrl, String username, String password)
//    {
//        this.jdbcDriver = jdbcDriver;
//        this.dbUrl = dbUrl;
//        this.username = username;
//        this.password = password;
//    }

    private Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection(this.dbUrl, USERNAME, PASSWORD);
            return conn;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void processCreateOrDeleteQuery(String sqlQuery) {
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            boolean flag = stmt.execute(sqlQuery);

            stmt.close();
            conn.close();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
//

    JDBC_CONNECTIVITY(String dbName) throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        this.dbUrl = DB_URL + dbName;

        Connection conn = null;
        try {
            conn = getConnection();

            if (conn != null) {
                System.out.println("Successfully connected to DB: " + dbName);
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

//        this.username = username;
//        this.password = password;
    }


    public void create(String sqlQuery) {
        processCreateOrDeleteQuery(sqlQuery);

    }

    public Jdbc_fields read(String sqlQuery) {
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sqlQuery);

            return new Jdbc_fields(conn, stmt, rs);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(String sqlQuery) {
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            int rows_affected = stmt.executeUpdate(sqlQuery);
            System.out.println("Rows affected upon updation : " + rows_affected);
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(String sqlQuery) {
        processCreateOrDeleteQuery(sqlQuery);
    }

}