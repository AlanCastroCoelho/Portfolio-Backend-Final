package com.portfolio.BackEnd.Dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class dtoPersona {

    @NotBlank
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;

    @NotBlank
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String apellido;

    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String img;

    private String sobreMi;

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String img, String sobreMi) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.sobreMi = sobreMi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getSobreMi() {
        return sobreMi;
    }

    public void setSobreMi(String sobreMi) {
        this.sobreMi = sobreMi;
    }
}

