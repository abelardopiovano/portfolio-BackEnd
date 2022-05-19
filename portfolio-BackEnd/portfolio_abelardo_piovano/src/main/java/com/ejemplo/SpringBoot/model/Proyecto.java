
package com.ejemplo.SpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Proyecto {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String url_imagen;
    private String nombreProyecto;
    private String descripcion;
    private String url_proyecto;
    private Long persona_id;
    public Proyecto(){
    }
    
    public Proyecto(Long id,String url_imagen, String nombreProyecto,String descripcion, String url_proyecto, Long persona_id){
    
        this.id = id;
        this.url_imagen=url_imagen;
        this.nombreProyecto = nombreProyecto;
        this.descripcion = descripcion;
        this.url_proyecto= url_proyecto;
        this.persona_id = persona_id;
    }
    
}
