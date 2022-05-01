/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.test;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import com.mycompany.test.Service;
import java.util.ArrayList;
import javax.annotation.PostConstruct;

/**
 * Name:            ServiceBean
 * Aufgabe:         Repräsentierung Backend für Service
 *                  Erstellt Liste an Services
 * Version:         1.0
 * Letzte Änderung: 01.05.2022
 * Realisierung     Sascha Nickel
 */
@Named(value = "serviceBean")
@RequestScoped
public class ServiceBean {

    private ArrayList<Service> services;
    /**
     * Creates a new instance of ProductBean
     */
    public ServiceBean() {

    }
    
    /**
     * Erstellt Liste an Services
     *
     * 
     * 
     */
    @PostConstruct  
    public void init() {
        Service service1 = new Service("Hochzeitspaket",3.0f);
        Service service2 = new Service("Friedhofsbegrünung",5.0f);
        services = new ArrayList<>();
        services.add(service1);
        services.add(service2);
    }
    public List<Service> getServices() {
        return services;
    }
    
    
}
