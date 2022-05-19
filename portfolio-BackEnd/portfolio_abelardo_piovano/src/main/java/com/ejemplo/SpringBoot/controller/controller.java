
package com.ejemplo.SpringBoot.controller;
import com.ejemplo.SpringBoot.model.Educacion;
import com.ejemplo.SpringBoot.model.Experiencia;
import com.ejemplo.SpringBoot.model.Habilidades;
import com.ejemplo.SpringBoot.model.Persona;
import com.ejemplo.SpringBoot.model.Proyecto;
import com.ejemplo.SpringBoot.service.IEducacionService;
import com.ejemplo.SpringBoot.service.IExperienciaService;
import com.ejemplo.SpringBoot.service.IHabilidadesService;
import com.ejemplo.SpringBoot.service.IPersonaService;
import com.ejemplo.SpringBoot.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")

public class controller {
    
    @Autowired
    private IPersonaService persoServ;
    
//--------------------------------------------------------------------------//    
    @GetMapping ("/persona")
    @ResponseBody
    public List<Persona> Personas(){
        return persoServ.findAll();
    }
    
    @PostMapping ("/persona")
    public Persona postPersonas(@RequestBody Persona per)
    {
        return persoServ.save(per);
    }
    
    @GetMapping("/persona/{id}")
    public Persona getPersona(@PathVariable Long id)
    {
       return persoServ.findById(id);
    }
    
    @PutMapping("/persona/{id}")
    public Persona putPersona(@RequestBody Persona per,@PathVariable Long id)
    {
        Persona PersonaActual=persoServ.findById(id);
        //PersonaActual.setId(per.getId());
        PersonaActual.setNombre(per.getNombre());
        PersonaActual.setDescripcion(per.getDescripcion());
        PersonaActual.setUrl_cv(per.getUrl_cv());
        
        
        
        return persoServ.save(PersonaActual);
        
    }

    @DeleteMapping("/persona/{id}")
    public void deletePersona(@PathVariable Long id){
        persoServ.delete(id);
    }
//--------------------------------------------------------------------------//
    @Autowired
    private IExperienciaService expeServ;
    
    @GetMapping ("/experiencia")
    @ResponseBody
    public List<Experiencia> Experiencias(){
        return expeServ.findAll();
    }
    
    @PostMapping ("/experiencia")
    public Experiencia postExperiencias(@RequestBody Experiencia exp)
    {
        return expeServ.save(exp);
    }
    
    @GetMapping("/experiencia/{id}")
    public Experiencia getExperiencia(@PathVariable Long id)
    {
       return expeServ.findById(id);
    }
    
    @PutMapping("/experiencia/{id}")
    public Experiencia Experiencia(@RequestBody Experiencia exp,@PathVariable Long id)
    {
        Experiencia ExperienciaActual=expeServ.findById(id);
        //ExperienciaActual.setId(exp.getId());
        ExperienciaActual.setNombreEmpresa(exp.getNombreEmpresa());
        ExperienciaActual.setCargo(exp.getCargo());
        ExperienciaActual.setDescripcion(exp.getDescripcion());
        //ExperienciaActual.setId_persona(exp.getId_persona());
        
        
        
        
        return expeServ.save(ExperienciaActual);
        
    }

    @DeleteMapping("/experiencia/{id}")
    public void deleteExperiencia(@PathVariable Long id){
        expeServ.delete(id);
    }
//--------------------------------------------------------------------------//
@Autowired
    private IEducacionService eduServ;
    
    @GetMapping ("/educacion")
    @ResponseBody
    public List<Educacion> Educaciones(){
        return eduServ.findAll();
    }
    
    @PostMapping ("/educacion")
    public Educacion postEducaciones(@RequestBody Educacion ed)
    {
        return eduServ.save(ed);
    }
    
    @GetMapping("/educacion/{id}")
    public Educacion getEducaciones(@PathVariable Long id)
    {
       return eduServ.findById(id);
    }
    
    @PutMapping("/educacion/{id}")
    public Educacion Educacion(@RequestBody Educacion ed,@PathVariable Long id)
    {
        Educacion EducacionActual=eduServ.findById(id);
        //ExperienciaActual.setId(exp.getId());
        EducacionActual.setNombreInst(ed.getNombreInst());
        EducacionActual.setTitulo(ed.getTitulo());
        EducacionActual.setDescripcion(ed.getDescripcion());
        //ExperienciaActual.setId_persona(exp.getId_persona());
        
        
        
        
        return eduServ.save(EducacionActual);
        
    }

    @DeleteMapping("/educacion/{id}")
    public void deleteEducacion(@PathVariable Long id){
        eduServ.delete(id);
    }
//--------------------------------------------------------------------------//
@Autowired
    private IProyectoService proServ;
    
    @GetMapping ("/proyecto")
    @ResponseBody
    public List<Proyecto> Proyectos(){
        return proServ.findAll();
    }
    
    @PostMapping ("/proyecto")
    public Proyecto postProyectos(@RequestBody Proyecto pr)
    {
        return proServ.save(pr);
    }
    
    @GetMapping("/proyecto/{id}")
    public Proyecto getProyectos(@PathVariable Long id)
    {
       return proServ.findById(id);
    }
    
    @PutMapping("/proyecto/{id}")
    public Proyecto Proyecto(@RequestBody Proyecto pr,@PathVariable Long id)
    {
        Proyecto ProyectoActual=proServ.findById(id);
        //ExperienciaActual.setId(exp.getId());
        ProyectoActual.setUrl_imagen(pr.getUrl_imagen());
        ProyectoActual.setNombreProyecto(pr.getNombreProyecto());
        ProyectoActual.setDescripcion(pr.getDescripcion());
        ProyectoActual.setUrl_proyecto(pr.getUrl_proyecto());
        //ExperienciaActual.setId_persona(exp.getId_persona());
        
        
        
        
        return proServ.save(ProyectoActual);
        
    }

    @DeleteMapping("/proyecto/{id}")
    public void deleteProyecto(@PathVariable Long id){
        proServ.delete(id);
    }
//--------------------------------------------------------------------------//
@Autowired
    private IHabilidadesService habServ;
    
    @GetMapping ("/habilidades")
    @ResponseBody
    public List<Habilidades> Habilidades(){
        return habServ.findAll();
    }
    
    @PostMapping ("/habilidades")
    public Habilidades postHabilidades(@RequestBody Habilidades ha)
    {
        return habServ.save(ha);
    }
    
    @GetMapping("/habilidades/{id}")
    public Habilidades getHabilidades(@PathVariable Long id)
    {
       return habServ.findById(id);
    }
    
    @PutMapping("/habilidades/{id}")
    public Habilidades Habilidades(@RequestBody Habilidades ha,@PathVariable Long id)
    {
        Habilidades HabilidadesActual=habServ.findById(id);
        //ExperienciaActual.setId(exp.getId());
        HabilidadesActual.setHabilidad(ha.getHabilidad());
        
        HabilidadesActual.setUrl_habilidad(ha.getUrl_habilidad());
        
        //ExperienciaActual.setId_persona(exp.getId_persona());
        
        
        
        
        return habServ.save(HabilidadesActual);
        
    }

    @DeleteMapping("/habilidades/{id}")
    public void deleteHabilidades(@PathVariable Long id){
        habServ.delete(id);
    }
//--------------------------------------------------------------------------//
    
}
