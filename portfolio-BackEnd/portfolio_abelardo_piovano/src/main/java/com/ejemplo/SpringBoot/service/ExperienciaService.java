
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Experiencia;
import com.ejemplo.SpringBoot.repository.ExperienciaRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ExperienciaService implements IExperienciaService {
    
    @Autowired
    public ExperienciaRepository expeRepo;
    
    @Override
    public List<Experiencia> findAll() 
    {
       return (List<Experiencia>) expeRepo.findAll();
    }

    @Override
    public Experiencia save(Experiencia exp) {
       return expeRepo.save(exp);
    }

    @Override
    public void delete(Long id) {
        expeRepo.deleteById(id);
    }

    @Override
    public Experiencia findById(Long id) {
        return expeRepo.findById(id).orElse(null);
    }
    
    
    

    
     
}
