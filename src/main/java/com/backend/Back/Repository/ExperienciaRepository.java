
package com.backend.Back.Repository;


import com.backend.Back.Entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long>  {
    void deleteExperienciaById(Long id);

    public Experiencia findExperienciaById(Long id);

  
    
}
