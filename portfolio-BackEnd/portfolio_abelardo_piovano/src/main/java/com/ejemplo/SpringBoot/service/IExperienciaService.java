package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Experiencia;
import java.util.List;





public interface IExperienciaService{
    
    public List<Experiencia> findAll();
    public Experiencia save(Experiencia exp);
    public Experiencia findById(Long id);
    public void delete(Long id);
        
}