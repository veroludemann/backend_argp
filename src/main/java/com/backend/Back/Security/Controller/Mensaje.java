package com.backend.Back.Security.Controller;

public class Mensaje {

    private String mensaje;

    //constructores//
    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    //getter y setter//
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
