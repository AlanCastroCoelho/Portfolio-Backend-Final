package com.portfolio.BackEnd.Repository;

import com.portfolio.BackEnd.Entity.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RProyectos extends JpaRepository<Proyectos, Integer> {

    public Optional<Proyectos> findByNombreP(String nombreP);
    public boolean existsByNombreP(String nombreP);
}
