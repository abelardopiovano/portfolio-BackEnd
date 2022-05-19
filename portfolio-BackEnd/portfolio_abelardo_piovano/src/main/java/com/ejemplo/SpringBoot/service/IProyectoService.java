package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Proyecto;
import java.util.List;





public interface IProyectoService{
    
    public List<Proyecto> findAll();
    public Proyecto save(Proyecto exp);
    public Proyecto findById(Long id);
    public void delete(Long id);
        
}