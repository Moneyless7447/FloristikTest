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
 * Name:            ProductBean
 * Aufgabe:         Repräsentierung Backend für die Produktübersicht
 *                  Erstellt Flowerobjekte für die Produktliste
 * Version:         1.0
 * Letzte Änderung: 01.05.2022
 * Realisierung     Sascha Nickel
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
        Flower flower3 = new Flower("Brennesseln",99.0f);
        flowers = new ArrayList<>();
        flowers.add(flower1);
        flowers.add(flower2);
        flowers.add(flower3);
    }
    
    /**
     * Gibt Liste der Flowers bzw. Blumen zurück
     *
     * 
     * @return
     */
    public List<Flower> getFlowers() {
        return flowers;
    }
    
    
    /**
     * Gibt das Objekt mit dem richtigen Namen zurück
     *
     * @param name
     * @return
     */
    public Flower getFlowerByID(String name){
        for(Flower f: this.flowers){
            if(f.getName().equals(name)){
                return f;
            }
        }
        return null;
    }
}
