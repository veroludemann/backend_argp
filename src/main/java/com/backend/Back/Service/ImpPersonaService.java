package com.backend.Back.Service;

import com.backend.Back.Entity.Persona;
import com.backend.Back.Repository.IPersonaRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Transactional
@Service
public class ImpPersonaService{
    private final IPersonaRepository ipersonaRepositoty;
      
    @Autowired 
    public ImpPersonaService(IPersonaRepository ipersonaRepositoty) {
        this.ipersonaRepositoty = ipersonaRepositoty;
    }

 public Persona addPersona(Persona persona) {
        return ipersonaRepositoty.save(persona);
    }

    public List<Persona> findAllPersonas(){
        return ipersonaRepositoty.findAll();
    }

    public Persona editPersona(Persona persona) {
        return ipersonaRepositoty.save(persona);
    }

    public Persona findPersonaById(Long id) {
        return ipersonaRepositoty.findPersonaById(id).orElseThrow(() -> new UserNotFoundException("El usuario de id" + id + "no fue encontrado"));
    }

    public void deletePersona(Long id){

        ipersonaRepositoty.deletePersonaById(id);
    }
    
}