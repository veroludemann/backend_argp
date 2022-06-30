
package com.backend.Back.Service;

import com.backend.Back.Entity.Educacion;
import com.backend.Back.Repository.EducacionRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class EducacionService {
    
    @Autowired
    private EducacionRepository educacionRepository;

    public List<Educacion> findAllEducaciones() {
        return educacionRepository.findAll();
    }

    public Educacion addEducacion(Educacion educacion) {
       return educacionRepository.save(educacion);
    }
    
       public void deleteEducacion(Long id) {
         educacionRepository.deleteEducacionById(id);
    }

    
    public Educacion findEducacionById(Long id) {
        return educacionRepository.findEducacionById(id).orElseThrow(
            () -> new UserNotFoundException("Educacion " + id + "no existe"));
    }
    
    
    public Educacion editEducacion(Educacion educacion) {
        try {
            findEducacionById(educacion.getId());
        } catch (Exception e) {
            return new Educacion();
        }
        return educacionRepository.save(educacion);
    }

}
