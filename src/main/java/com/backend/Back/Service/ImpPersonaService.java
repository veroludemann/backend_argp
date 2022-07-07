package com.backend.Back.Service;

import com.backend.Back.Entity.Persona;
import com.backend.Back.Inteface.IPersonaService;
import com.backend.Back.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService {
    @Autowired IPersonaRepository ipersonaRepositoty;

    
    @Override
    public List<Persona> getPersona() {
       List<Persona> persona = ipersonaRepositoty.findAll();
       return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepositoty.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepositoty.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepositoty.findById(id).orElse(null);
        return persona;
    }
    
}