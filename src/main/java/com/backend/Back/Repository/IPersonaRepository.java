package com.backend.Back.Repository;

import com.backend.Back.Entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
      public void deletePersonaById(Long id);

    public Optional <Persona> findPersonaById(Long id);
    
    
}

