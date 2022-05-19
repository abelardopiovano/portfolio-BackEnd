package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Educacion;
import java.util.List;





public interface IEducacionService{
    
    public List<Educacion> findAll();
    public Educacion save(Educacion ed);
    public Educacion findById(Long id);
    public void delete(Long id);
        
}