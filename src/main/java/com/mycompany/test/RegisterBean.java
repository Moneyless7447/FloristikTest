/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.test;


import java.io.Serializable;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author Sascha Nickel
 */
@Named(value = "registerBean")
@SessionScoped
public class RegisterBean implements Serializable {

    
    private String userName;
    private String password;
    private String mail;
    private List<User> userList;
    private FacesContext context;
    private String surname;
    private String lastname;
    private String phone;
    
    
    private User newUser;
    
    @Inject
    private DataBean dBean;
    
        
    @PostConstruct
    public void init() {
        context = FacesContext.getCurrentInstance();
        userList = dBean.getUserObjectList();
    }
    /**
     * Creates a new instance of RegisterBean
     */
    public RegisterBean() {
    }
    
     public void register() {
        FacesMessage fm;
        FacesContext cxt = FacesContext.getCurrentInstance();
        newUser = new User();
        newUser.setLastname(lastname);
        newUser.setSurname(surname);
        newUser.setMail(mail);
        newUser.setPhone(phone);
        newUser.setLoginName(userName);
        newUser.setPassword(password);
         
        if (this.userList.isEmpty()) {
            this.userList.add(newUser);
            System.out.println("Userliste ist leer");
        } //TODO: persistentes Speichern in Datei, DB oder Cloud
        else {
            boolean neu = true;
            System.out.println("Userlist: "+userList);
            for (User u : this.userList) {
                System.out.println(u.getLoginName()+" " + userName);
                if (u.getLoginName().equals(userName)) {
                    neu = false;
                    System.out.println("Benutzer existiert bereits!");
                    fm = new FacesMessage("Benutzer existiert bereits!");
                    cxt.addMessage("cBtn", fm);
                    break;
                }
            }
            if (neu) {
                /* 
                   muss außerhalb der foreach-Schleife erfolgen, da sonst
                   Concurrency-Fehler, da sich zwei Iteratoren überlagern
                   (s. ConcurrentModificationException)
                 */
                
                this.userList.add(newUser);
                fm = new FacesMessage("Benutzer ist registriert!");
                fm.setSeverity(FacesMessage.SEVERITY_INFO);
                cxt.addMessage("cBtn", fm);
                System.out.println("Benutzer ist registriert!");
                dBean.setUserObjectList(userList); //damit verfügbar für Login
                

            }
        }
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
     * Get the value of userName
     *
     * @return the value of userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Set the value of userName
     *
     * @param userName new value of userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }


    /**
     * @return the userList
     */
    public List<User> getUserList() {
        return userList;
    }

    /**
     * @param userList
     */
    public void setUserList(List<User> userList) {
        this.userList = userList;
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

}
