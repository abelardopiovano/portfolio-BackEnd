
package com.ejemplo.SpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Habilidades {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String habilidad;
    private String url_habilidad;
    private Long persona_id;
    public Habilidades(){
    }
    
    public Habilidades(Long id, String habilidad, String url_habilidad, Long persona_id){
    
        this.id = id;
        this.habilidad = habilidad;
        this.url_habilidad = url_habilidad;
        this.persona_id = persona_id;
    }
    
}
