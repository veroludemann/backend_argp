
package com.backend.Back.Repository;

import com.backend.Back.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EducacionRepository extends JpaRepository<Educacion, Long> {
    
    public void deleteEducacionById(Long id);

    public Optional <Educacion> findEducacionById(Long id);
    
}
    

