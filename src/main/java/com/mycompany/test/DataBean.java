/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.test;



import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import com.mycompany.test.User;
import javax.enterprise.context.SessionScoped;



/**
 *
 * @author Sascha Nickel
 */
@Named(value = "dataBean")
@SessionScoped
public class DataBean implements Serializable{

    
    private static int id = 0;
    private List<User> userObjectList;    
    private int size;
    private FacesContext context;
    private HttpSession session;

    
        /**
     * Creates a new instance of DataBean
     */
    public DataBean() {
        context = FacesContext.getCurrentInstance();
        session = (HttpSession) context.getExternalContext().getSession(false);
        userObjectList = new ArrayList<>();
        fillUserObjectList();
    }
    private void fillUserObjectList() {
        
        
        
        //try {
            
            User u = new User(getId(),"user1", "secret", false);
            this.getUserObjectList().add(u);

            
            u = new User(getId(), "admin", "secret", true);
            this.getUserObjectList().add(u);

            this.size = this.getUserObjectList().size();

        //} catch (ParseException ex) {
            //LOGGER.log(Level.SEVERE, null, ex);
        //}
    }
    
    /**
     * Get the value of size
     *
     * @return the value of size
     */
    public int getSize() {
        return size;
    }

    /**
     * Set the value of size
     *
     * @param size new value of size
     */
    public void setSize(int size) {
        this.size = size;
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
        DataBean.id = id;
    }
    
        /**
     * @return the userObjectList
     */
    public List<User> getUserObjectList() {
        return userObjectList;
    }

    /**
     * @param userObjectList the userObjectList to set
     */
    public void setUserObjectList(List<User> userObjectList) {
        this.userObjectList = userObjectList;
    }

    /**
     * @return the session
     */
    public HttpSession getSession() {
        return session;
    }

    /**
     * @param session the session to set
     */
    public void setSession(HttpSession session) {
        this.session = session;
    }

    /**
     * @return the context
     */
    public FacesContext getContext() {
        return context;
    }

    /**
     * @param context the context to set
     */
    public void setContext(FacesContext context) {
        this.context = context;
    }


    
}
