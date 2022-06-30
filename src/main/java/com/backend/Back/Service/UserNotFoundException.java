
package com.backend.Back.Service;



public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String mensaje) {
        super(mensaje);
    }
    
}
