
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Educacion;
import com.ejemplo.SpringBoot.repository.EducacionRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EducacionService implements IEducacionService {
    
    @Autowired
    public EducacionRepository eduRepo;
    
    @Override
    public List<Educacion> findAll() 
    {
       return (List<Educacion>) eduRepo.findAll();
    }

    @Override
    public Educacion save(Educacion ed) {
       return eduRepo.save(ed);
    }

    @Override
    public void delete(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion findById(Long id) {
        return eduRepo.findById(id).orElse(null);
    }
    
    
    

    
     
}
