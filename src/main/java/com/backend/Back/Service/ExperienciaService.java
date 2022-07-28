
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
    private final ExperienciaRepository experienciaRepository;

    @Autowired
    public ExperienciaService(ExperienciaRepository experienciaRepository) {
        this.experienciaRepository = experienciaRepository;
    }
    
    public Experiencia addExperiencia(Experiencia experiencia){
        return experienciaRepository.save(experiencia);
    }
    
    public List<Experiencia> findAllExperiencia(){
        return experienciaRepository.findAll();
    }
      
     public Experiencia editExperiencia(Experiencia experiencia) {
        try {
            findExperienciaById(experiencia.getId());
        } catch (Exception e) {
            return new Experiencia();
        }
        return experienciaRepository.save(experiencia);
    }
  
    public List<Experiencia> findAllExperiencias(){
        return experienciaRepository.findAll();
                  
    }

    public void deleteExperiencia(Long id) {
        experienciaRepository.deleteExperienciaById(id);
    }

    public Experiencia findExperienciaById(Long id) {
        return experienciaRepository.findExperienciaById(id);
         
    }

   
}
