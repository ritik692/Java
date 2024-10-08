package JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SQL_DB_Connection {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JDBC_CONNECTIVITY jdbc = new JDBC_CONNECTIVITY("book");
//        jdbc.update("ALTER TABLE book " +
//                "MODIFY COLUMN Book_name VARCHAR(50) ");
//
//        jdbc.update("ALTER TABLE book " +
//                "RENAME COLUMN Book_name TO BookName; ");

//        jdbc.create("INSERT INTO book (BookID, BookName, Genre, Author) " +
//                "VALUES (464, 'The 7 Habits of Highly Effective People', 'Self-Help', 'Stephen R. Covey')");

//        jdbc.delete("DELETE b1 " +
//                "FROM book b1 " +
//                "INNER JOIN book b2 " +
//                "ON b1.bookid = b2.bookid");   -> All rows deleted :(

//        jdbc.create("INSERT INTO book (BookID, BookName, Genre, Author) " +
//                "VALUES (464, 'The 7 Habits of Highly Effective People', 'Self-Help', 'Stephen R. Covey'), " +
//                       "(123, 'Atomic Habits' ,'Self-Help','James Clear'), " +
//                        "(134, 'Rich Dad Poor Dad' ,'Self-Help' ,'Robert Kiyosaki')");


//        jdbc.update(
//                "UPDATE book " +
//                        "set Genre = 'Finance' " +
//                        "where Author = 'Robert Kiyosaki'");


        Jdbc_fields field = jdbc.read("select * from book");
        ResultSet rs = field.getResultSet();
        while(rs.next())
        {
            int BookId = rs.getInt("BookId");
            String Book_name = rs.getString("BookName");
            String Genre = rs.getString("Genre");
            String Author = rs.getString("Author");

            System.out.println("BookId : " + BookId + " Book_name: " + Book_name + " Genre: " + Genre + " Author: "+ Author);
        }
        field.closeAll();


    }
}
