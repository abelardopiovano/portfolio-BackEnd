package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Habilidades;
import java.util.List;





public interface IHabilidadesService{
    
    public List<Habilidades> findAll();
    public Habilidades save(Habilidades hab);
    public Habilidades findById(Long id);
    public void delete(Long id);
        
}