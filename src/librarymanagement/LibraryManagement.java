/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import java.sql.Connection;
import librarymanagement.LibraryManagementProgramme;
import data.JDBC_Connection;
//import static librarymanagement.JDBC_Connection.con;

/**
 *
 * @author qinee
 */
public class LibraryManagement {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        // TODO code application logic here
        JDBC_Connection Connection = new JDBC_Connection();
        LibraryManagementProgramme frmLibraryManagementProgramme;
        frmLibraryManagementProgramme = new LibraryManagementProgramme();
        frmLibraryManagementProgramme.setVisible(true);
    }
}
