/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
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
    
    private float price;
    
    private int amount;




    @Inject
    private ProductBean flowers;
    
        /**
     * Creates a new instance of ShoppingCartBean
     */
    public ShoppingCartBean() {
        contents = new ArrayList <>();
    }
    
    public void add(String name){
       
        
        Flower f = flowers.getFlowerByID(name);
        f.setAmount(amount);
        System.out.println("Anzahl:" + amount);
        if (f != null){
            this.contents.add(new Flower(f.getName(), f.getPrice(),amount));
            System.out.println("Produkt hinzugefügt");
        }
        else{
            System.out.println("Produkt nicht gefunden");
        }
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

}
