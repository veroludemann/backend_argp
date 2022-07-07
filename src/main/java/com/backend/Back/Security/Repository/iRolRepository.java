
package com.backend.Back.Security.Repository;

import com.backend.Back.Security.Entity.Rol;
import com.backend.Back.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional <Rol> findByRolNombre (RolNombre rolNombre);
    
}
