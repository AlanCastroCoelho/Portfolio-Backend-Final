package com.portfolio.BackEnd.Service;

import com.portfolio.BackEnd.Entity.Redes;
import com.portfolio.BackEnd.Repository.RRedes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SRedes {

    @Autowired
    private RRedes redesRepository;

    public List<Redes> list() {
        return redesRepository.findAll();
    }

    public Optional<Redes> getOne(int id){
        return redesRepository.findById(id);
    }

    public boolean existsById(int id){
        return redesRepository.existsById(id);
    }

    public Redes save(Redes redes) {
        return redesRepository.save(redes);
    }

    public void delete(int id) {
        redesRepository.deleteById(id);
    }

    public Optional<Redes> getByNombreR(String nombreR){
        return redesRepository.findByNombreR(nombreR);
    }

    public boolean existsByNombreR(String nombreR){
        return redesRepository.existsByNombreR(nombreR);
    }
}
