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
public class Book {
    String bookCode;
    String bookName;
    String author;
    String publish;
    String edition;
    float cost;
    int quantity;
    
    public Book() {
        
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Book(String bookCode, String bookName, String author, String publish, String edition, float cost, int quantity) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.author = author;
        this.publish = publish;
        this.edition = edition;
        this.cost = cost;
        this.quantity = quantity;
    }
    
    
}
