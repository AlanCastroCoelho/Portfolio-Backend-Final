package com.portfolio.BackEnd.Service;


import com.portfolio.BackEnd.Entity.Persona;

import com.portfolio.BackEnd.Repository.RPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class Spersona {
    @Autowired
    RPersona ipersona;

    public List<Persona> list(){
        return ipersona.findAll();
    }

    public Optional<Persona> getOne(int id){
        return ipersona.findById(id);
    }

    public Optional<Persona> getbyNombre(String nombre){
        return ipersona.findByNombre(nombre);
    }

    public void save(Persona persona){
        ipersona.save(persona);
    }

    public void delete(int id){
        ipersona.deleteById(id);
    }

    public boolean existsById(int id){
        return ipersona.existsById(id);
    }

    public boolean existsByNombre(String nombre){
        return ipersona.existsByNombre(nombre);
    }
}