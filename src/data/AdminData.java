
package data;

import static data.UserData.pst;
import data.Admin;
import data.User;
import data.JDBC_Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Gaara
 */
public class AdminData {
    public static PreparedStatement pst;
    public static ResultSet rs;
    
    public static Admin LogIn(String ID, String pass) {
        Admin admin = null;
        try{
            pst = JDBC_Connection.getConnect().prepareStatement("SELECT * FROM Admin where id = ? and password=?");
            pst.setString(1, ID);
            pst.setString(2, pass);
            rs = pst.executeQuery();
            while(rs.next()) {
                admin = new Admin();
               // kh.setMaKH(rs.getString("Ma_Khach_hang"));
               // kh.setPass(rs.getString("Password"));
                
            }
        }
        catch(Exception e) {
            return admin = null;
        }
        return admin;
    }
    
    public static ResultSet showTextfield(String sql) {
        try {
            pst = JDBC_Connection.getConnect().prepareStatement(sql);
            return pst.executeQuery();
        } catch (Exception e) {
            return null;
        }
        
    }
    
    public static boolean UpdateAdmin(Admin admin) {
        try {
            pst = JDBC_Connection.getConnect().prepareStatement("UPDATE Admin SET password = ? where id = ?");
            pst.setString(2, admin.getID());
            pst.setString(1, admin.getPassword());
            return pst.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static boolean DeleteAdmin(String ID) {
        try {
            pst = JDBC_Connection.getConnect().prepareStatement("DELETE FROM Admin WHERE id = ?");
            pst.setString(1, ID);
            return pst.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }
}
