/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Date;

/**
 *
 * @author qinee
 */
public class User {

    static private String ID;
    static private String password;
    static private String name;
    static private String birth;
    static private String address;
    static private String IdentityNum;
    static private String phoneNum;

    public User() {
        
    }

    public static String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public static String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public static String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static String getIdentityNum() {
        return IdentityNum;
    }

    public void setIdentityNum(String IdentityNum) {
        this.IdentityNum = IdentityNum;
    }

    public static String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public User(String ID, String password, String name, String birth, String address, String IdentityNum, String phoneNum) {
        this.ID = ID;
        this.password = password;
        this.name = name;
        this.birth = birth;
        this.address = address;
        this.IdentityNum = IdentityNum;
        this.phoneNum = phoneNum;
    }
}
