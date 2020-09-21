package com.Spring.Web.Login.App.LoginDemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
    @Id
    private String userID;

    private String userName;
    private String role;
    private String password;

    public Login() {
    }

    public Login(String userName, String role, String password) {
        this.userName = userName;
        this.role = role;
        this.password = password;
    }

    public Login(String userID, String userName, String role, String password) {
        this.userID = userID;
        this.userName = userName;
        this.role = role;
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" +
                "userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                ", role='" + role + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
