package com.example.bhuang.mvp.models;

/**
 * Created by bhuang on 7/18/2017.
 */

public class User {
    private String firstname;
    private String surname;
    private String status;
    private boolean isOnline;
    private String photo;
    private boolean isFriend;

    public User(String firstname, String surname, String status, boolean isOnline, String photo, boolean isFriend) {
        this.firstname = firstname;
        this.surname = surname;
        this.status = status;
        this.isOnline = isOnline;
        this.photo = photo;
        this.isFriend = isFriend;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public boolean isFriend() {
        return isFriend;
    }

    public void setFriend(boolean friend) {
        isFriend = friend;
    }




    public User(String firstname, String surname, String status, boolean isOnline) {
        this.firstname = firstname;
        this.surname = surname;
        this.status = status;
        this.isOnline = isOnline;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }


}
