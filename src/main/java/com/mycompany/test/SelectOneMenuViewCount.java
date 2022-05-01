/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;
/**
 * Name:            SelectOneMenuViewCount
 * Aufgabe:         Dropdown Menü von 1 bis 10
 * Version:         1.0
 * Letzte Änderung: 01.05.2022
 * Realisierung     Sascha Nickel
 */
@Named
@RequestScoped
public class SelectOneMenuViewCount {
    
    private String number; 
    private List<SelectItem> numbers;
    
   @PostConstruct
    public void init() {
        
        SelectItem g1 = new SelectItem(1);
        SelectItem g2 = new SelectItem(2);   
        SelectItem g3 = new SelectItem(3);
        SelectItem g4 = new SelectItem(4);
        SelectItem g5 = new SelectItem(5);
        SelectItem g6 = new SelectItem(6);   
        SelectItem g7 = new SelectItem(7);
        SelectItem g8 = new SelectItem(8);
        SelectItem g9 = new SelectItem(9);
        SelectItem g10 = new SelectItem(10);


        numbers = new ArrayList<SelectItem>();
        numbers.add(g1);
        numbers.add(g2);
        numbers.add(g3);
        numbers.add(g4);
        numbers.add(g5);
        numbers.add(g6);
        numbers.add(g7);
        numbers.add(g8);
        numbers.add(g9);
        numbers.add(g10);
    }
    
    
    /**
     * Get the value of number
     *
     * @return the value of number
     */
    
     public String getNumber() {
        return number;
    }
 
    /**
     * Set the value of Number
     *
     * @param number new value of Number
     */
    public void setNumber(String number) {
        this.number = number;
    }
 
     /**
     * Get the list of numbers
     *
     * @return the list of numbers
     */
   
    public List<SelectItem> getNumbers() {
        return numbers;
    }
 
}
