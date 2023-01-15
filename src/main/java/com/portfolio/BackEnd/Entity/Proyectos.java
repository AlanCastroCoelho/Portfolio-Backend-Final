package com.portfolio.BackEnd.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyectos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreP;
    private String descripcionP;

    private String urlImg;

    private String urlRepo;
    private String urlLiveDemo;


    public Proyectos() {
    }

    public Proyectos(String nombreP, String descripcionP, String urlImg, String urlRepo, String urlLiveDemo) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.urlImg = urlImg;
        this.urlRepo = urlRepo;
        this.urlLiveDemo = urlLiveDemo;
    }

    public int getId() {
        return id;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public String getUrlRepo() {
        return urlRepo;
    }

    public void setUrlRepo(String urlRepo) {
        this.urlRepo = urlRepo;
    }

    public String getUrlLiveDemo() {
        return urlLiveDemo;
    }

    public void setUrlLiveDemo(String urlLiveDemo) {
        this.urlLiveDemo = urlLiveDemo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreE) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionE) {
        this.descripcionP = descripcionP;
    }


}

