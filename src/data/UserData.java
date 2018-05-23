/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import data.User;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author qinee
 */
public class UserData {

    public static PreparedStatement pst;
    public static ResultSet rs;

    public static User LogIn(String ID, String pass) {
        User user = null;
        try {
            pst = JDBC_Connection.getConnect().prepareStatement("SELECT * FROM UserAccount where ID = ? and Password=?");
            pst.setString(1, ID);
            pst.setString(2, pass);
            rs = pst.executeQuery();
            while (rs.next()) {
                user = new User();
                user.setID(rs.getString("ID"));
                user.setPassword(rs.getString("Password"));
                user.setName(rs.getString("FullName"));
                user.setBirth(rs.getString("Birthday"));
                user.setIdentityNum(rs.getString("IdentityNumber"));
                user.setPhoneNum(rs.getString("PhoneNumber"));
                user.setAddress(rs.getString("Address"));
            }
        } catch (Exception e) {
            return user = null;
        }
        return user;
    }

    public static ResultSet showTextfield(String sql) {
        try {
            pst = JDBC_Connection.getConnect().prepareStatement(sql);
            return pst.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }

    public static User InsertUser(User user) {
        String sql = "INSERT TO UserAccount VALUES(?,?,?,?,?,?,?)";
        user = null;
        try {
            pst = JDBC_Connection.getConnect().prepareStatement(sql);
            pst.setString(1, user.getID());
            pst.setString(2, user.getPassword());
            pst.setString(3, user.getName());
            pst.setString(4, user.getBirth());
            pst.setString(5, user.getIdentityNum());
            pst.setString(6, user.getPhoneNum());
            pst.setString(7, user.getAddress());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registred!", "Message", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error. Please try again!", "Message", 1);
        }
        return null;
    }

    public static boolean UpdateUser(User user) {
        try {
            pst = JDBC_Connection.getConnect().prepareStatement("UPDATE UserAccount SET Password = ?, FullName = ?,"
                    + "Birthday = ?, IdentityNumber = ?, PhoneNumber = ?, Address = ? where ID = ?");
            user = null;
            pst.setString(7, user.getID());
            pst.setString(1, user.getPassword());
            pst.setString(2, user.getName());
            pst.setString(3, user.getBirth());
            pst.setString(4, user.getIdentityNum());
            pst.setString(5, user.getPhoneNum());
            pst.setString(6, user.getAddress());
            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean DeleteUser(String ID) {
        try {
            pst = JDBC_Connection.getConnect().prepareStatement("DELETE FROM UserAccount WHERE ID = ?");
            pst.setString(1, ID);
            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }

}
