package com.portfolio.BackEnd.Controller;


import com.portfolio.BackEnd.Dto.dtoEducacion;
import com.portfolio.BackEnd.Dto.dtoProyectos;
import com.portfolio.BackEnd.Dto.dtoRedes;
import com.portfolio.BackEnd.Entity.Educacion;
import com.portfolio.BackEnd.Entity.Proyectos;
import com.portfolio.BackEnd.Entity.Redes;
import com.portfolio.BackEnd.Security.Controller.Mensaje;
import com.portfolio.BackEnd.Service.SRedes;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://portfolioalancoelho.web.app")
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/redes")
public class CRedes {

    @Autowired
    private SRedes redesService;

    @GetMapping("/lista")
    public ResponseEntity<List<Redes>> list() {
        List<Redes> list = redesService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Redes> getById(@PathVariable("id")int id){
        if(!redesService.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }

        Redes redes = redesService.getOne(id).get();
        return new ResponseEntity(redes, HttpStatus.OK);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!redesService.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        redesService.delete(id);
        return new ResponseEntity(new Mensaje("Red eliminada"), HttpStatus.OK);
    }


    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoRedes dtoredes){
        if(StringUtils.isBlank(dtoredes.getNombreR())){
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(redesService.existsByNombreR(dtoredes.getNombreR())){
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }

        Redes redes = new Redes(
                dtoredes.getNombreR(),
                dtoredes.getUrlRed(),
                dtoredes.getUrlIcon()
        );
        redesService.save(redes);
        return new ResponseEntity(new Mensaje("Red Creada"), HttpStatus.OK);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoRedes dtoredes){
        if(!redesService.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        if(redesService.existsByNombreR(dtoredes.getNombreR()) && redesService.getByNombreR(dtoredes.getNombreR()).get().getId() != id){
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(dtoredes.getNombreR())){
            return new ResponseEntity(new Mensaje("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);
        }

        Redes redes = redesService.getOne(id).get();

        redes.setNombreR(dtoredes.getNombreR());
        redes.setUrlRed(dtoredes.getUrlRed());
        redes.setUrlIcon(dtoredes.getUrlIcon());

        redesService.save(redes);

        return new ResponseEntity(new Mensaje("Red actualizada"), HttpStatus.OK);
    }

}
