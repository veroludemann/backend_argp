
package com.backend.Back.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Experiencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(String FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public String getFechaEgreso() {
        return FechaEgreso;
    }

    public void setFechaEgreso(String FechaEgreso) {
        this.FechaEgreso = FechaEgreso;
    }
    
  
  
}
