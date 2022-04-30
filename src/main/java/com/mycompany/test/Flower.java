/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author Sascha Nickel
 */
public class Flower {
    private Flower flower;
    private String name;
    private float price;
    
    private float totalPrice;

   

    private int amount;
    
    public Flower(String name, float price){
    this.name=name;
    this.price=price;
    }
    
    public Flower(String name, float price, int amount){
    this.name=name;
    this.price=price;
    this.amount=amount;
    this.totalPrice=price*amount;
    
    
    }

    public void setTotalPrice(){
        this.totalPrice = flower.getPrice()*amount;
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
        this.totalPrice=price*amount;
    }

    
    


    /**
     * Get the value of price
     *
     * @return the value of price
     */
    public float getPrice() {
        return price;
    }

    /**
     * Set the value of price
     *
     * @param price new value of price
     */
    public void setPrice(float price) {
        this.price = price;
        this.totalPrice=price*amount;
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
     * Get the value of totalPrice
     *
     * @return the value of totalPrice
     */
    public float getTotalPrice() {
        return totalPrice;
    }

    /**
     * Set the value of totalPrice
     *
     * @param totalPrice new value of totalPrice
     */
    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

}
