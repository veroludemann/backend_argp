
package com.backend.Back.Repository;



import com.backend.Back.Entity.Experiencia;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
;

public interface ExperienciaRepository extends JpaRepository<Experiencia, Long> {
    
    public void deleteExperienciaById(Long id);

    public Optional <Experiencia> findExperienciaById(Long id);
    
  
    
}
