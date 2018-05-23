/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;



/**
 *
 * @author qinee
 */
public class Borrow {
    public String BorrowCode;
    public String ID;
    public String BookCode;
    public String BorrowDate;
    public String ReturnDate;

    public Borrow(String text, String text0, String text1, String text2, String text3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getBorrowCode() {
        return BorrowCode;
    }

    public void setBorrowCode(String BorrowCode) {
        this.BorrowCode = BorrowCode;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getBookCode() {
        return BookCode;
    }

    public void setBookCode(String BookCode) {
        this.BookCode = BookCode;
    }

    public String getBorrowDate() {
        return BorrowDate;
    }

    public void setBorrowDate(String BorrowDate) {
        this.BorrowDate = BorrowDate;
    }

    public String getReturnDate() {
        return ReturnDate;
    }

    public void setReturnDate(String ReturnDate) {
        this.ReturnDate = ReturnDate;
    }

    public Borrow(String BorrowCode, String ID, String BookCode, String ReturnDate) {
        this.BorrowCode = BorrowCode;
        this.ID = ID;
        this.BookCode = BookCode;
        this.ReturnDate = ReturnDate;
    }
    
    
}
