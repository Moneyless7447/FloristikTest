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
 * Name:            SelectOneMenuViewTime
 * Aufgabe:         Dropdown Menü für die Uhrzeiten 09:00 - 18:00
 * Version:         1.0
 * Letzte Änderung: 01.05.2022
 * Realisierung     Sascha Nickel
 */
@Named
@RequestScoped
public class SelectOneMenuViewTime {
     
   
     
    private String time;  
    private List<SelectItem> times;
         
     
    @PostConstruct
    public void init() {
       
        
        SelectItem g1 = new SelectItem("09:00");
        SelectItem g2 = new SelectItem("10:00");   
        SelectItem g3 = new SelectItem("11:00");
        SelectItem g4 = new SelectItem("12:00");
        SelectItem g5 = new SelectItem("13:00");
        SelectItem g6 = new SelectItem("14:00");   
        SelectItem g7 = new SelectItem("15:00");
        SelectItem g8 = new SelectItem("16:00");
        SelectItem g9 = new SelectItem("17:00");
        SelectItem g10 = new SelectItem("18:00");
 
        times = new ArrayList<SelectItem>();
        times.add(g1);
        times.add(g2);
        times.add(g3);
        times.add(g4);
        times.add(g5);
        times.add(g6);
        times.add(g7);
        times.add(g8);
        times.add(g9);
        times.add(g10);
    }
    /**
     * Get the value of time
     *
     * @return the value of time
     */
    public String getTime() {
        return time;
    }
     /**
     * Set the value of Time
     *
     * @param time new value of time
     */
    public void setTime(String time) {
        this.time = time;
    }
         /**
     * Get the list of Times
     *
     * @return the list of times
     */
    public List<SelectItem> getTimes() {
        return times;
    }
}