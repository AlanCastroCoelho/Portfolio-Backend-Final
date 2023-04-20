package com.portfolio.BackEnd.Repository;

import com.portfolio.BackEnd.Entity.Redes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RRedes extends JpaRepository<Redes, Integer> {
    public Optional<Redes> findByNombreR(String nombreR);
    public boolean existsByNombreR(String nombreR);
}
