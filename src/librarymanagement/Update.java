/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import data.JDBC_Connection;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author qinee
 */
public class Update {

    public static PreparedStatement pst = null;
    public static ResultSet rs = null;
    public static Connection con = JDBC_Connection.getConnect();
    
    public static void LoadData (String sql,JTable tb) {
        try{
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            tb.setModel((DbUtils.resultSetToTableModel(rs)));
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e ,"Error",1);
        }
    }
    
    public static ResultSet ShowTextField(String sql) {
        try{
            pst = con.prepareStatement(sql);
            return pst.executeQuery(); 
        }
        catch(Exception e) {
            return null;
            //JOptionPane.showMessageDialog(null, e, "Thông báo lỗi", 1);
        }
    }
}
