
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Persona;
import com.ejemplo.SpringBoot.repository.PersonaRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    public PersonaRepository persoRepo;
    
    @Override
    public List<Persona> findAll() 
    {
       return (List<Persona>) persoRepo.findAll();
    }

    @Override
    public Persona save(Persona per) {
       return persoRepo.save(per);
    }

    @Override
    public void delete(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona findById(Long id) {
        return persoRepo.findById(id).orElse(null);
    }
    
    
    

    
     
}