package com.portfolio.BackEnd.Controller;


import com.portfolio.BackEnd.Dto.dtoProyectos;
import com.portfolio.BackEnd.Entity.Educacion;
import com.portfolio.BackEnd.Entity.Proyectos;
import com.portfolio.BackEnd.Security.Controller.Mensaje;
import com.portfolio.BackEnd.Service.SProyectos;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://portfolioalancoelho.web.app")
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/proyectos")
public class CProyectos {

    @Autowired
    SProyectos sProyectos;

    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list(){
        List<Proyectos> list = sProyectos.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id")int id){
        if(!sProyectos.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }

        Proyectos proyectos = sProyectos.getOne(id).get();
        return new ResponseEntity(proyectos, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!sProyectos.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        sProyectos.delete(id);
        return new ResponseEntity(new Mensaje("Proyecto eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoProyectos dtoproyectos){
        if(StringUtils.isBlank(dtoproyectos.getNombreP())){
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(sProyectos.existsByNombreP(dtoproyectos.getNombreP())){
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }

        Proyectos proyectos = new Proyectos(
                dtoproyectos.getNombreP(), dtoproyectos.getDescripcionP(), dtoproyectos.getUrlImg(),
                dtoproyectos.getUrlRepo(),dtoproyectos.getUrlRepo()
        );
        sProyectos.save(proyectos);
        return new ResponseEntity(new Mensaje("Proyecto Creado"), HttpStatus.OK);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoProyectos dtoproyectos){
        if(!sProyectos.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        if(sProyectos.existsByNombreP(dtoproyectos.getNombreP()) && sProyectos.getByNmbreP(dtoproyectos.getNombreP()).get().getId() != id){
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(dtoproyectos.getNombreP())){
            return new ResponseEntity(new Mensaje("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);
        }

        Proyectos proyectos = sProyectos.getOne(id).get();

        proyectos.setNombreP(dtoproyectos.getNombreP());
        proyectos.setDescripcionP(dtoproyectos.getDescripcionP());
        proyectos.setUrlImg(dtoproyectos.getUrlImg());
        proyectos.setUrlRepo(dtoproyectos.getUrlRepo());
        proyectos.setUrlLiveDemo(dtoproyectos.getUrlLiveDemo());

        sProyectos.save(proyectos);

        return new ResponseEntity(new Mensaje("Proyectos actualizados"), HttpStatus.OK);
    }
}
