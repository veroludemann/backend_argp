package com.backend.Back.Inteface;

import com.backend.Back.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de personas//
    public List<Persona> getPersona();
    
    //Guardar un objeto de la lista persona//
    public void savePersona(Persona persona);
    
    //Eeliminar un objeto pero lo biscamos por ID//
    public void deletePersona(Long id);
    
    //Buscar una persona por id//
    public Persona findPersona(Long id);
}