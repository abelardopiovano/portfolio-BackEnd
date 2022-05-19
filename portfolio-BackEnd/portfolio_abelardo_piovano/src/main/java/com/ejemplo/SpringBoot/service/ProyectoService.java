
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Proyecto;
import com.ejemplo.SpringBoot.repository.ProyectoRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProyectoService implements IProyectoService {
    
    @Autowired
    public ProyectoRepository proRepo;
    
    @Override
    public List<Proyecto> findAll() 
    {
       return (List<Proyecto>) proRepo.findAll();
    }

    @Override
    public Proyecto save(Proyecto pr) {
       return proRepo.save(pr);
    }

    @Override
    public void delete(Long id) {
        proRepo.deleteById(id);
    }

    @Override
    public Proyecto findById(Long id) {
        return proRepo.findById(id).orElse(null);
    }
    
    
    

    
     
}
