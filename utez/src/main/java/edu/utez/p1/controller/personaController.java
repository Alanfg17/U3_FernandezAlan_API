package edu.utez.p1.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.utez.p1.entity.Persona;
import edu.utez.p1.service.personaService;



@RestController
@RequestMapping("persona")
public class personaController {
	@Autowired
	private personaService personaService;
	
	 @GetMapping("/all")
	    public List<Persona> findAll(){
	        return personaService.getAll();
	    }
	 
	 @GetMapping("/{CURP}")
		public Persona persona(@PathVariable String CURP) {
			return personaService.findPersonaByCURP(CURP);
		}
	
		@PostMapping("/save")
		public boolean guardar(@RequestBody Persona person) {

			return personaService.save(person);
		

		}
	
		@PutMapping("/update")
		public boolean actualizar(@RequestBody  Persona person) {
			if (personaService.exist(person.getIdPersona())) {
				return personaService.save(person);
			} else {
				return false;
			}
			
			
		}
	   @DeleteMapping("/delete/{id}")
	    public boolean eliminar( @PathVariable int id ) {   
		  return personaService.delete(id);   
	    }
	 
	 
	 
}
