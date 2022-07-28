
package com.backend.Back.Service;

import com.backend.Back.Entity.Experiencia;
import com.backend.Back.Repository.ExperienciaRepository;
import java.util.List;
import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ExperienciaService {
    
    @Autowired
    private ExperienciaRepository experienciaRepository;
    
       
    public List<Experiencia> findAllExperiencias(){
        return experienciaRepository.findAll();
    }
    
     public Experiencia addExperiencia(Experiencia experiencia){
        return experienciaRepository.save(experiencia);
    }
     
     public void deleteExperiencia(Long id) {
        experienciaRepository.deleteExperienciaById(id);
    }
     
     public Experiencia findExperienciaById(Long id) {
        return experienciaRepository.findExperienciaById(id).orElseThrow(
        () -> new UserNotFoundException("Educacion " + id + "no existe"));
    }
     
      public Experiencia editExperiencia(Experiencia experiencia) {
        try {
            findExperienciaById(experiencia.getId());
        } catch (Exception e) {
            return new Experiencia();
        }
        return experienciaRepository.save(experiencia);
    }
}
