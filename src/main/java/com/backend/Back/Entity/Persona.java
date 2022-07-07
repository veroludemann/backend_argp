package com.backend.Back.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter 
@Setter        

public class Persona implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String img;
    private String sobremi;
    
    
     public Persona() {
    }
     
      public Persona(Long id, String nombre, String apellido,String img,String sobremi) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.sobremi = sobremi;
      }
      
         @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido=" + apellido + '\'' +
                ", img=" + img + '\'' +
                ", sobremi=" + sobremi + '\'' +
            '}';
    }
 }

  
