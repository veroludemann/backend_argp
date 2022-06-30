
package com.backend.Back.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    
    private String especialidad;
    private String institucion; 
    private String fechainicio;
    private String fechafin;

    public Educacion() {
    }
    
    public Educacion(Long id, String especialidad, String institucion, String fechainicio, String fechafin) {
        this.id = id;
        this.especialidad = especialidad;
        this.institucion = institucion;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
    }
    
     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }
    
}
