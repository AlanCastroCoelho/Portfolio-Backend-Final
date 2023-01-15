package com.portfolio.BackEnd.Service;


import com.portfolio.BackEnd.Entity.Proyectos;
import com.portfolio.BackEnd.Repository.RProyectos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SProyectos {

    @Autowired
    RProyectos rProyectos;

    public List<Proyectos> list(){
        return rProyectos.findAll();
    }

    public Optional<Proyectos> getOne(int id){
        return rProyectos.findById(id);
    }

    public Optional<Proyectos> getByNmbreP(String nombreP){
        return rProyectos.findByNombreP(nombreP);
    }

    public void save(Proyectos proyectos){
        rProyectos.save(proyectos);
    }

    public void delete(int id){
        rProyectos.deleteById(id);
    }

    public boolean existsById(int id){
        return rProyectos.existsById(id);
    }

    public boolean existsByNombreP(String nombreP){
        return rProyectos.existsByNombreP(nombreP);
    }
}