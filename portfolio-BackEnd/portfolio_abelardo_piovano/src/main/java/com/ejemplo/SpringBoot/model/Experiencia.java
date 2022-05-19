
package com.ejemplo.SpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Experiencia {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String nombreEmpresa;
    private String cargo;
    private String descripcion;
    private Long persona_id;
    public Experiencia(){
    }
    
    public Experiencia(Long id, String nombreEmpresa,String cargo, String descripcion, Long persona_id){
    
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.cargo = cargo;
        this.descripcion = descripcion;
        this.persona_id = persona_id;
    }
    
}