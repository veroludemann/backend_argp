package com.backend.Back.Controller;

import com.backend.Back.Entity.Persona;
import com.backend.Back.Service.ImpPersonaService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;

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
@RequestMapping("/persona")
        
public class PersonaController {
    
    @Autowired ImpPersonaService impPersonaService;
    
     @GetMapping("/all")
    public ResponseEntity<List<Persona>> getAllPersonas(){
        List<Persona> personas = impPersonaService.findAllPersonas();
        return new ResponseEntity<>(personas, HttpStatus.OK);
    }
    
     @GetMapping("/find/{id}")
    public ResponseEntity<Persona> getPersonById(@PathVariable("id") Long id) {
        Persona person = impPersonaService.findPersonaById(id);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public ResponseEntity<Persona> addPersona(@RequestBody Persona persona) {
        Persona newPersona = impPersonaService.addPersona(persona);
        return new ResponseEntity<>(newPersona, HttpStatus.CREATED);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/edit")
    public ResponseEntity<Persona> editPersona(@RequestBody Persona persona) {
        Persona editPersona = impPersonaService.editPersona(persona);
        return new ResponseEntity<>(editPersona, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePersona(@PathVariable("id") Long id) {
        impPersonaService.deletePersona(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
