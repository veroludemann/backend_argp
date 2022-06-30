
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
public class Experiencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String empresa;
    private String cargo;
    private String FechaIngreso;
    private String FechaEgreso;
    
    public Experiencia() {
    }

    public Experiencia(Long id, String empresa, String cargo, String FechaIngreso, String FechaEgreso) {
        this.id = id;
        this.empresa = empresa;
        this.cargo = cargo;
        this.FechaIngreso = FechaIngreso;
        this.FechaEgreso = FechaEgreso; 
    }
    
     @Override
    public String toString(){
        return "Experiencia" +
                "id=" + id +
                ",nombre=" + empresa + '\'' +
                ", FechaIngreso=" + FechaIngreso +  '\'' +
                ", FechaEgreso=" + FechaEgreso +  '\'' +
                '}';
    }
    
    
}
