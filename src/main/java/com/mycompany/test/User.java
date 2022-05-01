/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import java.io.Serializable;

/**
 * Name:            User
 * Aufgabe:         Klasse für das Objekt User
 * Version:         1.0
 * Letzte Änderung: 01.05.2022
 * Realisierung     Sascha Nickel
 */
public class User implements Serializable{

    private int uid;
    private String loginName;
    private String password;
    private String lastname;
    private String surname;
    private String mail;
    private String phone;
    private boolean admin;

    public User() {
    }

    public User(String loginName, String password) {
        this.loginName = loginName;
        this.password = password;
    }
    
    public User(String loginName, String password, String lastname, String surname, String mail, String phone) {
        this.loginName = loginName;
        this.password = password;
        this.lastname = lastname;
        this.surname = surname;
        this.mail = mail;
        this.phone = phone;
        this.admin=false;
    }


    
        public User(int uid, String loginName, String password, boolean admin) {
        this.uid = uid;
        this.loginName = loginName;
        this.password = password;
        this.admin=admin;
    }
    /**
     * Get the value of phone
     *
     * @return the value of phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set the value of phone
     *
     * @param phone new value of phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }


    /**
     * Get the value of mail
     *
     * @return the value of mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * Set the value of mail
     *
     * @param mail new value of mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }


    /**
     * Get the value of surname
     *
     * @return the value of surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Set the value of surname
     *
     * @param surname new value of surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }


    /**
     * Get the value of lastname
     *
     * @return the value of lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Set the value of lastname
     *
     * @param lastname new value of lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    

    
    /**
     * @return the loginName
     */
    public String getLoginName() {
        return loginName;
    }
    /**
     * @param loginName the loginName to set
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
   /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the uid
     */
    public int getUid() {
        return uid;
    }

    /**
     * @param uid the uid to set
     */
    public void setUid(int uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "User{" + "uid=" + uid + ", loginName=" + loginName + ", password=" + password + ", lastname=" + lastname + ", surname=" + surname + ", mail=" + mail + ", phone=" + phone + '}';
    }
     /**
     * Get the value of admin
     *
     * @return the value of admin
     */
    public boolean isAdmin() {
        return admin;
    }

    /**
     * Set the value of admin
     *
     * @param admin new value of admin
     */
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
}

