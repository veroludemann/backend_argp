
package com.backend.Back.Security.Service;

import com.backend.Back.Security.Entity.Usuario;
import com.backend.Back.Security.Entity.UsuarioPrincipal;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



@Service
public class UserDetailsImpl implements UserDetailsService {
    
    @Autowired
    UsuarioService usuarioService;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
    Usuario usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
    return UsuarioPrincipal.build(usuario);
    }
    
}