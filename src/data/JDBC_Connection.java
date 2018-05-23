/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import librarymanagement.LibraryManagementProgramme;

/**
 *
 * @author qinee
 */
public class JDBC_Connection {

    public static java.sql.Connection con=null;
    public static String state;
    
    
    public static java.sql.Connection getConnect() {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = java.sql.DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=LibraryManagementDatabase", "sa", "12345678");
            if(con!= null) {
                System.out.println("Connection Successful");
                state = "Connection Successful";
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Error Trace in getConnection() : " + e.getMessage());
            state = "Connection Fail";
        }
        return con;
    }
    
    public static String testConnection() {
        JDBC_Connection.getConnect();
        return state;
    }
}
