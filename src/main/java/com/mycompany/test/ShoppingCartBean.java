/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;

import javax.inject.Inject;

/**
 *
 * @author Sascha Nickel
 */
@Named(value = "shoppingCartBean")
@SessionScoped
public class ShoppingCartBean implements Serializable{

    private ArrayList<Flower> contents;
    private String name;
    private int amount;
    private Date deliveryDate;
    
    private float overAllPrice;

   


    @Inject
    private ProductBean flowers;
    
    @Inject
    private LoginBean u;
    
    
    
        /**
     * Creates a new instance of ShoppingCartBean
     */
    public ShoppingCartBean() {
        contents = new ArrayList <>();
    }
    
    public String order(){
        FacesMessage fm = null;
        
        
        if(u.isLoginOk()){
            return "index";
        }
        else{
            return "login";
        }
            
    }
    
    public void add(String name, int amount){
       
        inShoppingCart=false;
        Flower f = flowers.getFlowerByID(name);
        
        System.out.println("Anzahl:" + amount);
        
        if (f != null){
            for(Flower g : contents){
                System.out.println("Vergleiche "+g.getName()+" mit "+ f.getName());
                if(g.getName().equals(f.getName())){
                    System.out.println("Produkt doppelt ");
                    g.setAmount(g.getAmount()+amount);
                    inShoppingCart=true;
                    break;
                }
            }   
        }
        else{
            System.out.println("Produkt nicht gefunden");
        }
        
        
        if (inShoppingCart==false){
            this.contents.add(new Flower(f.getName(), f.getPrice(),amount));
            System.out.println("Produkt in Warenkorb hinzugefügt");
        }
        

                
    }
    


       /**
     * wird nicht gebraucht?
     * 
     */
    public void spinnerAjaxListener() {
        System.out.println("spinnerAjaxListener aufgerufen");
        for (Flower i : contents) {
            System.out.println("Preis des Produkts "+i.getPrice());
            System.out.println("Übergebener Wert Amount: "+amount);
            i.setTotalPrice(i.getPrice()* amount);
        }
    }
    
    public float getOverAllPrice() {
        System.out.println("Aufruf getOverAllPrice()");
        overAllPrice=0;
        for(Flower i: contents){
            System.out.println("Artikel: "+i.getName()+" Totalpreis: "+i.getTotalPrice());
            overAllPrice += i.getTotalPrice();
        }
        return overAllPrice;
    }
    


    public ArrayList<Flower> getContents() {
        return contents;
    }
    
    public void setContents(ArrayList<Flower> contents) {
    this.contents = contents;
    }


    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

        /**
     * Get the value of amount
     *
     * @return the value of amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Set the value of amount
     *
     * @param amount new value of amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
private boolean inShoppingCart;

    /**
     * Get the value of inShoppingCart
     *
     * @return the value of inShoppingCart
     */
    public boolean isInShoppingCart() {
        return inShoppingCart;
    }

    /**
     * Set the value of inShoppingCart
     *
     * @param inShoppingCart new value of inShoppingCart
     */
    public void setInShoppingCart(boolean inShoppingCart) {
        this.inShoppingCart = inShoppingCart;
    }
    
     /**
     * Get the value of deliveryDate
     *
     * @return the value of deliveryDate
     */
    public Date getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Set the value of deliveryDate
     *
     * @param deliveryDate new value of deliveryDate
     */
    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    
     /**
     * Get the value of overAllPrice
     *
     * @return the value of overAllPrice
     */


    /**
     * Set the value of overAllPrice
     *
     * @param overAllPrice new value of overAllPrice
     */
    public void setOverAllPrice(float overAllPrice) {
        this.overAllPrice = overAllPrice;
        
    }
}
