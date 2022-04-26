/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.test;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;

/**
 *
 * @author Sascha Nickel
 */
@Named(value = "loginBean")
@RequestScoped
public class LoginBean {
    private String pwd;
    private String title;
    private boolean ok;
    private static int id=0;
    private FacesContext context;
    private List<User> userList;
    private String lgn;
       private boolean loginOk;
    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
    }
    
    @PostConstruct
    public void init() {
        context = FacesContext.getCurrentInstance();
        userList = new ArrayList<>();
        userList.add(new User(getId(),"admin", "secret"));
        userList.add(new User(getId(),"user1", "secret1"));
    }
    
    public void process(){
   
        FacesMessage fm = null;
        ok=false;

        
       
        if(pwd.length()>=5){
            for (User u: userList){
                if(u.getLoginName().equals(lgn)){

                    if(u.getPassword().equals(pwd)){
                        ok=true;
                    }
                    else{
                        /*Fehlermeldung Passwort falsch*/
                    }
                    break;
                }
                else{
                    /*Fehlermeldung Username falsch*/
                }
            }
            
            System.out.println("ok:"+ok);
            System.out.println("username:"+lgn);
            System.out.println("password:"+pwd);
            System.out.println("context"+context.toString());
            
            if (ok){
                fm = new FacesMessage("Ok.");
                
                context.addMessage("loginForm:username", fm);
                context.addMessage("loginForm:password", fm);
            } else {
                fm = new FacesMessage("No Match.");
                
                context.addMessage("loginForm:username", fm);
                context.addMessage("loginForm:password", fm);
            }
            
            
        }
        

        
                
        
    }
    


    /**
     * Get the value of loginOk
     *
     * @return the value of loginOk
     */
    public boolean isLoginOk() {
        return loginOk;
    }

    /**
     * Set the value of loginOk
     *
     * @param loginOk new value of loginOk
     */
    public void setLoginOk(boolean loginOk) {
        this.loginOk = loginOk;
    }


    /**
     * Get the value of lgn
     *
     * @return the value of lgn
     */
    public String getLgn() {
        return lgn;
    }

    /**
     * Set the value of lgn
     *
     * @param lgn new value of lgn
     */
    public void setLgn(String lgn) {
        this.lgn = lgn;
    }


    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public static int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public static void setId(int id) {
        LoginBean.id = id;
    }

        /**
     * Get the value of ok
     *
     * @return the value of ok
     */
    public boolean isOk() {
        return ok;
    }

    /**
     * Set the value of ok
     *
     * @param ok new value of ok
     */
    public void setOk(boolean ok) {
        this.ok = ok;
    }


    /**
     * Get the value of pwd
     *
     * @return the value of pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * Set the value of pwd
     *
     * @param pwd new value of pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * Get the value of title
     *
     * @return the value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the value of title
     *
     * @param title new value of title
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
