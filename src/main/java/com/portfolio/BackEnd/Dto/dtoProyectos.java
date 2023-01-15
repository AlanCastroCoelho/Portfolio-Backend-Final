package com.portfolio.BackEnd.Dto;

import javax.validation.constraints.NotBlank;

public class dtoProyectos {

    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;

    private String urlImg;

    private String urlRepo;
    private String urlLiveDemo;

    public dtoProyectos() {
    }

    public dtoProyectos(String nombreP, String descripcionP, String urlImg, String urlRepo, String urlLiveDemo) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.urlImg = urlImg;
        this.urlRepo = urlRepo;
        this.urlLiveDemo = urlLiveDemo;
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
