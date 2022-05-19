
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Habilidades;
import com.ejemplo.SpringBoot.repository.HabilidadesRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class HabilidadesService implements IHabilidadesService {
    
    @Autowired
    public HabilidadesRepository habRepo;
    
    @Override
    public List<Habilidades> findAll() 
    {
       return (List<Habilidades>) habRepo.findAll();
    }

    @Override
    public Habilidades save(Habilidades ha) {
       return habRepo.save(ha);
    }

    @Override
    public void delete(Long id) {
        habRepo.deleteById(id);
    }

    @Override
    public Habilidades findById(Long id) {
        return habRepo.findById(id).orElse(null);
    }
    
    
    

    
     
}
