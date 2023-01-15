package com.portfolio.BackEnd.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class hys {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int porcentaje;
    private String tipoSkill;

    public hys() {
    }

    public hys(String nombre, int porcentaje, String tipoSkill) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.tipoSkill = tipoSkill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

