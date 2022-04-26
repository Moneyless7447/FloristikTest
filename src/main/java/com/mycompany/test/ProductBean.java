/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.test;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import com.mycompany.test.Flower;
import java.util.ArrayList;
import javax.annotation.PostConstruct;

/**
 *
 * @author Sascha Nickel
 */
@Named(value = "productBean")
@RequestScoped
public class ProductBean {

    private ArrayList<Flower> flowers;
    /**
     * Creates a new instance of ProductBean
     */
    public ProductBean() {

    }
    @PostConstruct  
    public void init() {
        Flower flower1 = new Flower("Gänseblümchen",3.0f);
        Flower flower2 = new Flower("Flieder",5.0f);
        flowers = new ArrayList<>();
        flowers.add(flower1);
        flowers.add(flower2);
    }
    public List<Flower> getFlowers() {
        return flowers;
    }
    
    
}
