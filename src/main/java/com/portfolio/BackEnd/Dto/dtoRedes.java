package com.portfolio.BackEnd.Dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class dtoRedes {

    private String nombreR;

    private String urlRed;

    private String urlIcon;

    //Constructores
    public dtoRedes() {
    }

    public dtoRedes(String nombreR, String urlRed, String urlIcon) {
        this.nombreR = nombreR;
        this.urlRed = urlRed;
        this.urlIcon = urlIcon;
    }

    public String getNombreR() {
        return nombreR;
    }

    public String getUrlIcon() {
        return urlIcon;
    }

    public void setUrlIcon(String urlIcon) {
        this.urlIcon = urlIcon;
    }

    public void setNombreR(String nombreR) {
        this.nombreR = nombreR;
    }

    public String getUrlRed() {
        return urlRed;
    }

    public void setUrlRed(String urlRed) {
        this.urlRed = urlRed;
    }
}
