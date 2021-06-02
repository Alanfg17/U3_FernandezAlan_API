package edu.utez.p1.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.utez.p1.entity.Persona;
import edu.utez.p1.repository.PersonaRepository;




@Service
public class personaService {
	
	@Autowired
	private PersonaRepository personaRepository ;

	public Persona findPersonaByCURP(String CURP) {
		return personaRepository.findByCURP(CURP);
	}

	public boolean save(Persona persona) {
		persona.setFechaRegistro(new Date());
		Persona auxPersona = personaRepository.save(persona);
		return personaRepository.existsById(auxPersona.getIdPersona());
	}
	
	public boolean delete(long id) {
		personaRepository.delete(getById(id));
		return !personaRepository.existsById(id);
	}
	
	public boolean exist(long id) {
		return personaRepository.existsById(id);
	}
	
	public Persona getById(long id) {
		return personaRepository.findById(id).get();
	}
	
	  public List<Persona> getAll() {
	       return personaRepository.findAll();
	   
	    }
}
