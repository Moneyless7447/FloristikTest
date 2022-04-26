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
 *
 * @author Sascha Nickel
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
    @PostConstruct  
    public void init() {
        Service service1 = new Service("Hochzeitspaket",3.0f);
        Service service2 = new Service("Friedhofbegrünung",5.0f);
        services = new ArrayList<>();
        services.add(service1);
        services.add(service2);
    }
    public List<Service> getServices() {
        return services;
    }
    
    
}
