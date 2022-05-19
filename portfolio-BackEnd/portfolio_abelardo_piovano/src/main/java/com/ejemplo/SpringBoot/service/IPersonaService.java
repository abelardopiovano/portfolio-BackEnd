package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Persona;
import java.util.List;





public interface IPersonaService{
    
    public List<Persona> findAll();
    public Persona save(Persona per);
    public Persona findById(Long id);
    public void delete(Long id);
        
}


