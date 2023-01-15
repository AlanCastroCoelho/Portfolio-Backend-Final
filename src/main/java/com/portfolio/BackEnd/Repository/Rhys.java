package com.portfolio.BackEnd.Repository;

import com.portfolio.BackEnd.Entity.hys;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Rhys extends JpaRepository<hys, Integer> {
    Optional<hys> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);

}

