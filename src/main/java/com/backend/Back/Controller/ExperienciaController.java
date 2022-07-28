
package com.backend.Back.Controller;

import com.backend.Back.Entity.Experiencia;
import com.backend.Back.Service.ExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("experiencia")

public class ExperienciaController {

    @Autowired
    ExperienciaService experienciaService;
    
    @GetMapping("/all")
    public ResponseEntity <List<Experiencia>> getAllExperiencia () {
        List<Experiencia> experiencias = experienciaService.findAllExperiencias();
        return new ResponseEntity<>(experiencias, HttpStatus.OK);
    }
    
    @GetMapping("/find/{id}")
    public ResponseEntity <Experiencia> getExperienciaById (@PathVariable("id") Long id) {
        Experiencia experiencia = experienciaService.findExperienciaById(id);
        return new ResponseEntity<>(experiencia, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity <Experiencia> addExperiencia(@RequestBody Experiencia experiencia){
        Experiencia newExperiencia = experienciaService.addExperiencia(experiencia);
        return new ResponseEntity<>(newExperiencia, HttpStatus.CREATED);
    }
    
    @PutMapping("/update")
    public ResponseEntity <Experiencia> updateExperiencia(@RequestBody Experiencia experiencia){
        Experiencia updateExperiencia = experienciaService.updateExperiencia(experiencia);
        return new ResponseEntity<>(updateExperiencia, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity <?> deleteExperiencia(@PathVariable("id") Long id){
        experienciaService.deleteExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
