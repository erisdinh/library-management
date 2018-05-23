/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import data.JDBC_Connection;
import data.Book;

/**
 *
 * @author qinee
 */
public class BookData {
        
     public static PreparedStatement pst;
    public static ResultSet rs;
    
    public static ResultSet showTextfield(String sql) {
        try {
            pst= JDBC_Connection.getConnect().prepareStatement(sql);
            return pst.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }
    
     public static void InsertBook(Book book) {
        String sql = "INSERT INTO BookList VALUES(?,?,?,?,?,?,?)";
        try {
            pst = JDBC_Connection.getConnect().prepareStatement(sql);
            pst.setString(1, book.getBookCode());
            pst.setString(2, book.getBookName());
            pst.setString(3, book.getAuthor());
            pst.setString(4, book.getPublish());
            pst.setString(5, book.getEdition());
            pst.setFloat(6, book.getCost());
            pst.setInt(7,book.getQuantity());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Add Successful!" , "Message", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Add Fial. Please try again!" , "Message", 1);
        }
    }
    
    public static boolean UpdateBook(Book book) {
        try {
            pst = JDBC_Connection.getConnect().prepareStatement("UPDATE BookList SET  Name = ?, Author= ?,"
                    + "Publish = ?, Edition = ?, Cost = ?, Quantity = ? where Code = ?");
            pst.setString(7, book.getBookCode());
            pst.setString(1, book.getBookName());
            pst.setString(2, book.getAuthor());
            pst.setString(3, book.getPublish());
            pst.setString(4, book.getEdition());
            pst.setFloat(5, book.getCost());
            pst.setInt(6, book.getQuantity());
            return pst.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static boolean DeleteBook(String Code) {
        try {
            pst = JDBC_Connection.getConnect().prepareStatement("DELETE FROM BookList WHERE Code = ?");
            pst.setString(1, Code);
            return pst.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }
}
