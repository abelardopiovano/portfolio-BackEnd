
package com.ejemplo.SpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Educacion {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String nombreInst;
    private String titulo;
    private String descripcion;
    private Long persona_id;
    public Educacion(){
    }
    
    public Educacion(Long id, String nombreInst,String titulo, String descripcion, Long persona_id){
    
        this.id = id;
        this.nombreInst = nombreInst;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.persona_id= persona_id;
    }
    
}