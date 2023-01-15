package com.portfolio.BackEnd.Dto;

import javax.validation.constraints.NotBlank;

public class dtoHys {
    @NotBlank
    private String nombre;
    @NotBlank
    private int porcentaje;

    @NotBlank
    private String tipoSkill;
    public dtoHys() {
    }

    public dtoHys(String nombre, int porcentaje, String tipoSkill) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.tipoSkill = tipoSkill;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getTipoSkill() {
        return tipoSkill;
    }

    public void setTipoSkill(String tipoSkill) {
        this.tipoSkill = tipoSkill;
    }
}