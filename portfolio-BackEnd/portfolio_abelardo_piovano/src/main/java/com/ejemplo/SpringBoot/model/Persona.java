
package com.ejemplo.SpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String nombre;
    private String descripcion;
    private String url_cv;
    public Persona(){
    }
    
    public Persona(Long id, String nombre, String descripcion, String url_cv){
    
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.url_cv = url_cv;
    }
    
}


