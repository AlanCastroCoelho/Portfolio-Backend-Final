package com.portfolio.BackEnd.Repository;

import com.portfolio.BackEnd.Entity.Educacion;
import com.portfolio.BackEnd.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RPersona extends JpaRepository<Persona,Integer> {
    public Optional<Persona> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
