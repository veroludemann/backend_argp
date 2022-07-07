package com.backend.Back.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String img;
    private String sobremi;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String img, String sobremi) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.sobremi = sobremi;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getSobremi() {
        return sobremi;
    }

    public void setSobremi(String sobremi) {
        this.sobremi = sobremi;
    }

    @Override
    public String toString() {
        return "Persona{"
                + "id=" + id
                + ", nombre='" + nombre + '\''
                + ", apellido=" + apellido + '\''
                + ", img=" + img + '\''
                + ", sobremi=" + sobremi + '\''
                + '}';
    }
}
