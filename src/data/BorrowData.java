/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import data.JDBC_Connection;

/**
 *
 * @author qinee
 */
public class BorrowData {
        public static PreparedStatement pst;
    public static ResultSet rs;
    
    public static ResultSet showTextfield(String sql) {
        try {
            pst = JDBC_Connection.getConnect().prepareStatement(sql);
            return pst.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }
     public static void InsertBorrow(Borrow borrow) {
        String sql = "INSERT INTO BorrowList VALUES(?,?,?,?,?,?,?)";
        try {
            pst = JDBC_Connection.getConnect().prepareStatement(sql);
            pst.setString(1, borrow.getBorrowCode());
            pst.setString(2, borrow.getID());
            pst.setString(3, borrow.getBookCode());
            pst.setString(4, borrow.getBorrowDate());
            pst.setString(5, borrow.getReturnDate());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Add Successful!" , "Message", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Fail.Please try again!" , "Message", 1);
        }
    }
    
    public static boolean UpdateBorrow(Borrow borrow) {
        try {
            pst = JDBC_Connection.getConnect().prepareStatement("UPDATE BorrowList SET ID = ?, BookCode = ?,"
                    + "BorrowDate = ?, ReturnDate= ? where BorrowList = ?");
            pst.setString(5, borrow.getBorrowCode());
            pst.setString(1, borrow.getID());
            pst.setString(2, borrow.getBookCode());
            pst.setString(3, borrow.getBorrowDate());
            pst.setString(4, borrow.getReturnDate());
            return pst.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static boolean DeleteBorrow(String borrowCode) {
        try {
            pst = JDBC_Connection.getConnect().prepareStatement("DELETE FROM BorrowList WHERE BorrowCode = ?");
            pst.setString(1, borrowCode);
            return pst.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
}
}
